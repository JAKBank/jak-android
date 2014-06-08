package se.jak.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.provider.CalendarContract.Colors;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TransactionListAdapter extends BaseAdapter {
	private final Context mContext;

	// List of Accounts
	private final List<Transaction> mTransactions = new ArrayList<Transaction>();
	
	public TransactionListAdapter(Context context) {

		mContext = context;

	}

	// Add an account to the adapter
	// Notify observers that the data set has changed

	public void add(Transaction item) {

		mTransactions.add(item);
		notifyDataSetChanged();

	}
	
	// Clears the list adapter of all accounts.
	
	public void clear(){

		mTransactions.clear();
		notifyDataSetChanged();
	
	}

	// Returns the number of transactions

	@Override
	public int getCount() {

		return mTransactions.size();

	}

	// Retrieve the transaction item

	@Override
	public Object getItem(int pos) {

		return mTransactions.get(pos);

	}

	// Get the ID for the Account
	// In this case it's just the position

	@Override
	public long getItemId(int pos) {

		return pos;

	}

	//Create a View to display the Account 
	// at specified position in mAccounts

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {


		//Get the current Account
		final Transaction transaction = (Transaction)getItem(position);

		//Inflate the View for this account from account_item.xml
		View itemView = convertView;
		if (itemView == null) {
			LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			itemView = inflater.inflate(R.layout.transaction_item, null);
		}

		//Display date in transaction date view
		final TextView transactionDateView = (TextView)itemView.findViewById(R.id.transaction_date);
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		transactionDateView.setText(df.format(transaction.getDate()));

		//Display description in transaction description view
		final TextView transactionDescriptionView = (TextView)itemView.findViewById(R.id.transaction_description);
		transactionDescriptionView.setText(transaction.getDescription().toString());

		//Display amount in transaction amount view
		final TextView transactionAmountView = (TextView)itemView.findViewById(R.id.transaction_amount);
		Double amount = transaction.getAmount();
		transactionAmountView.setText(amount.toString());
		if (amount < 0) {
			transactionAmountView.setTextColor(Color.RED);
		}

		return itemView;

	}

}
