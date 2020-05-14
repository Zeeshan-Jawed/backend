package uni.project.ecommerce.Service;

import uni.project.ecommerce.Model.AppUser;

import java.util.Set;

public interface CrudService<T,E,ID> {
    Set<T> findAll();
    T findById(ID id);
    String save(E object);
    String update(ID id ,E object);
    void delete(T object);
    void deleteById(ID id);
}
