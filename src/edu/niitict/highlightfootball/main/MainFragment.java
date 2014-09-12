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

public class MainFragment extends Fragment {
	private ViewPager pager;
	private MyFragmentPagerAdapter pagerAdapter;
	private FragmentManager fm;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		fm = getActivity().getSupportFragmentManager();
		pager = (ViewPager) rootView.findViewById(R.id.pager);
		pagerAdapter = new MyFragmentPagerAdapter(fm);
		pager.setAdapter(pagerAdapter);
		return rootView;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		fm = getActivity().getSupportFragmentManager();
		pagerAdapter = new MyFragmentPagerAdapter(fm);
		pagerAdapter.notifyDataSetChanged();

	}
}
