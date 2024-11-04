package comp1110.lab3;

public class DigitSum2 {

    /**
     * Returns the sum of odd digits only in @param number.
     */
    static int sumOddDigits(int number) {
	int dsum = 0;
	if (number < 10)
	    if (number % 2 == 1)
		dsum = number;
	while (number >= 10) {
	    int digit = number % 10;
	    if (digit == 1 || digit == 3 || digit == 5 || digit == 7 || digit == 9) {
		dsum = dsum + digit;
		number = number / 10;
	    }
	}
	return dsum;
    }

    public static void main(String[] args) {
	System.out.println("sumOddDigits(" + 5 + ") = " + sumOddDigits(5));
	System.out.println("sumOddDigits(" + 25 + ") = " + sumOddDigits(25));
	System.out.println("sumOddDigits(" + 252 + ") = " + sumOddDigits(252));
	System.out.println("sumOddDigits(" + 222 + ") = " + sumOddDigits(222));
    }

}
