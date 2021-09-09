package teste3;

import java.math.BigDecimal;

import lombok.Value;

public class SoldProduct {

	private String name;
	private BigDecimal price;
	private String currency;

	public SoldProduct(String name, BigDecimal price, String currency) {
		super();
		this.name = name;
		this.price = price;
		this.currency = currency;
	}

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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
