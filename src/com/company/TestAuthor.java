package com.company;

import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("JK Rowling", "JK_Rowling@mail.ru", 'f');
        System.out.println(a1.toString());
        Author a2 = new Author("Alexander Dumas","Alexander_Dumas@gmail.com", 'm');
        System.out.println(a2.toString());
        Author a3 = new Author("Shakespeare", "Shakespeare@google.com",'u');
        System.out.println(a3.toString());
    }
}