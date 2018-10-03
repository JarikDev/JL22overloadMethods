import java.util.concurrent.ExecutorService;

public class Overload {
   public static int addTwoDigits(int a, int b) {
        return a + b;
    }

   protected final double addTwoDigits(double a, double b) throws Exception{
        return a + b;
    }
    public static void main(String[] args) throws Exception {
        Overload overload=new Overload();
        System.out.println(overload.addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits(234.234,532.532));
        OverloadChild overloadChild=new OverloadChild();
       overloadChild.addTwoDigits(234);
    }
}
class OverloadChild extends Overload{
    void addTwoDigits(int i){
        System.out.println("Overload method");

    }
}