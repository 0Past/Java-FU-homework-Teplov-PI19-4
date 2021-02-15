package com.company;

class Listener implements StrBuilderChLis {
    @Override
    public void Change(Observable stringBuilder) {
        System.out.println("Изменено: " + stringBuilder.toString());
    }
}
