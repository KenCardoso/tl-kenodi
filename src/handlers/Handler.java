/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import java.sql.Timestamp;


/**
 *
 * @author kenca
 */
public class Handler {

    /**
     *
     */
    public String[] log_status = new String[50];
    
    public Handler(){
        log_status[49] = "Goodbye\n";
        log_status[0] = "Closing application\n";
        log_status[1] = "Starting application\n";
    }
    
    
    public String getLog(int level){
        return log_status[level];
    }
    public void test(){
        System.err.println("hello");
    };
    public String getTime(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        return String.valueOf(timestamp)+" - ";
    }
    
}

