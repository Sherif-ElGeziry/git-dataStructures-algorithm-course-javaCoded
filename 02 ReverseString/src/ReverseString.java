
public class ReverseString {

	public String reverseStringOne(String text) {
		String result = "";

		for (int i = text.length() - 1; i >= 0; i--)
			result += text.charAt(i);

		return result;
	}

	public String reverseStringTwo(String text) {
		return new StringBuilder(text).reverse().toString();
	}

	public String reverseStringThree(String text) {
		if (text.length() == 0) // breakpoint for recursion
			return "";
		return reverseStringThree(text.substring(1)) + text.charAt(0);
	}
}
