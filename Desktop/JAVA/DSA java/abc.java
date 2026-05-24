import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {

            int root = (int)Math.sqrt(i);

            if (root * root == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}