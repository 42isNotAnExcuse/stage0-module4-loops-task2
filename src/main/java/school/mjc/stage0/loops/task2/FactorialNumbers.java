package school.mjc.stage0.loops.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        List<Integer> result = new ArrayList<>();

        while (printToInclusive >= 0) {
            int start;
            int finish;

            finish = start = 1;
            while (start <= printToInclusive) {
                finish *= start++;
            }
            result.add(finish);
            printToInclusive--;
        }
        Collections.reverse(result);
        result.forEach(System.out::println);
    }
}
