package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        // Write a program that will write to console
        // even numbers from zero to the number from method arguments
        // using while loop, each on new line:
        int start = 1;

        while (start <= printTillInclusive) {
            if (start % 2 == 0) System.out.println(start);
            start++;
        }
    }
}
