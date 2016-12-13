/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenaciouspanda.jobstretch;

/**
 * Implement this interface to receive notifications when a MapPanel 
 * is fully initialized
 * @author Simon
 */
public interface MapPanelInitializedListener {
    
    /**
     * Fired when map is initialized
     */
    public void onInitialized();
}
