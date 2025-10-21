/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {

    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour

    public Course(String n, String numb, int ch) {
        name = n;
        number = numb;
        credits = ch;

    }

    public String getCourseNumber() {
        return number;
    }

    public void setCourseNumber(String number) {
        this.number = number;
    }

    public String getCourseName() {
        return name;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public void setCoursePrice(int price) {
        this.price = price;
    }

    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;
    
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
@Override
    public String toString(){
            
        return getCourseNumber();
    }    
    
}