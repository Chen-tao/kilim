public class Test {
	public static void main(String[] args){
		System.out.println(sqrt(33.46));
	}

	public static double sqrt(double x)
  	{
        double ans = x;
        while(ans*ans-x>1e-10)
            ans=(ans*ans+x)/(2*ans);
        return ans;
  	}
}