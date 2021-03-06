package com.example.ellie.instacut_master;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.ellie.instacut_master.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Los Angeles, California, and move the camera.
        LatLng losangeles = new LatLng(34.054384, -118.254972);
        mMap.addMarker(new MarkerOptions().position(losangeles).title("Marker in Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(losangeles));
    }
}
