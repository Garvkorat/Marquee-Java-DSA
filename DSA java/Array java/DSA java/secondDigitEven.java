public class secondDigitEven{
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
