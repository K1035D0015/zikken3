/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.util.Calendar;

/**
 *
 * @author o231056s
 */
public class Schedule {
    
    public boolean isEvent; //TrueならEvent、FalseならTask
    
    public Calendar dayB;
    public Calendar dayA;
    
    public Calendar startTimeB; //開始時刻(ユーザーが設定した時間)
    public Calendar endTimeB;   //終了時刻（ユーザーが設定した時間）
    
    public Calendar startTimeA; //開始時刻(システムが設定した時間)
    public Calendar endTimeA;   //終了時刻（システムが設定した時間）
    
    public int requiredTime;    //所要時間(minutes/分)
    public Calendar deadline;   //締め切り時刻
    public String title;        //スケジュールの名前
    public String explanation;  //スケジュールの説明
    
    public int priority; //スケジュールの優先順位

    
}
