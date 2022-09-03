import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        a=sc.nextInt();
        System.out.print("enter last number : ");
        b=sc.nextInt();
    
        for(int i=a;i<=b;i++){
        int num,rem,sum=0;
            num=i;

            while(num!=0){
                rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;

            }

            if(sum==i){
                System.out.println(sum);
            }
        }
    }
}