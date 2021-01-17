
package ioapplication;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class IOApplication {

    public static void main(String[] args) {

        JFileChooser filechooser=new JFileChooser();
        int chosse=filechooser.showOpenDialog(null);
        if(chosse==JFileChooser.APPROVE_OPTION)
        {
        File file=filechooser.getSelectedFile();
      //  file.deleteOnExit();
        Scanner sanner=null;
        try{
        sanner=new Scanner(file);
        while(sanner.hasNext())
        {
        String s=sanner.nextLine();
            System.out.println(s);
        
        }
        
        
        }catch(Exception E){
            E.printStackTrace();
            
        }
        
        
        finally{
       
            sanner.close();
        }
        
        
  
        }
        











    }
    
}
