package yaksha;

public class Wallet {
	Double amount;
	Float discountPercent;

	public Wallet(Double amount, Float discountPercent) {
		super();
		this.amount = amount;
		this.discountPercent = discountPercent;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Float getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Float discountPercent) {
		this.discountPercent = discountPercent;
	}
}
