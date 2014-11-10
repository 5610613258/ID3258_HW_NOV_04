
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Student {

    // field
    private String ID;
    ArrayList<Homework> HW = new ArrayList<Homework>();

    // constructor
    Student(String id, String hw, String score) {
        ID = id;
        HW.add(new Homework(hw, score));
    }

    Student(String id) {
        ID = id;
    }

    // method
    boolean checkID(String id) {
        return ID.equals(id);
    }

    boolean isSubmit(String hw) {
        for (Homework h : HW) {
            if (h.getHomework().equals(hw)) {
                return true;
            }
        }
        return false;
    }

    public void printSubmitScore(String hw) {
        for (Homework h : HW) {
            if (h.getHomework().equals(hw)) {
                System.out.printf(" %2d ", Integer.parseInt(h.getScore()));
                break;
            }
        }
    }

    @Override
    public String toString() {
        System.out.print(this.ID);
        return "";
    }

}
