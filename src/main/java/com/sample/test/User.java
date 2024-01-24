package com.sample.test;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter
    private String name;
    
    @Getter @Setter
    private String email;
    
    @Getter @Setter
    private String password;
    
    @Getter @Setter
    private String gender;
    
    @Getter @Setter
    private String note;
    
    @Getter @Setter
    private boolean married;
    
    @Getter @Setter
    private Date birthday;
    
    @Getter @Setter
    private String profession;
 
    // getters
    // setters
     
    // override toString()
 
}
