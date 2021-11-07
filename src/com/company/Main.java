package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Literature");
        createObject("Novels");
        createObject("Fantastic");
    }
    public static Book createObject(String className) {
        Book book = null ;
        switch (className) {
            case "Literature":
                Literature literature = new Literature("А.С.Пушкин", "Коженная", 1988);
                literature.print();
                System.out.println("________________________");
                break;
            case "Novels":
                Novels novels = new Novels("И.Ж.Жасмин","Скольская",1956);
                novels.print();
                System.out.println("________________________");
                break;
            case "Fantastic":
                Fantastic fantastic = new Fantastic("А.А.Бекзат"," Золотая", 3777);
                fantastic.print();
                break;
        }
        return  book;
    }
}