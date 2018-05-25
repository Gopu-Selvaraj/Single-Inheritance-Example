class River
	{
		String fish1 = "Nagarai";
		String fish2 = "Paarai";
		String fish3 = "Mural";
		String fish4 = "Nandu";
	}
class Ratecard extends River
	{
		int Fish1Rate = 100;
		int Fish2Rate = 150;
		int Fish3Rate = 200;
		int Fish4Rate = 250;
	}

class SingleInheritance
	{
 		public static void main(String[] args)
 		{

			Ratecard R = new Ratecard();
			System.out.println("Type 1");// you can access River and Ratecard
			System.out.println("Fish Name is: " + R.fish1 + " " + "Rate is : " +R.Fish1Rate);

			River fname = new Ratecard();
			System.out.println("Type 2"); // you can access River only
			System.out.println("Fish Name is: " + fname.fish1);

		}
	}
