

public class OverShadowing{
    int a = 10;
    int b = 20;
     void add(int a) {
        System.out.println(this.a);
        
    }
    public static void main(String[] args) {
        OverShadowing a = new OverShadowing();
        a.add(4);
    }
}