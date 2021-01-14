public class SimplifyFrac {
	public static long gcd(int a, int b) {
	    if(a==0)
	    	return b;
	    return gcd(b%a,a);
	}

	public static String asFraction(int a, int b) {
	    long gcd = gcd(a, b);
	    return (a / gcd) + "/" + (b / gcd);
	}
}