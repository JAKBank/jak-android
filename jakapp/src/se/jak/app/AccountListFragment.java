package se.jak.app;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class AccountListFragment extends ListFragment {

	private AccountListAdapter mAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		// Create a new adapter for this ListActivity's ListView
		mAdapter = new AccountListAdapter(getActivity());

		// TODO: get account information and remove hard-coded here
		mAdapter.add(new Account("Transaktionskonto", 3000, 56000));
		mAdapter.add(new Account("Baskonto", 12000, 900400523));

		setListAdapter(mAdapter);

	}
	
	@Override
	public void onListItemClick(ListView lv, View v, int position, long id) {
		//TODO: show account balance details
	}
}
