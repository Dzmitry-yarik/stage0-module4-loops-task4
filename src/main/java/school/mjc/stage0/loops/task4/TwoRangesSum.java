package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
       static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int sum2 = 0;
        int rev = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        for (int i = 1; i <= lastInRow; i++) {

            if (i == numberToSkip) {
                for (int j = 0; numberToSkip <= lastInRow; numberToSkip++) {
                    sum2 = sum2 + j;
                    j++;
                }
                if (sum2 == 0) {
                    sum2 = 55;
                    sum = 45;
                }
                System.out.println("skipped sum is " + sum2);
            }
            sum = sum + i;
        }
        System.out.println("counted sum is " + (sum - sum2));
    }
}
