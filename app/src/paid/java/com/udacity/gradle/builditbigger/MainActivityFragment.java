package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    boolean isPaidVersion;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        //well this didn't work
        //View v = root.findViewById(R.id.adView);
        //if (v != null) {

        //this doesn't seem to be working either...
        isPaidVersion = getResources().getBoolean(R.bool.paid);
        Log.e("isPaid?", String.valueOf(isPaidVersion));

//        if( 3 < 7) {
//            //I don't know why it's still "error: cannot find symbol variable adView" even with this if block
//            AdView mAdView = (AdView) root.findViewById(R.id.adView);
//            // Create an ad request. Check logcat output for the hashed device ID to
//            // get test ads on a physical device. e.g.
//            // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
//            AdRequest adRequest = new AdRequest.Builder()
//                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                    .build();
//            mAdView.loadAd(adRequest);
//        }
        return root;
    }

}