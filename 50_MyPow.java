public class MyPow {
    /**
     * previous version, stack overflow
	public double myPow(double x, int n) {
        if (n < 0) {
            return myPow(1/x, -n);
        }
        else if (n == 0) {
            return 1;
        }
        else if (n % 2 == 0){
            return myPow(x * x,n / 2);
        }
        else {
            return myPow(x, n-1) * x;
        }
    }
    */

    public double myPow(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1/x;
        }
        if (n == 0) {
            return 1;
        }
        
        if (n % 2 == 0){
            return myPow(x * x,n / 2);
        }
        else {
            return myPow(x, n-1) * x;
        }
    }
	
}
