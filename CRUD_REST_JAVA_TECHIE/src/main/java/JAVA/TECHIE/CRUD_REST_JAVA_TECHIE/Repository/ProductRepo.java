package JAVA.TECHIE.CRUD_REST_JAVA_TECHIE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import JAVA.TECHIE.CRUD_REST_JAVA_TECHIE.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
