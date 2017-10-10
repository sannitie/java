package slit.db;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snorr
 */

@Entity
public class User implements Serializable {
    
    @Id
    private String username;
    private String password;

    
    public User() {
        
    }
    
    public User(String username, String password) {
        this.password = password;
        this.username = username;
    
}
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
