import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 10; i < 100;i++){
          if(i%10==N || i/10%10==N || i%N==0){
            System.out.println(i);
          }
        }
    }
}