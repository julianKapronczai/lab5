/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.ArrayList;

/**
 *
 * @author JRKap
 */
public class account {
    
    private ArrayList<profile> acct = new ArrayList<profile>();
    
    public profile profile1 (String user1, String pass1){
        profile p1 = new profile();
        for(profile prof: this.acct){
        if (user1.equals(prof.getUser())&& pass1.equals(prof.getPass())){
            p1 = new profile(prof.getPass(), null);
        }else{
            p1 = null;
        }
    }
        return p1;
    }
    public account(){
        this.acct.add(new profile("abe", "password"));
        this.acct.add(new profile("barb", "password"));
    }
    
}
