public class Task8 {

    public static int cumulativeSum(int... nums) {
        int grandTotal = 0;

        for (int num : nums) {
            // Compute sum from 1 to num: 1 + 2 + ... + num
            int cumulative = 0;
            for (int i = 1; i <= num; i++) {
                cumulative += i;
            }
            System.out.println("Cumulative sum for " + num + " = " + cumulative);
            grandTotal += cumulative;
        }

        return grandTotal;
    }

    public static void main(String[] args) {
        int total = cumulativeSum(4, 5, 10);
        System.out.println("Total = " + total);
    }
}