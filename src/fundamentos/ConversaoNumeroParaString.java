package fundamentos;

public class ConversaoNumeroParaString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		
		int num3 = 999;
		Double.toString(num3);
		
		System.out.println(("" + num1).length());
		
	}
}
