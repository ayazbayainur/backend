package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
         Scanner scan = new Scanner(System.in);

        // 1
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //2
        for(int i = 1; i<= 20; i++){
            if(i % 2 == 1)
                System.out.println(i + " ");
        }

        //3
        int temp = a;
        a = b;
        b = temp;

        //4
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int largest = Math.max(number1, Math.min(number2, number3));
        System.out.println(largest);

        //5
        if(a > 0) System.out.println("positive");
        else System.out.println("negative");

        //6
        String str = scan.next();
        String replacedString = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'b') replacedString+="a";
            else replacedString = replacedString + str.charAt(i);
        }
        System.out.println("6: " + replacedString);

        //7
        int sum = 0;
        int[] arr = new int[] {1, 2, 6, 4, 56 };
        for(int it:arr){
            sum+= it;
        }
        System.out.println(sum);

        //8
        int firstmax = Math.max(arr[0], arr[1]);
        int secondmax = Math.min(arr[0], arr[1]);
        for(int i = 2; i < arr.length; i++){
            if(arr[i] > firstmax){
                secondmax = firstmax;
                firstmax = arr[i];
            }else if(arr[i] > secondmax){
                secondmax = arr[i];
            }
        }
        System.out.println(secondmax);








    }
}
