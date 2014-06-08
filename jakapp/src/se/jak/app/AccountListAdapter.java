package se.jak.app;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AccountListAdapter  extends BaseAdapter {
	
	private final Context mContext;

	// List of Accounts
	private final List<Account> mAccounts = new ArrayList<Account>();
	
	public AccountListAdapter(Context context) {

		mContext = context;

	}

	// Add an account to the adapter
	// Notify observers that the data set has changed

	public void add(Account item) {

		mAccounts.add(item);
		notifyDataSetChanged();

	}
	
	// Clears the list adapter of all accounts.
	
	public void clear(){

		mAccounts.clear();
		notifyDataSetChanged();
	
	}

	// Returns the number of Accounts

	@Override
	public int getCount() {

		return mAccounts.size();

	}

	// Retrieve the number of Account

	@Override
	public Object getItem(int pos) {

		return mAccounts.get(pos);

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
		final Account account = (Account)getItem(position);

		//Inflate the View for this account from account_item.xml
		View itemView = convertView;
		if (itemView == null) {
			LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			itemView = inflater.inflate(R.layout.account_item, null);
		}

		//Display account name in account name view
		final TextView accountNameView = (TextView)itemView.findViewById(R.id.account_name);
		accountNameView.setText(account.getAccountName());

		//Display account balance in account balance view
		final TextView accountBalanceView = (TextView)itemView.findViewById(R.id.account_balance);
		accountBalanceView.setText(account.getBalance().toString());

		//Display account points in account points view
		final TextView accountPointsView = (TextView)itemView.findViewById(R.id.account_saving_points);
		accountPointsView.setText(account.getSavingPoints().toString());

		return itemView;

	}
}
