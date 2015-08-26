import java.util.Scanner;

public class ModulusQuizzer 
{
	public static void main(String[] args) 
	{
		Scanner userInput= new Scanner(System.in);
		System.out.println("How many Questions do you want?");
		int q=userInput.nextInt();
		for(int i=0; i<2; i++)
		{
		System.out.println(Math.random());
		}
	}
}
