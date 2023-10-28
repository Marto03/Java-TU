package Sem1;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) throws Exception {
        System.out.println("Input 9 numbers:");
        Scanner scan = new Scanner(System.in);
        int n;
        float s = 0;
        for(int i = 0 ; i < 9; i++)
        {
            n = scan.nextInt();
            s += n; 
        }
        System.out.println("Average = "+ (float)s/9);
        scan.close();
    }
}
