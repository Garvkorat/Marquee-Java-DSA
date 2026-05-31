

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
    // static double cel_to_far(float cel){
    //     double result = (9/5)*cel+32;
    //     return result;
    // }
    // public static void main(String[] args) {
    //     System.out.println(cel_to_far(22));
    // }
    // public static int Sum(int a,int b){
    //     int sum = 0;
    //     for(int i = a;i<=b;i++){
    //         if(i % 2 == 0){
    //             sum += i;
    //         }
    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     int result = Sum(1,100);
    //     System.err.println(result);
    // }
    // static int countDigit(int n){
    //     int count = 0;
    //     while(n > 0){
    //         count++;
    //         n = n/10;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     int result = countDigit(1500);
    //     System.out.print(result);
    // }
    // public static String greetUser(String name){
    //     return("Hello! "+name);
    // }
    // public static void main(String[] args) {
    //     System.out.println(greetUser("Garv"));
    // }
    public static boolean isEven(int num){
        int second_last_didgit = (num/10)%10;
        if(second_last_didgit % 2 == 0){
            return true;
        }
            return false;

    }
    public static void main(String[] args) {
        boolean result = isEven(1087);
        System.out.println(result);
    }
}
   