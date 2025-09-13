import java.util.Scanner;
public class Task7 {
    static int add(int a, int b){
        return a+b;
    }

    static int subtract(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static float quotient(int a, int b){
        float result=(float)a/b;
        return (float)Math.round(result*100f)/100f;
    }

    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter the first number");
        Scanner input = new Scanner(System.in);
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the second number");
        Scanner input2 = new Scanner(System.in);
        num2 = Integer.parseInt(input.nextLine());

        int sum=add(num1,num2);
        System.out.println("The sum of two numbers is " + sum);

        int diff=subtract(num1,num2);
        System.out.println("The difference between two numbers is " + diff);

        int prod=multiply(num1,num2);
        System.out.println("The product of two numbers is " + prod);

        double quot=quotient(num1,num2);
        System.out.println("The quotient of two numbers is " + quot);
    }



}
