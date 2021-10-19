/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

/**
 *
 * @author JRKap
 */
public class profile {
    
    private String pass; 
    private String user;
    
    public profile(){
        
    }
    public profile(String pass1, String user1){ 
        this.user = user1;
        this.pass = pass1;
    }
    public String getUser(){
        return user;
    }
    public String getPass(){
        return pass;
    }
    public void setUser(String user){
        this.user = user;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public String toString(){
        return this.user + " | " + this.pass;
    }
    
    
    
    
    
    
    
}
