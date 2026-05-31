

public class Fun1{
    // static final float pi = 3.14f;
    // static float areaOfCircle(int radius){
    //     float result = pi*radius*radius;
    //     return  result;
    // }
    // public static void main(String[] args) {
    //     System.out.println(areaOfCircle(5));
    // }
    // static void multiplicationTable(int n){
    //     for(int i =1;i<=10;i++){
    //         System.out.println(n + "X" + i + "=" + (n*i));
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     multiplicationTable(n);
    // }
    static double cel_to_far(float cel){
        double result = (9/5)*cel+32;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(cel_to_far(22));
    }

}