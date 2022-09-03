import java.util.Scanner;
public class LargestOf3{
    public static void main(String args[]){
        int a,b,c;
        System.out.println("------Largest Of Three Numbers------");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the First number : ");
        a=s.nextInt();
        System.out.print("Enter the Second number : ");
        b=s.nextInt();
        System.out.print("Enter the Third number : ");
        c=s.nextInt();
        if(a>=b && a>=c)
            System.out.println(a+" is the largest number");
            else if(b>=a && b>=c)
            System.out.println(b+" is the largest number");
            else
            System.out.println(c+ " is the largest number");
    
    } 
}