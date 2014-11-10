
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
    private String id;
    private String hw;
    private String score;

    // constructor

    Student(String id, String hw ,String score) {
        this.id = id;
        this.hw = hw;
        this.score = score;
    }

    Student() {
        this.id = null;
        this.hw = null;
        this.score = null;
    }
    
    
   
}
