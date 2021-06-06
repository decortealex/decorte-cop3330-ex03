/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class solution03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String quote, author;
        System.out.println("What is the quote? ");

        quote = in.nextLine();

        System.out.println("Who said it? ");

        author = in.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}
