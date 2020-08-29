package yaksha;

//import static org.junit.jupiter.api.Assertions.*;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class MainClassTest {

	static Float discountPercent = 20.2f;
	DecimalFormat df = new DecimalFormat("#.00");
	static Map<String, Float> onlineBanking;
	static {
		onlineBanking = new HashMap<>();
		onlineBanking.put("ICICI", 4.2f);
		onlineBanking.put("IBRD", 3f);
		onlineBanking.put("IFC", 4.9f);
		onlineBanking.put("HSBC", 3.9f);
	}

	@Test
	void testMakePayment() throws Exception {
		// Test will pass
		OnlineBanking onlineBanking1 = new OnlineBanking(12560.00, "icici");
		PaymentUtil paymentUtil = new PaymentUtil();
		String result = df.format(
				paymentUtil.makePayment(onlineBanking, onlineBanking1.getBankName(), onlineBanking1.getAmount()));
		yakshaAssert(currentTest(), (result.contentEquals("13087.52") ? "true" : "false"), businessTestFile);
	}

	@Test
	void testMakePayment1() throws Exception {
		PaymentUtil paymentUtil = new PaymentUtil();
		CreditCard creditCard1 = new CreditCard(16300.00);
		String result = df.format((paymentUtil.makePayment1(creditCard1.getAmount())));
		yakshaAssert(currentTest(), (result.equals("17541.99") ? "true" : "false"), businessTestFile);
	}

	@Test
	void testMakePayment2() throws Exception {
		PaymentUtil paymentUtil = new PaymentUtil();
		Wallet wallet1 = new Wallet(28500.00, 20.2f);
		String result = df.format(paymentUtil.makePayment2(wallet1.getAmount(), wallet1.getDiscountPercent()));
		yakshaAssert(currentTest(), (result.contentEquals("22743.00") ? "true" : "false"), businessTestFile);
	}
}
