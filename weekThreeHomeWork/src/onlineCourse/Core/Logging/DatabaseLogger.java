package onlineCourse.Core.Logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Databasze e loglandı" +data);
	}
}