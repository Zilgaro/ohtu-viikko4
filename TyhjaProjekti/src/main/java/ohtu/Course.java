/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

/**
 *
 * @author Zilgaro
 */
public class Course {
    private String name;
    private String term;
    private int week1;
    private int week2;
    private int week3;
    private int week4;
    //etc.
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getTerm() {
        return term;
    }

 
    public void setTerm(String term) {
        this.term = term;
    }


    public int getWeek1() {
        return week1;
    }


    public void setWeek1(int week1) {
        this.week1 = week1;
    }


    public int getWeek2() {
        return week2;
    }

    public void setWeek2(int week2) {
        this.week2 = week2;
    }


    public int getWeek3() {
        return week3;
    }


    public void setWeek3(int week3) {
        this.week3 = week3;
    }


    public int getWeek4() {
        return week4;
    }


    public void setWeek4(int week4) {
        this.week4 = week4;
    }
    
    @Override
    public String toString() {
        return "Kurssi: " + name + ", " + term;
    }
}
