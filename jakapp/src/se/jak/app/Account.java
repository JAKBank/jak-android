package se.jak.app;

public class Account {
	
	private String mAccountName = new String();
	private Integer mBalance;
	private Integer mSavingPoints;

	Account(String accountName, Integer balance, Integer savingPoints) {
		this.mAccountName = accountName;
		this.mBalance = balance;
		this.mSavingPoints = savingPoints;
	}

	public String getAccountName() {
		return mAccountName;
	}

	public void setAccountName(String accountName) {
		this.mAccountName = accountName;
	}

	public Integer getBalance() {
		return mBalance;
	}

	public void setBalance(Integer balance) {
		this.mBalance = balance;
	}

	public Integer getSavingPoints() {
		return mSavingPoints;
	}

	public void setSavingPoints(Integer savingPoints) {
		this.mSavingPoints = savingPoints;
	}

}
