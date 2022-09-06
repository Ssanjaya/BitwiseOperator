
package operators;

import java.util.Scanner;

public class Operators {

    public static void toBinary(int a){
           if (a>1)
            toBinary(a/2);
        int n=a%2;
        System.out.print(n+" ");
                
    }
    public static void swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swaping : a= "+a+" b= "+b);
    }
    public static void oddOrEven(int a){
        if((a&1)==0)
            System.out.println("\n"+" The given number is Even");
        else
            System.out.println("\n"+"The given number isOdd");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r1=a&b;
        System.out.println("And operator : "+ r1);
        int r2=a|b;
        System.out.println("Or operator : "+ r2);
        int r3=a^b;
        System.out.println("Xor operator : "+ r3);
        swap(a,b);
        toBinary(a);
        oddOrEven(a);
        
    }
    
}
