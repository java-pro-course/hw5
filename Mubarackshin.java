import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int temp = 0;
        int[] mas = new int[N];
        for (int i = 0; i < N; i++)
          if (in.nextInt() > 0) temp++;
      
      System.out.println(temp);
    }
}