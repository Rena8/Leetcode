
public class MySqrt {
    public int mySqrt(int x) {
        if ( x < 0) {
            System.out.println("Not a valid number.");
            System.exit(0);
        }
        // Newton's method:X(n+1)=[X(n)+p/Xn]/2
        int a = x;
        while(x*x > a){
        x = (x + x/a) / 2;
        }
        return x;
    }
}
