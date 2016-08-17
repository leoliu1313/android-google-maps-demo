package com.example.mapdemo;

import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class LogLocation implements TrackLocation.Listener {

    // TODO Log location updates
    // Use MapsActivity.TAG
    // Use the map too and get creative.
    // See CircleLocation for an example.
    @Override
    public void accept(GoogleMap map, LatLng location) {
        Log.d(MapsActivity.TAG, "Location update: " + location);
    }

}
