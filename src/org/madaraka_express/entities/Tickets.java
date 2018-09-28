package org.madaraka_express.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticketId;
   
    @Column(name = "ticked_code")
    private String ticketCode;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.DETACH,
    		CascadeType.MERGE,CascadeType.PERSIST})    
    @JoinColumn(name  = "train_schedule_id")
    private TrainSchedule trainschedule;

    @Column(name = "departure_date")
    private String departureDate;

    @Column(name = "departure_return_date")
    private String departureReturnDate;

    @Column(name = "train_typet")
    private String typeINT;

    @OneToMany(mappedBy = "ticket")
    private List<Passengers> passengers;
   
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.DETACH,
    		CascadeType.MERGE,CascadeType.PERSIST})    
    @JoinColumn(name  = "user_id")
    private User user;

    @Column(name = "train_type")
    private String trainType;


    @Column(name = "date_created")
    private String dateCreated;
    
    
    

    
 



}
