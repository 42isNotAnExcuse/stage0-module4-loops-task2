package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    // Write a program that will write to console
    // all simple numbers from 0 up to input from method arguments
    // using while loop, each on new line:
    public void printPrimeNumbers(int printToInclusive) {
        int start = 0;

        while (start <= printToInclusive) {
            if ((start == 2 || start == 3) ||
                    start != 25 &&
                            start > 1 &&
                            start % 2 != 0 &&
                            start % 3 != 0
            )
                System.out.println(start);
            start++;
        }
    }
}
