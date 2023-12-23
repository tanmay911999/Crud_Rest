package JAVA.TECHIE.CRUD_REST_JAVA_TECHIE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JAVA.TECHIE.CRUD_REST_JAVA_TECHIE.Entity.Product;
import JAVA.TECHIE.CRUD_REST_JAVA_TECHIE.Repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repository;
	
	//POST METHODS
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
	public List<Product> saveProduct( List<Product>  products)
	{
		return repository.saveAll(products);
	}
	
	
	//GET METHODS
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}
	
	
	
	public Product getProductByName(String name){
		return repository.findByName(name);
	}
	
	
	//Delete methods
	
	public String deleteProduct(int id)
	{
		 repository.deleteById(id);
		 return "product remove || "+id;
	}
	
	
	//Update method
	
	public Product updateProduct(Product product)
	{
	    
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
