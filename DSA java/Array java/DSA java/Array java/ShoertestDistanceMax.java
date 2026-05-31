import java.util.*;

public class ShoertestDistanceMax {

    public static int maxDuplicateDistance(int[] arr, int n) {

        int max_distance = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[j] == arr[i]) {

                    max_distance = Math.max(j - i, max_distance);

                }
            }
        }

        return max_distance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = maxDuplicateDistance(arr, n);

        System.out.println(ans);
    }
}