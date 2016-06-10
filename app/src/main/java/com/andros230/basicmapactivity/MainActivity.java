package com.andros230.basicmapactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;

public class MainActivity extends Activity implements AMap.OnMarkerClickListener, AMap.OnInfoWindowClickListener{
    private MapView mMapView;
    private AMap aMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapView = (MapView) findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);


        
        if (aMap == null) {
            aMap = mMapView.getMap();
        }
        aMap.setOnMarkerClickListener(this);  //设置点击marker事件监听器
        aMap.setOnInfoWindowClickListener(this);// 设置点击infoWindow事件监听器

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(new LatLng(31.20998,121.476077));
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
        markerOptions.title("标注窗口消息");
        Marker marker = aMap.addMarker(markerOptions);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMapView.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mMapView.onSaveInstanceState(outState);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Log.d("---","onMarkerClick");
        return false;
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        Log.d("---","onInfoWindowClick");
    }
}
