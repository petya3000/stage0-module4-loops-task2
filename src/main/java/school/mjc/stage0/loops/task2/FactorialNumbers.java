package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 1, mult = 1;
            System.out.println(1);
            while (num <= printToInclusive){
                 mult *= num;
                System.out.println(mult);
                
                num++;
            }

    }
}
