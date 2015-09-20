package training.crudproject.sample.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import training.crudproject.sample.core.entity.Product;

@Repository
@Transactional(propagation = Propagation.SUPPORTS)
public interface ProductDao extends JpaRepository<Product, Long> {

}
