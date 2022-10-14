package onlineCourse.dataAccess;

import onlineCourse.entities.Courses;

public class HibernateCoursesDao implements CoursesDao {

	@Override
	public <S extends Courses> S add(S entity) {
		System.out.println("Hibernate Kurs ile Veri tabanına eklendi");
		return null;
	}

	@Override
	public Iterable<Courses> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Courses entity) {
		// TODO Auto-generated method stub
		
	}

}
