package basics;

public class Digits {
    public static void main(String[] args) {
        int num = 7889;
        System.out.println(countDigits(num));
        System.out.println(countDigitsLog(num));
    }

//    TC: Log10(N)
    public static int countDigits(int num) {
        int i = 0;
        while(num > 0){
            num = num / 10;
            i++;
        }

        return i;
    }

    public static int countDigitsLog(int num) {
        return (int)(Math.log10(num) + 1);
    }
}
