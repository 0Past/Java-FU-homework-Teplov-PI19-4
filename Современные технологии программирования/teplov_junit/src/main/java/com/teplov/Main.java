package com.teplov;

public class Main {
    public static void main(String[] args) {
        new User("Артем", 20, Gender.MALE);
        new User("Леша", 19, Gender.MALE);
        new User("Аня", 18, Gender.FEMALE);


        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("Все пользователи: MALE");
        User.getAllUsers(Gender.MALE).forEach(System.out::println);
        System.out.println("Все пользователи: FEMALE");
        User.getAllUsers(Gender.FEMALE).forEach(System.out::println);
        System.out.println("всего пользователей");
        System.out.println(User.getHowManyUsers());
        System.out.println("всего пользователей MALE");
        System.out.println(User.getHowManyUsers(Gender.MALE));
        System.out.println("всего пользователей FEMALE");
        System.out.println(User.getHowManyUsers(Gender.FEMALE));
        System.out.println("общий возраст всех пользователей");
        System.out.println(User.getAllAgeUsers());
        System.out.println("общий возраст всех пользователей MALE");
        System.out.println(User.getAllAgeUsers(Gender.MALE));
        System.out.println("общий возраст всех пользователей FEMALE");
        System.out.println(User.getAllAgeUsers(Gender.FEMALE));
        System.out.println("средний возраст всех пользователей");
        System.out.println(User.getAverageAgeOfAllUsers());
        System.out.println("средний возраст всех пользователей MALE");
        System.out.println(User.getAverageAgeOfAllUsers(Gender.MALE));
        System.out.println("средний возраст всех пользователей FEMALE");
        System.out.println(User.getAverageAgeOfAllUsers(Gender.FEMALE));
    }
}
