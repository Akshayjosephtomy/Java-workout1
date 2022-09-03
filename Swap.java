import java.util.Scanner;
public class Swap{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int a = s.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int b = s.nextInt();
        System.out.println("Before Swapping x = "+a+" y = "+b);

        int temp =a;
        a=b;
        b=temp;
        System.out.print("After Swapping x = "+a+" y = "+b);
    }
}