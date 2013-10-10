
public class SquareRootInJava {
	
	public static void main(String[] args){
		System.out.println(sqrt(25));
	}

	public static int sqrt(int n){
		  int low = 0;
		  int high = n+1;
		  while (high-low > 1){
		    int mid = (low+high) / 2;
		    if (mid*mid <= n)
		      low = mid;
		    else
		      high = mid;
		  }
		  return low;
	}
}
