package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int deg = 0;
            if (power < 0) System.out.println("too much power");
        else while (deg <= power){
                System.out.println((int)Math.pow(2, deg));
                deg++;
            }

    }
}
