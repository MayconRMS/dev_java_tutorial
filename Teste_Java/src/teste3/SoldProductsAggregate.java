package teste3;

import java.math.BigDecimal;
import java.util.List;

import lombok.Value;

public class SoldProductsAggregate {

	List<SimpleSoldProduct> products;
	BigDecimal total;

	public List<SimpleSoldProduct> getProducts() {
		return products;
	}

	public void setProducts(List<SimpleSoldProduct> products) {
		this.products = products;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public SoldProductsAggregate() {
		super();
	}

	@Override
	public String toString() {
		return "SoldProductsAggregate [products=" + products + ", total=" + total + "]";
	}

	public SoldProductsAggregate(List<SimpleSoldProduct> products, BigDecimal total) {
		super();
		this.products = products;
		this.total = total;
	}

	
	
}
