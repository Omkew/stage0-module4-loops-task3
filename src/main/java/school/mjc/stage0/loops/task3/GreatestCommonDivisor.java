package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcb = 1;
        for (int i = 0; i <= first && i <= second; i++){
            if (first % i == 0 && second % i == 0){
                gcb = i;
            }
        }
        System.out.println(gcb);
    }
}
