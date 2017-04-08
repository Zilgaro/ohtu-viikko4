package ohtu;

import java.util.ArrayList;

public class Submission {

    private String student_number;
    private int week;
    private int hours;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
    private ArrayList<Integer> done = new ArrayList<>();
    private Course course;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getWeek() {
        return this.week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean getA1() {
        if (a1) {
            done.add(1);
        }
        return a1;
    }

    public boolean getA2() {
        if (a2) {
            done.add(2);
        }
        return a2;
    }

    public boolean getA3() {
        if (a3) {
            done.add(3);
        }
        return a3;
    }

    public boolean getA4() {
        if (a4) {
            done.add(4);
        }
        return a4;
    }

    public boolean getA5() {
        if (a5) {
            done.add(5);
        }
        return a5;
    }

    public boolean getA6() {
        if (a6) {
            done.add(6);
        }
        return a6;
    }

    public boolean getA7() {
        if (a7) {
            done.add(7);
        }
        return a7;
    }

    public boolean getA8() {
        if (a8) {
            done.add(8);
        }
        return a8;
    }

    public boolean getA9() {
        if (a9) {
            done.add(9);
        }
        return a9;
    }

    public boolean getA10() {
        if (a10) {
            done.add(10);
        }
        return a10;
    }

    public boolean getA11() {
        if (a11) {
            done.add(11);
        }
        return a11;
    }

    public boolean getA12() {
        if (a12) {
            done.add(12);
        }
        return a12;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;
    }

    public String getDoneString() {
        String doneString = "";

        for (int i : done) {
            doneString += i + " ";
        }
        return doneString;
    }

    public int getDoneSize() {
        return done.size();
    }

    public void checkDone() {
        //ttu tää on tyhmää
        getA1();
        getA2();
        getA3();
        getA4();
        getA5();
        getA6();
        getA7();
        getA8();
        getA9();
        getA10();
        getA11();
        getA12();
    }

    @Override
    public String toString() {
        checkDone();
        return "viikko " + this.week + ": tehtyjä tehtäviä yhteensä: "
                + this.done.size() + " (maksimi " + this.getWeeklyMax() + ")" + 
                ", aikaa kului " + this.hours + " tuntia, "
                + "tehdyt tehtävät: " + this.getDoneString();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getWeeklyMax() {

        if (week == 1) {
            return course.getWeek1();
        } else if (week == 2) {
            return course.getWeek2();
        } else if (week == 3) {
            return course.getWeek3();
        } else if (week == 4) {
            return course.getWeek4();
        }
        return 0;
    }

}
