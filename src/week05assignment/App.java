package week05assignment;

public class App {

	public static void main(String[] args) {
		
		Logger astLogger = new AsterickLogger();
		
		astLogger.log("hello");
		astLogger.error("hello");
		
		Logger spaceLogger = new SpacedLogger ();
		
		spaceLogger.log("hello");
	}

}
