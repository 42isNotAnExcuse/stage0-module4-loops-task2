package school.mjc.stage0.loops.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerOfTwo {
    public void printPower(int power) {
        List<Integer> finalRes = new ArrayList<>();

        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        while (power >= 0) {
            int res = 1;
            int realPower = 1;

            while (realPower <= power) {
                for (;
                     realPower <= power;
                     realPower++)
                    res *= 2;
            }
            finalRes.add(res);
            power--;
        }
        Collections.reverse(finalRes);
        finalRes.forEach(System.out::println);
    }
}
