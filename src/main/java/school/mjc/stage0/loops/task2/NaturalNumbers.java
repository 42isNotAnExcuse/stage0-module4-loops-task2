package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int start = 0;
        while (lastPrinted-- >= 0) {
            System.out.println(start++);
        }
    }
}
