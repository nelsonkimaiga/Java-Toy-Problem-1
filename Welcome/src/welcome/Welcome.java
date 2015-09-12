/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package welcome;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
import java.awt.TextField;

/**
 *
 * @author Nelson Kimaiga
 */
public class Welcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      String x= JOptionPane.showInputDialog("Enter Your Names");
      //input printed out
       System.out.println("Enter Your Name");
      

        JOptionPane.showMessageDialog(null, x+ "WELCOME TO MORINGA SCHOOL!!");
        //output printed out
        System.out.println(x+"Welcome To Moringa School!");
 
        // TODO code application logic here
    }
    
}
