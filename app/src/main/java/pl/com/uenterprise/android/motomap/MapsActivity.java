package pl.com.uenterprise.android.motomap;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.mapbox.mapboxsdk.overlay.GpsLocationProvider;
import com.mapbox.mapboxsdk.overlay.UserLocationOverlay;
import com.mapbox.mapboxsdk.views.MapView;

public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        MapView mv = (MapView) findViewById(R.id.mapview);
        mv.setMinZoomLevel(mv.getTileProvider().getMinimumZoomLevel());
        mv.setMaxZoomLevel(mv.getTileProvider().getMaximumZoomLevel());
        mv.setCenter(mv.getTileProvider().getCenterCoordinate());
        mv.setZoom(0);

        // Adds an icon that shows location
        UserLocationOverlay myLocationOverlay = new UserLocationOverlay(new GpsLocationProvider(this), mv);
        myLocationOverlay.setDrawAccuracyEnabled(true);
        mv.getOverlays().add(myLocationOverlay);

        //komentarz testowy 2


    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
