package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int deg = 0;

            while (deg <= power){
                System.out.println((int)Math.pow(2, deg));
                deg++;
            }

    }
}
