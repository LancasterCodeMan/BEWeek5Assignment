package week05assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("ERROR: " + log.replace("", " ").trim());
	}

	@Override
	public void error(String log) {
	}

}
