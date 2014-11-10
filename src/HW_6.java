
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
        FileReader reader = new FileReader("test.txt");
        BufferedReader in = new BufferedReader(reader);
        String inputLine;
        while (true) {
            inputLine = in.readLine();
            if (inputLine == null) {
                break;
            }
            String[] line = inputLine.split(":");
            st.add(new Student(line[0],line[1],line[2]));
        }
        
        
    }

}
