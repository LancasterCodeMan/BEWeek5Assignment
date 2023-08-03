package week05assignment;

public class App {

	public static void main(String[] args) {
		
		Logger astLogger = new AsterickLogger();
		
		astLogger.log("Hello");
		astLogger.error("Hello");
		
		Logger spaceLogger = new SpacedLogger ();
		
		spaceLogger.log("Hello");
	}

}
