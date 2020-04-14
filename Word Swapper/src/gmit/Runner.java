package gmit;

public class Runner {

	public static void main(String[] args) throws Throwable {
		System.out.println(ConsoleColour.CYAN);
		
		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept. Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*             Text Simplifier V0.1                *");
		System.out.println("*       (AKA Orwellian Language Compliance)       *");		
		System.out.println("*                                                 *");
		System.out.println("***************************************************");
		
		Parser test = new Parser();
		double time;
		
		double nano_startTime = System.nanoTime();
		test.parseGoogle("./google-1000.txt");
		test.parse("./MobyThesaurus2.txt");
		
		
		new Menu(test.getMap());
		double nano_endTime = System.nanoTime();
		time = (nano_endTime - nano_startTime)/1000;
		System.out.println(ConsoleColour.YELLOW);
		System.out.println(time);
		
	}
}