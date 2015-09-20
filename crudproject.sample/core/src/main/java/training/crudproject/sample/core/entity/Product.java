package training.crudproject.sample.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "product_id")
	int productId;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "price")
	Long price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}
