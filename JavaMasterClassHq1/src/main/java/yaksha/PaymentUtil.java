package yaksha;

import java.util.Map;
import java.util.Set;

public class PaymentUtil {

	public Double makePayment(Map<String, Float> bankTax, String bankName, Double amount) {

		Set<String> keys = bankTax.keySet();
		double amnt = 0;
		for (String s : keys) {
			if (s.equalsIgnoreCase(bankName)) {
				amnt = bankTax.get(s);
			}
		}
		return amount + (amount * (amnt / 100));
	}

	public Double makePayment1(Double amount) {
		Float serviceTax = 5.2f;
		Float vat = 2.3f;

		double d1 = amount + (amount * serviceTax / 100);
		return d1 + (d1 * (vat / 100));
	}

	public Double makePayment2(Double amount, Float discountPercent) {
		return amount - (amount * (discountPercent / 100));
	}
}
