package edu.niitict.highlightfootball.adapter;

import edu.niitict.highlightfootball.main.ChanelsFragment;
import edu.niitict.highlightfootball.main.NowFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
	final int PAGE_COUNT = 2;

	/** Constructor of the class */
	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	/** This method will be invoked when a page is requested to create */
	@Override
	public Fragment getItem(int arg0) {

		Fragment fragment = new NowFragment();
		switch (arg0) {
		case 0:
			fragment = new NowFragment();
			break;
		case 1:
			fragment = new ChanelsFragment();
			break;
		}
		return fragment;
	}

	/** Returns the number of pages */
	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		String title = "";
		switch (position) {
		case 0:
			title = "Now";
			break;
		case 1:
			title = "Chanels";
			break;
		}
		return title;

	}

}
