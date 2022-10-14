package onlineCourse.dataAccess;

import onlineCourse.entities.Categories;

public class JdbcCategoriesDao implements CategoriesDao{

	@Override
	public <S extends Categories> S add(S entity) {
		System.out.println("JDBC ile Kategori Veri tabanına eklendi");
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
