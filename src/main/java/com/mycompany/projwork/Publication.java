package com.mycompany.projwork;
//Kala :D

import java.util.Arrays;


public class Publication {
    public Author[] author_list;
    public String title, pubYear;

    public Publication() {
        title = "N/A";
        pubYear = "1969";
        author_list = new Author[0];
    }

    public Publication(String title, String py, int authNum){
        this.title = title;
        pubYear = py;
        author_list = new Author[authNum];
    }

    public Publication(String title, String py){
        this.title = title;
        pubYear=py;
    }
    
    @Override
    public String toString() {
        return title + ", " + Arrays.toString(author_list) + ", " + pubYear;
    }
}
