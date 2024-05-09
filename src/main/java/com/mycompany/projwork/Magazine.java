//Written by Aliilani McGuire

package com.mycompany.projwork;

public class Magazine extends Publication{

    public Magazine() {
        super();
    }

    public Magazine(String t, String py) {
        super(t, py);
    }
    
    @Override
    public String toString() {
        return super.title + ", " + super.pubYear;
    }
}