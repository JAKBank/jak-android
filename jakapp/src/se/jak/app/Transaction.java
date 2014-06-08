package se.jak.app;

import java.util.Date;

public class Transaction {
	private Date date;
	private String description;
	private Double amount;
	
	public Transaction(Date date, String description, Double amount) {
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
