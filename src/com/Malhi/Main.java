package com.Malhi;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	Set<Guest> bookset = new HashSet<>();
	bookset.add(new Guest(20,"Lovepreet", "6475632829"));
        System.out.println(bookset);
    }

}
