//Written by Aliilani McGuire
package com.mycompany.projwork;

public class CommitteeMember{
    public String fn, ln;

    public CommitteeMember() {
        fn="N/A";
        ln="N/A";
    }
    public CommitteeMember(String fn, String ln) {
        this.fn = fn;
        this.ln = ln;
    }
    
    public String toString() {
        return fn + ", " + ln;
    }
}