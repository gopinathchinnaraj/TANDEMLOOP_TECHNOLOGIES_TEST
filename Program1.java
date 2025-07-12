import java.util.Scanner;

public class Program1 {
    double a, b;
    String operation;

    Program1(double a, double b, String operation){
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    void calculate(){
        switch (operation) {
            case "Addition":
                System.out.println("Addition of two number is "+(a+b));
                break;
            case "Subtraction":
                System.out.println("Subtraction of two number is "+(a-b));
                break;
            case "Multiplication":
                System.out.println("Multiplication of two number is "+(a*b));
                break;
            case "division":
                if(b!=0)
                    System.out.println("division of two number is "+(a/b));
                else
                    System.out.println("divided by zero exception");
                break;
            default:
                System.out.println("Enter the correct operation");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter fisrt numbre:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter operation:(Addition, Subtraction, Multiplication, division):");
        String op=sc.nextLine();
        Program1 cal = new Program1(a, b, op);
        cal.calculate();

    }
}
