/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenaciouspanda.jobstretch;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.LatLongBounds;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
/**
 * JPanel that shows a Google map
 * 
 * @author Simon
 */
public class MapsPanel extends JFXPanel implements MapComponentInitializedListener {
    GoogleMapView mapView;
    GoogleMap map;
    
    private boolean isInitialized = false;
    private final ArrayList<MapPanelInitializedListener> initListeners = new ArrayList();
    
    ArrayList<Marker> markers = new ArrayList();
    
    LatLongBounds bounds = null;
    
    /**
     * Create a new MapPanel
     */
    public MapsPanel(){
        super();
        
        final JFXPanel that = this;
        final MapComponentInitializedListener thisListener = this;
        
        Platform.runLater(new Runnable(){
            @Override
            public void run() {
                mapView = new GoogleMapView();
                that.setScene(new Scene(mapView));
                mapView.addMapInializedListener(thisListener);
            }
        });
    }
    
    /**
     * Mark the Panel as initialized.
     * 
     * @param state true if initialized
     */
    private void setInitialized(boolean state) {
        if(state == true && isInitialized == false){
            fireListeners();
        }
        isInitialized = state;
    }
    /**
     * Add a listener to the panel.  The listener fires when the
     * map has loaded.  If the map is already loaded, the listener fires
     * immediately
     * @param l 
     */
    public void addListener(MapPanelInitializedListener l){
        initListeners.add(l);
        if(isInitialized)
            l.onInitialized();
    }
    
    /**
     * Call each listener's callback
     */
    private void fireListeners(){
        for(MapPanelInitializedListener l : initListeners){
            l.onInitialized();
        }
    }

    /**
     * Create map and center view
     */
    @Override
    public void mapInitialized() {
        //Set the initial properties of the map.
        MapOptions mapOptions = new MapOptions();

        mapOptions.center(new LatLong(47.6097, -122.3331))
                .overviewMapControl(false)
                .panControl(false)
                .rotateControl(false)
                .scaleControl(false)
                .streetViewControl(false)
                .zoomControl(false)
                .zoom(12);

        map = mapView.createMap(mapOptions);
        
        setInitialized(true);
    }
    
    /**
     * Add a marker to the map
     * If the map is not initialized yet, no marker is added.
     * @param lat - latitude of marker
     * @param lon longitude of marker
     * @param name name of marker for label
     */
    public void addMarker(final double lat, final double lon, final String name){
        if(!isInitialized){
            Logger.getLogger(MapsPanel.class.getName()).log(Level.SEVERE, null, "map not initialized!!");
            return;
        }

        // we must run these commands on the fx thread
        Platform.runLater(new Runnable(){
            @Override
            public void run() {
                //Add a marker to the map
                MarkerOptions markerOptions = new MarkerOptions();

                markerOptions.position( new LatLong(lat, lon) )
                        .visible(Boolean.TRUE)
                        .title(name);

                Marker marker = new Marker( markerOptions );

                map.addMarker(marker);
                markers.add(marker);

                extendBounds(new LatLong(lat, lon));
                map.fitBounds(bounds);
            }
        });
    }
    
    /**
     * Clear all markers from the map.
     */
    public void clear(){
        
        if(!isInitialized){
            Logger.getLogger(MapsPanel.class.getName()).log(Level.SEVERE, null, "map not initialized!!");
            return;
        }
        // we must run these commands on the fx thread
        Platform.runLater(new Runnable(){
            @Override
            public void run() {
                for(Marker m : markers)
                    map.removeMarker(m);
                markers.clear();
            }
        });
    }
    
    /**
     * Extend the current view bounds to include loc.
     * @param loc - latitude and longitude of coordinate to add.
     */
    private void extendBounds(LatLong loc){
        if(bounds == null){
            bounds = new LatLongBounds(loc, loc);
        }else{
            LatLong sw = new LatLong(
                    Math.min(loc.getLatitude(), bounds.getSouthWest().getLatitude()),
                    Math.min(loc.getLongitude(), bounds.getSouthWest().getLongitude())
            );
            LatLong ne = new LatLong(
                    Math.max(loc.getLatitude(), bounds.getNorthEast().getLatitude()),
                    Math.max(loc.getLongitude(), bounds.getNorthEast().getLongitude())
            );
            bounds = new LatLongBounds(sw, ne);
        }
    }
}
