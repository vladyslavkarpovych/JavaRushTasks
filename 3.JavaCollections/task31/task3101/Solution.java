package com.javarush.task.task31.task3101;

import java.io.File;

/*
Проход по дереву файлов
*/
import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        File path = new File(args[0]);
        File outputFileTmp = new File(args[1]);
        File outputFile = new File(outputFileTmp.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(outputFileTmp, outputFile);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            List<File> files = new ArrayList<>();
            Files.walkFileTree(path.toPath(), new FileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (attrs.isRegularFile() && attrs.size() <= 50) {
                        files.add(new File(file.toUri()));
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    return FileVisitResult.SKIP_SUBTREE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }
            });
            files.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
            for (File filePath : files) {
                try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String str;
                    while ((str = reader.readLine()) != null) {
                        System.out.println("\\n exists " + str.endsWith("\n"));
                        writer.write(str);
                        writer.write('\n');
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
