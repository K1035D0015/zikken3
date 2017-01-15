/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.util.Calendar;

/**
 *
 * @author o231015t
 */

public class AutoScheduleArranger {
    
    public Schedule schedule; //受け取るスケジュール
    public int progress;
    public int scheduleID; 
    public AlarmManager alarmManager; //今回は未使用
    
    private Calendar cal = new Calendar() {

        @Override
        protected void computeTime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        protected void computeFields() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void add(int i, int i1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void roll(int i, boolean bln) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getMinimum(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getMaximum(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getGreatestMinimum(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getLeastMaximum(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    private Schedule dbschedule = null;
    
    //現在の時間を取得する関数
    void getnowTime(){ 
        cal = Calendar.getInstance(); //現在時間の取得
    }
    
    //現在の時刻にすでに設定されているスケジュールをデータベースから引っ張ってくる関数
    boolean pullSchedule(){
        //一旦リストから適切であろうリストを持ってくる必要があるため、これから考える
        Schedule tmpschedule = null;
        getnowTime(); //現在の時刻を取得する
        if(cal.compareTo(tmpschedule.startTimeA) >= 0){
            if(cal.compareTo(tmpschedule.endTimeA) <= 0)
                dbschedule = tmpschedule;
            return true;
        }
        return false;        
    }
    
    /*
    //時間を進める関数
    int manageTime(){
        int dec = 0; //次のスケジュールを発見できたかどうかの判定値
        while(dec == 1){
            s2 = new Schedule(); //進めた時間のスケジュールを参照
            cal.add(Calendar.MINUTE, 1); //時間を1分ずつ進める
            if(s2.startTimeB.equals(cal))
                dec = 1;
        }
        return 0;
    }
    */
    
    //優先順位比較関数
    boolean comparePriority(Schedule s1, Schedule s2){
        //2つのスケジュールを比較して、優先順位の高いものを採用する。       
        return s1.priority >= s2.priority;
    }
    
    /*
    //スケジュール自動設定処理関数　これはあとから手を付ける
    void autoSchedule(Schedule s1, Schedule s2){        
        int dec = 0;        
        while(dec == 1){
            boolean cmp = comparePriority(s1,s2); //比較
            if(cmp){
            //スケジュールを当てはめる
                dec = 1; //全てのスケジューリングが終了すれば終わり
            }
            else{
            //参照先を変える
                manageTime();
            }
        }
    }
    */
    
    //スケジュール追加関数
    public void addSchedule(Schedule schedule){
        //スケジュールの追加ができるかどうかの判定を行う        
        if(pullSchedule()){ //データベースにアクセスし、現時刻に保存されているスケジュールを持ってくる
            if(comparePriority(schedule, dbschedule)){ //優先順位を比較する
                //スケジュールを入れ替える作業を行う
            }//ScheduleDatebaseHandlerのadd関数を呼ぶ            
        }       
    }
    
    //進捗更新関数
    public boolean updateProgress(){ //今回は使わない
        //ScheduleDatebaseHandlerのupdate関数を呼ぶ
        return false;        
    }
    
    //スケジュール削除関数
    public boolean deteteSchedule(){ //今回は使わない
        //スケジュールの削除ができるかどうかの判定を行う        
        if(pullSchedule()){ //データベースにアクセスし、現時刻に保存されているスケジュールを持ってくる
            //スケジュールを入れ替える作業を行う（削除予定のスケジュールを優先順位０のスケジュールに置き換える）
            }//ScheduleDatebaseHandlerのadd関数を呼ぶ            
               
        //ScheduleDatebaseHandlerのdelete関数を呼ぶ
        return false;       
    }
    
}
