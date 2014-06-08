package se.jak.app;

import java.util.Date;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TransactionListFragment extends ListFragment {

		private TransactionListAdapter mAdapter;
		private String mAccountName;
		public static String ACCOUNT_NAME = "AccountName";
		
		public TransactionListFragment(){}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			mAccountName = getArguments().getString(ACCOUNT_NAME);
			return super.onCreateView(inflater, container, savedInstanceState);
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			TextView header = new TextView(this.getActivity());
			header.setText(mAccountName);
			header.setTextSize(20);
			header.setPadding(20, 20, 20, 20);
			this.getListView().addHeaderView(header);
			// Create a new adapter for this ListActivity's ListView
			mAdapter = new TransactionListAdapter(getActivity());

			
			// TODO: get transactions information from account 'mAccountName' and remove hard-coded here
			mAdapter.add(new Transaction(new Date(), "Salary", 15000.0));
			mAdapter.add(new Transaction(new Date(), "Bills", -2400.0));

			setListAdapter(mAdapter);

		}
}
