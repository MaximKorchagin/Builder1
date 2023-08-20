package org.example;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("����")
                .setSurname("�����")
                .setAge(31)
                .setAddress("������")
                .build();
        System.out.println(mom);
        Person dad = new PersonBuilder()
                .setName("batya")
                .setSurname("batkovich")
                .setAge(23)
                .build();
        System.out.println(dad);
        dad.happyBirthday();
        Person son = mom.newChildBuilder()
                .setName("�������")
                .build();
        System.out.println("� " + mom + " ���� ���, " + son);

        try {
            // �� ������� ������������ �����
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // ������� ������������
            new PersonBuilder()
                    .setName("test")
                    .setSurname("test2")
                    .setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}