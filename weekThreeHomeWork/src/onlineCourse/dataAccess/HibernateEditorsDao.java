package onlineCourse.dataAccess;

import onlineCourse.entities.Editors;

public class HibernateEditorsDao implements EditorsDao {

	@Override
	public <S extends Editors> S add(S entity) {
		System.out.println("Hibernate Editor ile Veri tabanına eklendi");
		return null;
	}

	@Override
	public Iterable<Editors> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Editors entity) {
		// TODO Auto-generated method stub
		
	}

}
