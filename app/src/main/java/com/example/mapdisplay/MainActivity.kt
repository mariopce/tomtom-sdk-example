package com.example.mapdisplay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tomtom.online.sdk.common.location.LatLng
import com.tomtom.online.sdk.map.MapView
import com.tomtom.online.sdk.map.MarkerBuilder
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(Timber.DebugTree())
        mapView = findViewById<MapView>(R.id.map_view);
        mapView.addOnMapReadyCallback { tomtomMap ->
            val amsterdam = LatLng(52.36,4.88)
            tomtomMap.centerOn(amsterdam, 12)
            tomtomMap.addMarker(MarkerBuilder(amsterdam))
        }
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        mapView.onPause()
        super.onPause()

    }
}
