package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
           int sum = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        for (int i = 1; i <= lastInRow; i++) {
            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bugger then the last");
                return;
            }
            if (i == numberToSkip) {
                System.out.println("skipped sum is " + numberToSkip);
                continue;
            }
            sum = sum + i;
        }
        System.out.println("counted sum is " + sum);
    }
}
