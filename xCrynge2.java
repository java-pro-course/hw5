package com.company;
import java.util.Scanner;
public class Main{
	static int x5(int i){
	return i*5;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		System.out.println(x5(i));
	}
  }
