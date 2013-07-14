
public class DoubleBasePalindromes {

	private int maxNumbers;
	private int sumOfPalindromes = 0;
	
	public DoubleBasePalindromes(int maxNumbers) {
		this.maxNumbers = maxNumbers;
	}
	
	public void calculateSumOfPalindromes() {

		for(int i = 1; i < maxNumbers; i++) {
			if(checkPalindromic(Integer.toString(i)) &&
					checkPalindromic(Integer.toBinaryString(i))) {
				sumOfPalindromes += i;
			}
		}
	}
	
	public int getSumOfPalindromes() {
		return sumOfPalindromes;
	}
	
	public boolean checkPalindromic(String checkString) {
		char[] reverseString = new char[checkString.length()];
		
		int forwardCounter = 0;
		String testString;
		
		for(int i = checkString.length() - 1; i >= 0; i--) {			
			reverseString[i] = checkString.charAt(forwardCounter);
			forwardCounter++;
		}
		testString = new String(reverseString);
		if(testString.equals(checkString)) {
			return true;
		}
		return false;
	}
}


