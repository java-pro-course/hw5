package com.company;
import java.util.Scanner;

public class Main {
static boolean isEven(int i){
      if(i % 2 == 0){
	return true;
      }
	return false;
   }
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int i = in.nextInt();
	for(int a = 1; a <= i; a++){
		if(isEven(a)){
		System.out.println(a);	
	}
	}
   }

}
