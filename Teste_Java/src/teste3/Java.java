package teste3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java {

	public static void main(String[] args) {
		String resposta = "nothing";

		List<SoldProduct> listSoldProduct = Arrays.asList(new SoldProduct("mkyong", new BigDecimal(10000), "BR"),
				new SoldProduct("jack", new BigDecimal(20000), "BR"),
				new SoldProduct("lawrence", new BigDecimal(30000), "BR"));

		Stream<SoldProduct> products = listSoldProduct.stream();

		products =  new ArrayList<SoldProduct>().stream();
		
		List<SimpleSoldProduct> result = new ArrayList<>();
		BigDecimal total = new BigDecimal(0);

		if (products != null) {
			result = products.map(temp -> {
				return new SimpleSoldProduct(temp.getName(), temp.getPrice());
			}).collect(Collectors.toList());

			total = result.stream().map(item -> item.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
		}

		SoldProductsAggregate soldProductsAggregate = new SoldProductsAggregate(result, total);

		System.out.println(soldProductsAggregate);

	}

}
