package onlineCourse.Core.Logging;

public class FileLogger  implements Logger{

	@Override
	public void log(String data) {
		System.out.println("File e loglandı" +data);
	}
}
