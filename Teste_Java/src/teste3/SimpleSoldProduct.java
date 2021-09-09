package teste3;

import java.math.BigDecimal;

import lombok.Setter;
import lombok.Value;

public class SimpleSoldProduct {

	private String name;
	private BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public SimpleSoldProduct() {
		super();
	}

	@Override
	public String toString() {
		return "SimpleSoldProduct [name=" + name + ", price=" + price + "]";
	}

	public SimpleSoldProduct(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}

	
}
