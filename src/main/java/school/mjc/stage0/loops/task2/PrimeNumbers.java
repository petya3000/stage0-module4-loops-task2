package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 3;
            if (printToInclusive < 2) return;
            boolean flag = true;
            System.out.println(2);
            while (num <= printToInclusive){
                for (int i = 2; i < num; i++){
                    if (num % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.println(num);
                flag = true;
                num++;
            }
    }
}
