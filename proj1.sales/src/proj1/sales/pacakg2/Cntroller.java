/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1.sales.pacakg2;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Paths;
import javax.swing.JFileChooser;

/**
 *
 * @author yasmeen
 */
public class Cntroller implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
         String actioncommand = e.getActionCommand();
        System.out.println("Action" + actioncommand);
        switch (actioncommand){
            case "load_file" :
                load_file();
                break;
            case "save_file" :
                save_file();
                break;
            case "create" :
                create();
                break; 
            case "delete" :
                delete();
                break;
            case "save" :
                save();
                break;
            case "cancel" :
                cancel();
                break;
            
    }
    }

    private void load_file() {
        JFileChooser fc =  new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File headerFile = fc.getSelectedFile();
            path headerPath = Paths.get(headerFile.getAbsoluteFile());

            List<String> headerLines;
            headerLines = File.readAllLines(headerpath);
            
        }
        
        catch 
    }

    private void save_file() {
        
    }

    private void delete() {
        
    }

    private void save() {
        
    }

    private void cancel() {
    }

    private void create() {
       
    }


        
    }
    
}
