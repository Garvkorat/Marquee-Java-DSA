
public class TwoArraySubBorrow {


    public static void main(String[] args) {

        int[] a = {5, 3, 2};  // 532
        int[] b = {1, 7};     // 17

        int i = a.length - 1;
        int j = b.length - 1;
        int borrow = 0;

        while (i >= 0) {

            int top    = a[i];
            int bottom = (j >= 0) ? b[j] : 0;

            a[i] = top - bottom - borrow;

            if (a[i] < 0) {
                a[i] = a[i] + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            i--;
            j--;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}