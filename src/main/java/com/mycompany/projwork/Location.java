/*
* @author: Zylar :)
*/
package com.mycompany.projwork;

public class Location  {
    private String locationName;

    public Location() {
        locationName = "N/A";
    }
    
    public Location(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
    
    public String toString() {
        return locationName;
    }
}