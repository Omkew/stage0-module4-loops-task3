package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int temp = 10;
        int result = 0;
        for (int i = 0; i < lengthOfLastNumber; i++){
            temp *= 10;
            result += temp - 1;
        }
        System.out.println(result);
    }
}
