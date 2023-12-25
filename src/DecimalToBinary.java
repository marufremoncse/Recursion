
public class DecimalToBinary {
	public static String decimalToBinary(int decimal) {
		if(decimal==0) {
			return "";
		}
		return decimalToBinary(decimal/2) + String.valueOf(decimal%2);
	}
	public static void main(String[] args) {
		System.out.println(decimalToBinary(7));
	}

}
