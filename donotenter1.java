package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) a++;
            }
        System.out.println(a);
        }
    }
