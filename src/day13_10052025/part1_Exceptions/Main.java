package day13_10052025.part1_Exceptions;

public class Main {

	public static void main(String[] args) {
		int x = 10;
		// int y = 10;
		int y = 10;
		int tab[]= {10,2,4};
		String ch = null;
		try {
			System.out.println(x / y);
			System.out.println(tab[2]);
			System.out.println(ch.length());

		} catch (ArithmeticException e) {
           System.out.println(e.getMessage());
           e.printStackTrace();
           return;
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
	           System.out.println(e.getMessage());
	           e.printStackTrace();
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
        finally {
		System.out.println("Suite du programme...");
        }

	}

}
