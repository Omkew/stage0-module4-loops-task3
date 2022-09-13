package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = Integer.toString(t);
        int len = str.length();
        int temp = 0;
        int result = 0;
        for (int i = 0; i <= len; i++){
            temp = t % 10;
            result += temp;
        }
        System.out.println(result);
    }
}
