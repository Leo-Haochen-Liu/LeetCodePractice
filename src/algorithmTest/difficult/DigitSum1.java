package comp1110.lab3;

public class DigitSum1 {

    /**
     * Returns the sum of odd digits only in @param number.
     */
    static int sumOddDigits(int number) {
        int dsum = 0;
        while (number % 2 != 0) {
            int digit = number % 10;
            dsum = dsum + digit;
	    number = number / 10;
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
