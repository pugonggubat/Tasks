import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        String[] order = {"first","second", "third"};
        int[] num = new int[3];
        int highest = 0;
        boolean allEqual = true;
        for(int i=0; i<order.length; i++)
        {
            System.out.println("Enter the "+ order[i] +" number.");
            Scanner input = new Scanner(System.in);
            num[i] = Integer.parseInt(input.nextLine());
        }
        Arrays.sort(num);
        for(int x=1; x < num.length; x++)
        {
            if (num[x] != num[0])
            {
                highest = num[num.length - 1];
                allEqual=false;
                break;
            }

        }

        System.out.println(allEqual ?"All inputs are equal" : "The highest number among three inputs is: "+ highest);

    }
}
