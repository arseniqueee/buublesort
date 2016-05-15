package buublesort;
import java.util.Scanner;
import java.lang.System;

public class Buublesort {

    
    public static void main(String[] args) {
        int c, d, n, paws;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Введите кол-во чисел");
        n = scanner.nextInt();
        
        int array[] = new int[n];
        
        
        
        for (c=0; c<(n-1); c++){
            for (d=0; d<n-c-1; d++){
                if (array[d]>array[d+1])
                {
                    paws = array[d];
                    array[d] = array[d+1];
                    array[d+1] = paws;
                
                }
            }
        }
        
    }
}
    

