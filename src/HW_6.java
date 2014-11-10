
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
public class HW_6 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Student> st = new ArrayList<Student>();
        ArrayList<Homework> hw = new ArrayList<Homework>();
        FileReader reader = new FileReader("test.txt");
        BufferedReader in = new BufferedReader(reader);
        String inputLine;

        while (true) {
            inputLine = in.readLine();
            if (inputLine == null) {
                break;
            }
            String[] line = inputLine.split(":");
            boolean check1 = true;
            for (Student s : st) {
                if (s.checkID(line[0])) {
                    s.HW.add(new Homework(line[1], line[2]));
                    check1 = false;
                    break;
                }
            }
            if (check1) {
                st.add(new Student(line[0], line[1], line[2]));
            }
            boolean check2 = true;
            for (Homework h : hw) {
                if (h.checkHW(line[1])) {
                    check2 = false;
                    break;
                }
            }
            if (check2) {
                hw.add(new Homework(line[1]));
            }
        }
        System.out.print("Student   ");
        System.out.print(" ");
        for (Homework h : hw) {
            System.out.print(h);
        }
        System.out.println("");

        for (Student s : st) {
            System.out.print(s + " ");
            for (Homework h : hw) {
                if (s.isSubmit(h.getHomework())) {
                    s.printSubmitScore(h.getHomework());
                } else {
                    System.out.print(" " + h.getScore() + " ");
                }
            }
            System.out.println("");
        }

    }

}
