package onlineCourse.Core.Logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Maile e loglandı" +data);
	}
}