/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.HOUR;
import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author o231035k
 */

//メイン関数

public class ScheduleListScreen extends Application {
    static ArrayList<Schedule> scheduleList;
    public ArrayList progressList;
    public AutoScheduleArranger autoScheduleArranger;
    
    
    public void reflesh(boolean isError){
     
    }
    
    public void onCheckedChanged(int FloatingActionButton, int FabView, boolean isChecked){
    
    }
    
    public void onClick(int v){ 
        
    }
    
    public void displayDeleteCheckbox(){
        
    }
    
    public void hideDeleteCheckbox(){
        
    }
    
    public void displayProgressTextbox(){
        
    }

    public void hideProgressTextbox(){
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Schedule> s = new ArrayList<>();
        Schedule a = new Schedule();
        a.title = "レポート";
        a.isEvent = false;
        //a.startTimeB.set(startTimeB.HOUR_OF_DAY, 20);
        //a.startTimeB.set(MINUTE, 00);
        //a.endTimeA.set(HOUR, 22);
        //a.startTimeB.set(MINUTE, 00);
        a.priority = 6; 
        s.add(1,a);
        System.out.println(s);
    }
    
}
