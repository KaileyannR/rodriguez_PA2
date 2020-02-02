// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 2

import java.util.Scanner;
public class Application
{
	public static void main (String [] args)
	{
		Scanner digit = new Scanner(System.in);
		System.out.print("Enter four digit integer: ");
		int number = digit.newInt();
		Encrypter encrypter = new Encrypter;
		Decrypter decrypter = new Decrypter;
		encrypter.encrypt();
		decrypter.decrypt();
	}
}
