package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products/")
public class ProductsController {
	
	ProductService productService;
	
	public ProductsController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("getAll") //postman ornek : http://localhost:8080/api/products/getAll
	public DataResult<List<Product>> getAll(){
		return productService.getAll();
	}
	
	@GetMapping("getByProductName") //postman ornek : http://localhost:8080/api/products/getByProductName?productName=Chai
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("getByProductNameAndCategoryId") //postman ornek : http://localhost:8080/api/products/getByProductNameAndCategoryId?productName=Chai&categoryId=1
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("getByProductNameContains") //postman ornek : http://localhost:8080/api/products/getByProductNameContains?productName=ba
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("getAllByPage") //postman ornek : http://localhost:8080/api/products/getAllByPage?pageNo=1&pageSize=10
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("getAllAsc") //postman ornek : http://localhost:8080/api/products/getAllAsc
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
	
	@GetMapping("getByProductNameOrCategoryId") //postman ornek : http://localhost:8080/api/products/getByProductNameOrCategoryId?productName=Chai&categoryId=2
	public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);
	}
	
	@GetMapping("getByCategoryIdIn") //postman ornek : http://localhost:8080/api/products/getByCategoryIdIn?categories=1,2
	public DataResult<List<Product>> getByCategoryIdIn(@RequestParam List<Integer> categories){
		return this.productService.getByCategoryIdIn(categories);
	}
	
	@GetMapping("getByProductNameStartsWith") //postman ornek : http://localhost:8080/api/products/getByProductNameStartsWith?productName=Ch
	public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName){
		return this.productService.getByProductNameStartsWith(productName);
	}
	
	@GetMapping("getByNameAndCategory") //postman ornek : http://localhost:8080/api/products/getByNameAndCategory?productName=Chai&categoryId=2
	public DataResult<List<Product>> getByNameAndCategory(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByNameAndCategory(productName, categoryId);
	}
}


