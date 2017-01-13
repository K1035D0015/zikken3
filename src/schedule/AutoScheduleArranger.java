/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeFunction.call;


/**
 *
 * @author baseball
 */
public class AutoScheduleArranger {
    Calendar cal = Calendar.getInstance(); //現在時間の取得
    Schedule s1 = new Schedule(); //受け取るスケジュール
    Schedule s2 = new Schedule(); //参照するスケジュール
    
    //時間を進める関数
    void manageTime(){
        cal.add(Calendar.MINUTE, 1);
    }
    
    //優先順位比較関数
    boolean comparePriority(Schedule s1, Schedule s2){
        //2つのスケジュールを比較して、優先順位の高いものを採用する。
        int cmp = s2.compareTo(s1);
        if(cmp >= 0)
            return true;
        return false;       
    }
    
    void autoSchedule(){ //スケジュール自動設定処理関数
        boolean comparePriority = comparePriority(s1,s2); //比較
    }
    
    //スケジュール追加関数
    public void addSchedule(){
        //ScheduleDatebaseHandlerのadd関数を呼ぶ
    }
    
    //進捗更新関数
    public boolean updateProgress(){
        //ScheduleDatebaseHandlerのupdate関数を呼ぶ
        return false;        
    }
    
    //スケジュール削除関数
    public boolean deteteSchedule(){
        //ScheduleDatebaseHandlerのdelete関数を呼ぶ
        return false;       
    }
    
}
