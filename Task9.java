import static java.lang.Math.*;
public class Task9 {
    public static int add(int a, int b){
      return Math.addExact(a,b);
    }

    public static int subtract(int a, int b){
        return Math.subtractExact(a,b);
    }

    public static int multiply(int a, int b){
        return Math.multiplyExact(a,b);
    }

    public static int divide(int a, int b){
        return Math.floorDiv(a,b);
    }

    public static void main(String[] args) {
        System.out.println("The sum of two numbers is "+add(1,3));
        System.out.println("The difference between two numbers is "+subtract(3,1));
        System.out.println("The product of two numbers is "+multiply(1,3));
        System.out.println("The quotient of two numbers is "+divide(4,2));
    }
}
