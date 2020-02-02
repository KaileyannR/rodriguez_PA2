// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 2

import java.util.Scanner;
public class Decrypter
{
	public int decrypt (int number)
	{
		// Turns each digit in number into singular digits.
		int temp = 0;
		int digit1 = (int)(number / 1000);
		int digit2 = (int)((number / 100) - (digit1 * 10));
		int digit3 = (int)((number / 10) - (digit1 * 100) - (digit2 * 10));
		int digit3 = (int)((number) - (digit1 * 1000) - (digit2 * 100) - (digit3 * 10));

		// Performs decryption conversions upon each digit.
		digit1 = (digit1 + 3) % 10;
		digit2 = (digit1 + 3) % 10;
		digit3 = (digit1 + 3) % 10;
		digit4 = (digit1 + 3) % 10;

		// Re-Swaps digit1 with digit3.
		temp = digit1;
		digit1 = digit3;
		digit3 = temp;

		// Re-Swaps digit2 with digit4.
		temp = digit2;
		digit2 = digit4;
		digit4 = temp;

		// Makes calculation to place all digits into a four digit number.
		number = ((digit1 * 1000) + (digit2 * 100) + (digit3 * 10) + digit4));
		return number;
	}
}
