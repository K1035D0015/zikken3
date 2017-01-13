/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import schedule.ScheduleListScreen.Schedule;


/**
 *
 * @author baseball
 */
public class AutoScheduleArranger {
    private Object a;
    List = new ArrayList;

    
    
    //スケジュール追加関数
    public boolean addSchedule(){
        //ScheduleDatebaseHandlerのadd関数を呼ぶ
    }
    
    //進捗更新関数
    public void updateProgress(){
        //ScheduleDatebaseHandlerのupdate関数を呼ぶ        
    }
    
    //スケジュール削除関数
    public void deteteSchedule(){
        //ScheduleDatebaseHandlerのdelete関数を呼ぶ       
    }
    
    //現在の時間を取得する関数
    void nowTime(){
        Date d = new Date();
    }
    
    //スケジュール取得関数
    void acquisition(){
        //各方面から送られたスケジュールを習得する                
    }       
    
    //データベーススケジュール取得関数
    void getSchedule(){
        //データベースからスケジュールを取得する
        
    }
    
    //優先順位比較関数
    boolean Priority(){       
        Schedule s = new Schedule();
        
        //2つのスケジュールを比較して、優先順位の高いものを採用する。
        if( a.compare(i,j) == 0)
            return false;
        return false;       
    }
}
