
public class SumOfNaturalNumber {
	public static int sumOfNaturalNumber(int n) {
		if(n==1)
			return 1;
		return sumOfNaturalNumber(n-1) + n;
	}
	public static void main(String[] args) {
		System.out.println(sumOfNaturalNumber(10));
	}

}
