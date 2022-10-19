package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int start = 0;

        if (multiplyByAndToInclusive > 0) {
            while (start <= multiplyByAndToInclusive) {
                System.out.println(start * multiplyByAndToInclusive);
                start++;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (start >= multiplyByAndToInclusive) {
                System.out.println((start * multiplyByAndToInclusive) * -1);
                start--;
            }
        }
    }
}
