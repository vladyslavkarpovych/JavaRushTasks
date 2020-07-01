package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        int port = ConsoleHelper.readInt();

        try (ServerSocket ss = new ServerSocket(port)) {


            System.out.println("Сервер запущен");
            while (true) {

                Socket cs = ss.accept();
                Handler handler = new Handler(cs);
                handler.start();

            }
        } catch (IOException e) {
            System.out.println("Ошибочка вышла");
        }

    }

    public static void sendBroadcastMessage(Message message) {
        for (Connection cn : connectionMap.values()) {
            try {
                cn.send(message);

            } catch (IOException e) {
                ConsoleHelper.writeMessage("Ошибка отправки сообщения");
            }
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if (message.getType() == MessageType.USER_NAME) {
                    if (message.getData() != null && !message.getData().isEmpty()) {
                        if (connectionMap.get(message.getData()) == null) {
                            connectionMap.put(message.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return message.getData();
                        }
                    }
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException{
            for (Map.Entry entry:
                    connectionMap.entrySet()) {
                if (!entry.getKey().toString().equals(userName))
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey().toString()));
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true){
                Message ms = connection.receive();
                if (ms.getType() == MessageType.TEXT){
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + ms.getData()));

                }
                else{
                    ConsoleHelper.writeMessage("Ошибка отправки сообщения");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Установлено соединение с удаленным адресом: " + socket.getRemoteSocketAddress());
            try (Connection connection = new Connection(socket);) {
                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);

                serverMainLoop(connection, userName);
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));

            }catch (IOException e){ConsoleHelper.writeMessage("Произошла ошибка");}
            catch (ClassNotFoundException ee ){ConsoleHelper.writeMessage("Произошла ошибка");}
            finally {ConsoleHelper.writeMessage("Пользователь удален");}

        }



    }
}



