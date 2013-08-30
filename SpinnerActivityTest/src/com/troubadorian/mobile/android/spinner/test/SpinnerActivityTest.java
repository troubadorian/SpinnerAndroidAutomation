package com.troubadorian.mobile.android.spinner.test;

import com.troubadorian.mobile.android.spinner.SpinnerActivity;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class SpinnerActivityTest extends ActivityInstrumentationTestCase2<SpinnerActivity>
{
    
    private Activity mActivity = null;
    
    private Spinner mSpinner = null;
    
    private SpinnerAdapter mPlanetData;

    public SpinnerActivityTest()
    {
        super("com.troubadorian.mobile.android.spinner", SpinnerActivity.class);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        
        setActivityInitialTouchMode(false);
        
        mActivity = this.getActivity();
        
        mSpinner = (Spinner) mActivity.findViewById(com.troubadorian.mobile.android.spinner.R.id.Spinner01);
        
        mPlanetData = mSpinner.getAdapter();
        
        
        
        
    }
    
}
