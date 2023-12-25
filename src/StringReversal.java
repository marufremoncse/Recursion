
public class StringReversal {
	public static String stringReversal(String s) {
		if(s.equals(""))
			return "";
		return stringReversal(s.substring(1)) + s.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(stringReversal("I am a good programmer!!!"));
	}
}
