package com.example.dictionary;


import java.util.ArrayList;

import android.app.Activity;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageView.ScaleType;

public class ViewPagerAdapter extends PagerAdapter {

	Activity activity;
	ArrayList<TextView> imageArray1;
	int imageArray[];
	
	
	public ViewPagerAdapter(Activity act,  ArrayList<TextView> ViewList) {
		imageArray1 = ViewList;
		activity = act;
	}
	
	
	public int getCount() {
		return imageArray1.size();
	}

	public Object instantiateItem(View collection, int position) {
		TextView view = new TextView(activity);
		view.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.FILL_PARENT));
		//view.setScaleType(ScaleType.FIT_XY);
		view = imageArray1.get(position);
		//view.setBackgroundResource(imageArray[position]);
		((ViewPager) collection).addView(view, 0);
		return view;
	}

	@Override
	public void destroyItem(View arg0, int arg1, Object arg2) {
		((ViewPager) arg0).removeView((View) arg2);
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == ((View) arg1);
	}

	@Override
	public Parcelable saveState() {
		return null;
	}
	
	
}

