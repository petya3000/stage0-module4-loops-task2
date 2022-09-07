package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 2, mult = 1;
            System.out.println(1);
            System.out.println(1);
            while (num <= printToInclusive){
                for (int i = 2; i < num; i++) mult *= i;
                System.out.println(mult);
                mult = 1;
                num++;
            }

    }
}
