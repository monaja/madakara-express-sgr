package org.madaraka_express.entities;

import javax.persistence.*;
  

@Entity
@Table(name = "fare")
public class Fare {

    public Fare() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fare_id")
    private int fareId;

    @Column(name = "total")
    private int total;

    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.DETACH,
    		CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name="ticket_id")
    Tickets ticketFares;



    public int getFareId() {
        return fareId;
    }

    public void setFareId(int fareId) {
        this.fareId = fareId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

	public Tickets getTicketFares() {
		return ticketFares;
	}

	public void setTicketFares(Tickets ticketFares) {
		this.ticketFares = ticketFares;
	}

   
}
