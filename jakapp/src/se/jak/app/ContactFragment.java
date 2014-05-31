package se.jak.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class ContactFragment extends Fragment {

	private static final String URL_MAP_JAK = "https://maps.google.com/maps?q=vasagatan+14+sk%C3%B6vde+sweden";
	
	private ImageView mMapImageView;
	
    public ContactFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact, container, false);
        
        //Clickable map image linked to the google map location of the Skövde office
        mMapImageView = (ImageView) rootView.findViewById(R.id.map);
        mMapImageView.setOnClickListener(new ImageView.OnClickListener(){
        	@Override
        	public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_MAP_JAK));
                startActivity(intent);
            }
        });
        
        return rootView;
    }
}