//Written by Aliilani McGuire

package com.mycompany.projwork;

public class JournalPaper extends Publication {
    public String journal_title;

    public JournalPaper() {
        super();
        journal_title = "N/A";
    }
    public JournalPaper(String t, String py, int an, String jt) {
        super(t, py, an);
        journal_title = jt;
    }
    
    public String toString() {
        return super.toString() + ", " + journal_title;
    }
}