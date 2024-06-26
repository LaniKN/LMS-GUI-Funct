package com.mycompany.projwork;

//Patrick Siegler
public class Dissertation extends Publication{
    public String title, pubYear;
    public int authNum;
    public Department department;
    public CommitteeMember[] committeeMembers;
    public Chapters chapters;
    public Figures figures;

    public Dissertation(){
        super();
        department = new Department();
        committeeMembers = new CommitteeMember[0];
        chapters = new Chapters();
        figures = new Figures();
    }

    public Dissertation(String title, String publicationYear, Department department, int committeeMembersNum, Chapters chapters, Figures figures){
        super(title, publicationYear, 1);
        this.department = department;
        committeeMembers = new CommitteeMember[committeeMembersNum];
        this.chapters = chapters;
        this.figures = figures;
    }


    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
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
        
        return super.toString() + ", " + department.toString() + ", " + comMems  + ", " + chapters.toString() + ", " + figures.toString();
    }
}
