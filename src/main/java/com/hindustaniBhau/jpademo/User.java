package com.hindustaniBhau.jpademo;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")        // table name is user_info instead class name User
// Bydefault the table name is the class name but to change the table name use annotation @Table(name=""), Table name get changed.
public class User {
    /* while class is empty and having @entity annotation it shows the error becoz there should be a primary key attibute,
    which is a basic requirement of any table.
    */
    @Id         // this annotation defines that the following attribute is the primary key for the table.
    @Column(name="id")      //annotation @Column(name =" ") change the column name of the table from roll no to id
    int rollNo;         // however in the app the attribute will remain as Rollno but in database it will become id instead of rollNo.
    String name;
    int age;
    String mobNo;
/* By now IF executed the database will not get created, so it will not create the table
so we have to connect to the database.
*/
    public User(){  //no-arg constructor

    }
// allparameter constructor
    public User(int rollNo, String name, int age, String mobNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }
    //Getter and Setter
    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public String getName() { return name;   }
    public void setName(String name) { this.name = name;    }

    public int getAge() { return age;     }
    public void setAge(int age) { this.age = age; }

    public String getMobileNo() { return mobNo;     }
    public void setMobileNo(String mobileNo) { this.mobNo = mobileNo;     }
}
