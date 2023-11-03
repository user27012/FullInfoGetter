package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Cat extends Animal {
    public static void main(String[] args) {
        Class<?> catClass = Cat.class;


        Class<?> animalClass = catClass.getSuperclass();


        Field[] fields = animalClass.getDeclaredFields();

        System.out.println("Інформація про поля класу Animal:");
        for (Field field : fields) {

            String fieldName = field.getName();
            String fieldType = field.getType().getName();
            String fieldModifiers = Modifier.toString(field.getModifiers());

            System.out.println("Назва поля: " + fieldName);
            System.out.println("Тип даних: " + fieldType);
            System.out.println("Модифікатори доступу: " + fieldModifiers);
        }
    }
}
