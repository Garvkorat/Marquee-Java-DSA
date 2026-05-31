import java.util.Arrays;

public class TwoArraySub {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            num1 = num1 * 10 + arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            num2 = num2 * 10 + arr2[i];
        }

        int sub = num1 - num2;

        String s = String.valueOf(Math.abs(sub));
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[i] = s.charAt(i) - '0';
        }

        if (sub < 0) {
            System.out.print("-");
        }
        System.out.println(Arrays.toString(ans));
    }
}