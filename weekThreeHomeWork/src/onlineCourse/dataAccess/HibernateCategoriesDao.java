package onlineCourse.dataAccess;

import onlineCourse.entities.Categories;

public class HibernateCategoriesDao implements CategoriesDao {

	@Override
	public <S extends Categories> S add(S entity) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate Kategori ile Veri tabanına eklendi");
		return null;
	}

	@Override
	public Iterable<Categories> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Categories entity) {
		// TODO Auto-generated method stub
		
	}

}
