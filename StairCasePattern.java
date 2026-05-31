import java.util.*;
public class StairCasePattern{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            int k;
            if(i % 2 != 0){
                k = i+1;
            }else{
                k = i;
            }
            for(int j = 0;j<k;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}