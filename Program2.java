import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        for(int i=1;i<=a;i+=2)
            System.out.print(i+" ");
    }
}
