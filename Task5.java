import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        String[] order = {"first","second", "third"};
        int[] num = new int[3];

        for(int i=0; i<=2; i++)
        {
            System.out.println("Enter the "+ order[i] +" number.");
            Scanner input = new Scanner(System.in);
            num[i] = Integer.parseInt(input.nextLine());
        }
        Arrays.sort(num);
        int highest = num[num.length - 1];
        System.out.println("The highest number among three inputs is: "+ highest);
    }
}
