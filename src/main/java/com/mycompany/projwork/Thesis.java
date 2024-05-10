package com.mycompany.projwork;

//Cherico Welch
public class Thesis extends Publication{
    //public String title, pubYear;
    public Department department;
    public CommitteeMember[] committeeMembers;
    public Chapters chapters;
    public Figures figures;

    public Thesis(){
        super();
        department = new Department();
        committeeMembers = new CommitteeMember[0];
        chapters = new Chapters();
        figures = new Figures();
    }

    public Thesis(String title, String publicationYear, Department department, int committeeMembersNum, Chapters chapters, Figures figures) {
        super(title, publicationYear, 1);
        this.department = department;
        committeeMembers = new CommitteeMember[committeeMembersNum];
        this.chapters = chapters;
        this.figures = figures;
    }

    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapter) {
        this.chapters = chapter;
    }

    public Figures getFigures() {
        return figures;
    }

    public void setFigures(Figures figures) {
        this.figures = figures;
    }
    
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (CommitteeMember comMem : committeeMembers){
            stringBuilder.append(comMem.toString());
            stringBuilder.append(", ");
        }
        String comMems = stringBuilder.toString();
        
        return super.toString() + ", " + comMems  + ", " + chapters.toString() + ", " + figures.toString();
    }
    
}

