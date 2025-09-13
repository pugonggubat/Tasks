public class Task8 {
    static int cumulativeSum(int... a){
        int sum=0;
        for (int x:a){
            for (int y = 0; y<=x; y++) {
                sum += y;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(" Total cumulative sum is: "+ cumulativeSum(4,5,10));
    }
}
