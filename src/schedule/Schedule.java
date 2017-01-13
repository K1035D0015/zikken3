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
    public Calendar startTimeB; //開始時間(ユーザーが設定した時間)
    public Calendar endTimeB;   //終了時間（ユーザーが設定した時間）
    public Calendar startTimeA; //開始時間(システムが設定した時間)
    public Calendar endTimeA;   //終了時間（システムが設定した時間）
    
    
    
}
