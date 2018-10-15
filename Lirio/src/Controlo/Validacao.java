/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlo;
  
    import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Validacao {
  
/**
 *
 */
    public  static void naoPermitirNumeros(java.awt.event.KeyEvent evt, JTextField tf) {
        //To change body of generated methods, choose Tools | Templates.
        if(evt.getKeyCode()==KeyEvent.VK_0 ||
                evt.getKeyCode()==KeyEvent.VK_1 ||
                evt.getKeyCode()==KeyEvent.VK_2 ||
                evt.getKeyCode()==KeyEvent.VK_3 ||
                evt.getKeyCode()==KeyEvent.VK_4 ||
                evt.getKeyCode()==KeyEvent.VK_5 ||
                evt.getKeyCode()==KeyEvent.VK_6 ||
                evt.getKeyCode()==KeyEvent.VK_7 ||
                evt.getKeyCode()==KeyEvent.VK_8 ||
                evt.getKeyCode()==KeyEvent.VK_9 ){
            
            tf.setEditable(false);
            tf.setBackground(Color.red);
        }else{
              tf.setEditable(true);
            tf.setBackground(Color.white);  
        }
    }
     
    /**
 * 
 * @param tf
 * @param s 
 */
    public  static void perderFoco(JTextField tf, String s) {
     if(tf.getText().equals("")){
        tf.setText(s);
        //tf.setBackground(Color.white);
        }else tf.setBackground(Color.white);
    }

    /**
     * 
     * @param evt
     * @param tf 
     */
    public  static void permitirSoNumeros(java.awt.event.KeyEvent evt, JTextField tf) {
          if(evt.getKeyCode()==KeyEvent.VK_0 ||
                evt.getKeyCode()==KeyEvent.VK_1 ||
                evt.getKeyCode()==KeyEvent.VK_2 ||
                evt.getKeyCode()==KeyEvent.VK_3 ||
                evt.getKeyCode()==KeyEvent.VK_4 ||
                evt.getKeyCode()==KeyEvent.VK_5 ||
                evt.getKeyCode()==KeyEvent.VK_6 ||
                evt.getKeyCode()==KeyEvent.VK_7 ||
                evt.getKeyCode()==KeyEvent.VK_8 ||
                evt.getKeyCode()==KeyEvent.VK_9 ||
                evt.getKeyCode()==KeyEvent.VK_ENTER ||
                evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
            
              tf.setEditable(true);
            tf.setBackground(Color.white);  
        }else{
            tf.setEditable(false);
            tf.setBackground(Color.red);
        }
     
    }
    

    public  static void proximaField(java.awt.event.KeyEvent evt, JTextField tfP) {
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
              tfP.requestFocus(); 
          }
        }
    
    
    
    public static void proximoRadio(java.awt.event.KeyEvent evt, JRadioButton tfP) {
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          tfP.requestFocus();
          
      }}
    
     public static void proximaButton(java.awt.event.KeyEvent evt, JButton tfP) {
         if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
             tfP.requestFocus();
         }
    }
     
      public static void proximaBox(java.awt.event.KeyEvent evt, JComboBox<String> tfP) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
             tfP.requestFocus();
         }
    }
    
 
    public  static void ganharFocus(JTextField tf,String s) {
        if(tf.getText().equals(s)){
        tf.setText("");
       
        tf.setBackground(Color.white);
      } //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public  static void verificarField(JTextField tf,String s) {
        if(tf.getText().equals(s)){
              tf.requestFocus(); 
              tf.setBackground(Color.red);
          }else  tf.setBackground(Color.white);
    }

   

   

}
