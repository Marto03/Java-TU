package Sem1;

public class SecondExercise {
    public static void main(String[] args)
    {
        
        int n = 5;
        char s = '*';
        for(int i = 0 ; i < n ; i++)
        {
            for(int k = 0; k <= i; k++)
            {
                System.out.print("\t"+s);
            }
            System.out.println();
        }
    }
    
}
