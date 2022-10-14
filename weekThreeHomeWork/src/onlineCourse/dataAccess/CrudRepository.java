package onlineCourse.dataAccess;


public interface CrudRepository<T>  {
                                                                                                                   
<S extends T> S add(S entity);
                                                                                                                   
                                                                                                                   
Iterable<T> findAll();

Long count();
                                                                                                                   
void delete(T entity);
                                                                                                                   
                                                                                                                   
// … more functionality omitted.
}