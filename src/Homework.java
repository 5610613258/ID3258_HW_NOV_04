
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
public class Homework {

    //field
    public String HW;
    public String Score;

    // constructor
    Homework(String hw, String score) {
        this.HW = hw;
        this.Score = score;
    }

    Homework(String hw) {
        HW = hw;
    }

    // method
    boolean checkHW(String hw) {
        return HW.equals(hw);
    }

    void setScore(String score) {
        this.Score = score;
    }

    String getHomework() {
        return HW;
    }

    String getScore() {
        return Score;
    }

    @Override
    public String toString() {
        System.out.print(this.HW + " ");
        return "";
    }

}
