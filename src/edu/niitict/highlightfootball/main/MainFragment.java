package edu.niitict.highlightfootball.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.niitict.highlightfootball.adapter.MyFragmentPagerAdapter;
import edu.niitict.higlightfootball.R;

public class MainFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		ViewPager pager = (ViewPager) rootView.findViewById(R.id.pager);
		FragmentManager fm = getActivity().getSupportFragmentManager();
		/** Instantiating FragmentPagerAdapter */
		MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(fm);
		/** Setting the pagerAdapter to the pager object */
		pager.setAdapter(pagerAdapter);
		return rootView;
	}
}
