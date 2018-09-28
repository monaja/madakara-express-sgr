package org.madaraka_express.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
public class Passengers {
	  public Passengers() {
	    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int passengerId;

    @Column(name = "fname")
    private String passengerFName;

    @Column(name = "sname")
    private String passengerLName;

    @Column(name = "seatNo")
    private int seatNumber;

    @Column(name = "class")
    private int typeOfClass;

     
    @Column(name = "age")
    private int age;

    @Column(name = "passport")
    private String passport;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "pass_type")
    private String passType;
    
    public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	@Column(name = "idNo")
    private String id_number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "ticket_id")
    private Tickets ticket;
    
 

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerFName() {
        return passengerFName;
    }

    public void setPassengerFName(String passengerFName) {
        this.passengerFName = passengerFName;
    }

    public String getPassengerLName() {
        return passengerLName;
    }

    public void setPassengerLName(String passengerLName) {
        this.passengerLName = passengerLName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getTypeOfClass() {
        return typeOfClass;
    }

    public void setTypeOfClass(int typeOfClass) {
        this.typeOfClass = typeOfClass;
    }

   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassType() {
        return passType;
    }

    public void setPassType(String passType) {
        this.passType = passType;
    }

   
}
