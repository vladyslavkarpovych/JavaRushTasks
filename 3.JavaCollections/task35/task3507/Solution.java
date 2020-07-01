package com.javarush.task.task35.task3507;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/* 
ClassLoader - что это такое?
*/
public class Solution {
    public static void main(String[] args) {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        Set<Animal> animals = new HashSet<>();
        if (!pathToAnimals.endsWith("\\") && !pathToAnimals.endsWith("/")) pathToAnimals += "/";
        final File f = new File(pathToAnimals);
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".class");
            }
        });
        for (final File file : files) {
            ClassLoader classLoader = new ClassLoader() {
                @Override
                public Class<?> findClass(String name) throws ClassNotFoundException {
                    try {
                        byte[] buffer = java.nio.file.Files.readAllBytes(file.toPath());
                        return defineClass(null, buffer, 0, buffer.length);
                    }
                    catch (IOException e) {
                        return super.findClass(name);
                    }
                }
            };
            String shortName = file.getName().substring(0, file.getName().length() - 6);
            try {
                Class clazz = classLoader.loadClass(shortName);
                boolean hasInterface = false;
                Class[] interfaces = clazz.getInterfaces();
                for (Class c : interfaces) {
                    if (c.equals(Animal.class)) {
                        hasInterface = true;
                        break;
                    }
                }
                if (!hasInterface) continue;
                boolean hasConstructor = false;
                Constructor[] constructors = clazz.getConstructors();
                for (Constructor c : constructors) {
                    if (!Modifier.isAbstract(c.getModifiers()) && Modifier.isPublic(c.getModifiers())) {
                        hasConstructor = true;
                        break;
                    }
                }
                if (!hasConstructor) continue;
                animals.add((Animal) clazz.newInstance());
            }
            catch (ClassNotFoundException | InstantiationException e) {
                e.printStackTrace();
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return animals;
    }
}
