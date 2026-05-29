import java.util.*;
public class linearSearch{
    public static int ret_index(int[] arr, int target){
        int index = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }

        }
        return index;
    }
    public static boolean linear_search(int[] arr, int target){
        boolean flag = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                flag = true;
            }
        }
        return flag;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        if(linear_search(arr,target)){
            System.out.println("Value Founded at index"+ret_index(arr, target));
        }

    }
}