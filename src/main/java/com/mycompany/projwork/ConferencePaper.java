/*
* @author: Zylar :)
*/
package com.mycompany.projwork;

public class ConferencePaper extends Publication {
    public String conferenceName;
    public Location location;
    public Period period;
    
    public ConferencePaper() {
        super();
        conferenceName = "Conference A";
        location = new Location();
        period = new Period();
    }

    public ConferencePaper(String title, String pub_year, int author_num, String conferenceName, Location location, Period period) {
        super(title, pub_year, author_num);
        this.conferenceName = conferenceName;
        this.location = location;
        this.period = period;

    }
    
    public String toString() {
        return super.toString() + ", " + conferenceName + ", " + location.toString() + ", " + period.toString();
    }
}