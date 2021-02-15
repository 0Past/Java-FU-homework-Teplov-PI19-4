package com.company;

public class Main {
    public static void main(String[] args) {
        Observable undoble = new Observable();
        undoble.setOnChangeLis(new Listener());
        undoble.append("Work?");
        undoble.append("Work");
        undoble.append("Work!!!");
    }
}
