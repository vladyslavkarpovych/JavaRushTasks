package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println("Добро пожаловать на Арену!");
        System.out.println("Представляю первую команду Зергов:");
        Zerg kerrigan = new Zerg();
        kerrigan.name = "Kerrigan";
        Zerg zagara = new Zerg();
        zagara.name = "Zagara";
        Zerg dehaka = new Zerg();
        dehaka.name = "Dehaka";
        Zerg abathur = new Zerg();
        abathur.name = "Abathur";
        Zerg stukov = new Zerg();
        stukov.name = "Stukov";
        
        Protoss zeratul = new Protoss();
        zeratul.name = "Zeratul";
        Protoss artanis = new Protoss();
        artanis.name = "Artanis";
        Protoss tassadar = new Protoss();
        tassadar.name = "Tassadar";
        
        Terran raynor = new Terran();
        raynor.name = "Raynor";
        Terran tychus = new Terran();
        tychus.name = "Tychus";
        Terran nova = new Terran();
        nova.name = "Nova";
        Terran mengsk = new Terran();
        mengsk.name = "Mengsk";
        
        
        
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
