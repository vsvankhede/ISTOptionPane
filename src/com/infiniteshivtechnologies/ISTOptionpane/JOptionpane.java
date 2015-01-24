package com.infiniteshivtechnologies.ISTOptionpane;


public class JOptionpane {
    
    ISTMainFrame frame = new ISTMainFrame();
    
    public void displaypane(String title,String question){
    
        ISTMainFrame.title_lab.setText(title);
        ISTMainFrame.question_lab.setText(question);
        
        frame.setVisible(true);
    }
    
    public static boolean getState(){
        boolean temp = false;
    
        if(ISTMainFrame.option == true){
        temp = true;
        }else if(ISTMainFrame.option == false){
        temp = false;
        }
        return temp;
    }
    
}
