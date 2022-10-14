package onlineCourse;

import java.util.ArrayList;
import java.util.List;

import onlineCourse.Core.Logging.Logger;
import onlineCourse.entities.Categories;
import onlineCourse.entities.Courses;
import onlineCourse.entities.Editors;
import onlineCourse.entities.CustomModels.CourseInformationModel;
import onlineCourse.Core.Logging.DatabaseLogger;
import onlineCourse.Core.Logging.FileLogger;
import onlineCourse.Core.Logging.MailLogger;
import onlineCourse.business.CourseManager;
import onlineCourse.dataAccess.HibernateCategoriesDao;
import onlineCourse.dataAccess.HibernateCoursesDao;
import onlineCourse.dataAccess.HibernateEditorsDao;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       List<Logger> loggers = new ArrayList<Logger>();
       
       List<CourseInformationModel> model = new ArrayList<CourseInformationModel>();
        loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		
		CourseManager courseManager= new CourseManager(new HibernateCategoriesDao(), 
				new HibernateCoursesDao() , new HibernateEditorsDao(), loggers) ;
		
		CourseInformationModel course= new CourseInformationModel(new Categories(1,"C#" ), 
				new Courses (1,"C# Yazılımcılar yetiştirme Kursu",100,1,1), 
				new Editors(1,"Engin Demirog"));
				
				model.add(course);
				
		courseManager.add(model);
       
	}

}
