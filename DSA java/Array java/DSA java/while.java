import java.util.*;
public class while{
    public static void main(String[] args){
        int battery = 10;
       // int max_bettery = 100;
        int count = 0;
        while(battery<100){
            count++;
            battery += 10;
        }
        System.out.println(count);


    }
}