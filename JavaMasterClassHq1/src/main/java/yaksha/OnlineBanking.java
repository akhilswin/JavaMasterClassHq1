package yaksha;

public class OnlineBanking {
	Double amount;
	String bankName;

	public OnlineBanking(Double amount, String bankName) {
		super();
		this.amount = amount;
		this.bankName = bankName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
