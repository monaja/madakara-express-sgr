package org.madaraka_express.entities;

import javax.persistence.*;

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "status")
    private int status;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "trans_type")
    private String transactionType;
    
    @Column(name = "trans_number")
    private String transactionNumber;

    public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ticket_id")
    private Fare fareId;

    public Payment() {
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Fare getFareId() {
        return fareId;
    }

    public void setFareId(Fare fareId) {
        this.fareId = fareId;
    }
}
