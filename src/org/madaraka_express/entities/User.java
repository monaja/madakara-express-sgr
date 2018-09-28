package org.madaraka_express.entities;

import javax.persistence.*;
//import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
public class User {
	 public User() {
	    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "fname")
    private String fName;

    @Column(name = "sname")
    private String sName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "idNo")
    private String id_no;

    @Column(name = "username")
    private String userName;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "password")
    private String password;

    @Column(name = "passport")
    private String passport;

    @OneToMany(mappedBy = "user")
    private List<Tickets> userTickets;
   

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getid_no() {
        return id_no;
    }

    public void setid_no(String idNo) {
        this.id_no = idNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public List<Tickets> getUserTickets() {
        return userTickets;
    }
    
    public void setUserTickets(List<Tickets> userTickets) {
        this.userTickets = userTickets;
    }
}
