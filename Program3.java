import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a%2==0) a--;
        for(int i=1;a>0;i+=2, a--)
            System.out.print(i+" ");
    }
}
