/*
 * @author Zylar :)
 */
package com.mycompany.projwork;

public class Period {
    public String beginDate;
    public String endDate;
    
    public Period(){
        beginDate = "01/01/2024";
        endDate = "01/05/2024";
    }

    public Period(String beginDate, String endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
    
    public String toString() {
        return beginDate + "-" + endDate;
    }
}