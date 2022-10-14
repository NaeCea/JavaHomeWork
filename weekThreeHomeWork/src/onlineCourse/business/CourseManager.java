package onlineCourse.business;

import onlineCourse.Core.Logging.Logger;
import onlineCourse.dataAccess.CategoriesDao;
import onlineCourse.dataAccess.CoursesDao;
import onlineCourse.dataAccess.EditorsDao;
import onlineCourse.entities.CustomModels.CourseInformationModel;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CourseManager {

	private CategoriesDao categoriesDao;
	private CoursesDao coursesDao;
	private EditorsDao editorsDao;
	private List<Logger> loggers;

	public CourseManager(CategoriesDao categoriesDao, CoursesDao coursesDao, EditorsDao editorsDao,
			List<Logger> loggers) {
		super();
		this.categoriesDao = categoriesDao;
		this.coursesDao = coursesDao;
		this.editorsDao = editorsDao;
		this.loggers = loggers;
	}

	 public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
	        final Set<String> setToReturn = new HashSet<String>();
	        final Set<String> set1 = new HashSet<String>();
	        for (String yourInt : listContainingDuplicates) {
	            if (!set1.add(yourInt)) {
	                setToReturn.add(yourInt);
	            }
	        }
	        return setToReturn;
	    }
	public void add(List<CourseInformationModel> listModel) throws Exception {
		
		

		for (CourseInformationModel courseInformationModel : listModel) {
			
			if(courseInformationModel.getCourse().getPrice()<0)
			{
				throw new Exception("ürün fiyatı 0 dan küçük olamaz");
			}
		    if(listModel.contains(courseInformationModel.getCourse().getName()))
		    {
		    	throw new Exception("Aynı Kurs ismi Kardeş");
		    	
		    }
		    if(listModel.contains(courseInformationModel.getCategory().getName()))
		    {
		    	throw new Exception("Aynı Kategor ismi Kardeş");
		    	
		    }
			categoriesDao.add(courseInformationModel.getCategory());
			editorsDao.add(courseInformationModel.getEditor());
			coursesDao.add(courseInformationModel.getCourse());
			
			for (Iterator<Logger> iterator = loggers.iterator(); iterator.hasNext();) {
				Logger logger = (Logger) iterator.next();
				logger.log(courseInformationModel.getCategory().getName());
				logger.log(courseInformationModel.getEditor().getNameSurname());
				logger.log(courseInformationModel.getCourse().getName());
				
			}
		}
		
		
	}
	
	

}
