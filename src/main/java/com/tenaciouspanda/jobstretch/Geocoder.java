package com.tenaciouspanda.jobstretch;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.tenaciouspanda.jobstretch.database.LatLng;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides Geolocation Services.
 * 
 * @author Simon
 */
public class Geocoder {
    private String api_key = "AIzaSyBIG3n-yCC830m-wQ5fkvWfZOYhDP8Ah58";
    private GeoApiContext context;
    
    /**
     * Create a new Geocoder
     */
    public Geocoder(){
        context = new GeoApiContext().setApiKey(api_key);
    }
    
    /**
     * convert a string into a latitude and logitude
     * null if location not found
     * @param location - string location
     * @return LatLng of location
     */
    public LatLng geocode(String location) {
        LatLng result = null;
        if(context == null)
            throw new IllegalStateException("Must initialize Geocoder before use");
        
        try {
            GeocodingResult gr = GeocodingApi.geocode(context,
                    location).await()[0];
            double lat = gr.geometry.location.lat;
            double lng = gr.geometry.location.lng;
            return new LatLng((float)lat, (float)lng);
        } catch (ArrayIndexOutOfBoundsException ex){
            Logger.getLogger(Geocoder.class.getName()).log(Level.INFO, "no location found for {0}", location);
        }catch (Exception ex) {
            Logger.getLogger(Geocoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new LatLng(0, 0);
    }
}
