import java.util.Arrays;
import java.util.Scanner;

public class prime
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int arraySize = scanner.nextInt();

		int[] values = new int[arraySize];

		System.out.println("Enter the elements of the array : ");
		for (int i = 0; i < arraySize; i++)
		{
			values[i] = scanner.nextInt();
		}

		System.out.println("Printing the Prime Numbers ");
		for (int i = 0; i < arraySize; i++)
		{
			if (checkPrime(values[i]))
			{
				System.out.println(values[i]);
			}
		}

	}

	public static boolean checkPrime(int n)
	{
		if (n <= 1)
			return false;

		int i = 2;
		while (i <= n / 2)
		{
			if ((n % i) == 0)
				return false;
			i++;
		}

		return true;
	}
}