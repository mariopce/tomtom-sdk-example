package pl.saramak.mapdisplaywear

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import com.tomtom.online.sdk.map.MapView

class MainActivity : WearableActivity() {

    private lateinit var mapView: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mapView = findViewById<MapView>(R.id.map_view);
        // Enables Always-on
        setAmbientEnabled()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }
}
