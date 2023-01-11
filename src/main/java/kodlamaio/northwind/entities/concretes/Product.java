package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id;
	
	private int categoryId;
	
	private String productName;
	
	private double unitPrice;
	
	private short unitsInStock;
	
	private String quantityPerUnit;
	
	
}
