import java.util.Scanner;


public class uppg15 
{
	public static void main(String[] args) 
	{
		Scanner tgb = new Scanner(System.in);
		
		final int AVSLUT = 0;
		
		int tal;
		double antalTal = 0;
		double summa = 0;
		int minsta;
		int nastMinsta;
		int storsta;
		int nastStorsta;
		
		System.out.println("Ge mig ett heltal (0 för att avsluta): ");
		tal = tgb.nextInt();
		minsta = Integer.MAX_VALUE;
		nastMinsta = Integer.MAX_VALUE;
		storsta = Integer.MIN_VALUE;
		nastStorsta = Integer.MIN_VALUE;
		
		int forstaTal = tal;
		
		for (; tal != 0; tal = tgb.nextInt())
		{
			antalTal++;
			summa += tal;
			System.out.println("Ge mig ytterliggare ett heltal (0 för avsluta): ");
			
			if (tal < nastMinsta)
			{
				if (tal < minsta)
				{
					nastMinsta = minsta;
					minsta = tal;
				}
				else
				{
					nastMinsta = tal;
				}
				if (tal > storsta)
				{
					nastStorsta = storsta;
					storsta = tal;
				}
				else if (tal > nastStorsta)
				{
					nastStorsta = tal;
				}
			}
			else if (tal > storsta)
			{
				nastStorsta = storsta;
				storsta = tal;
			}
			else if(tal > nastStorsta)
			{
				nastStorsta = tal;
			}
		}
		if (tal == AVSLUT)
		{
			if (antalTal == 0)
			{
				System.out.println("Inga tal lästes in.");
			}
			else if (antalTal == 1)
			{
				System.out.println("Endast ett tal lästes in, nämligen: " + forstaTal);
			}
			/* else if (antalTal == 2)
			{
				int medelvarde = summa / antalTal;
				System.out.println("De två största talen är: " + nastMinsta + " och " + minsta);
				System.out.println("De två minsta talen är: " + minsta + " och " + nastMinsta);
				System.out.println("Medelvärdet är: " + medelvarde);
			} */
			else if (antalTal > 1)
			{
				double medelvarde = summa / antalTal;
				System.out.println("De två största talen är: " + storsta + " och "+ nastStorsta);
				System.out.println("De två minsta talen är: " + minsta + " och " + nastMinsta);
				System.out.println("Medelvärdet är: " + medelvarde);
			}
		}
		System.out.println("Finished!");
	}
}
