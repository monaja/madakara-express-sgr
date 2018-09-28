package org.madaraka_express.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "train_schedule")
public class TrainSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "train_schedule")
    private Long trainSchedule;

    @Column(name = "from_place")
    private String fromPlace;

    @Column(name = "to_place")
    private String toPlace;

    @Column(name = "std_price")
    private String stdPrice;

    @Column(name = "first_price")
    private String firstPrice;

    public TrainSchedule() {
    }

    public Long getTrainSchedule() {
        return trainSchedule;
    }

    public void setTrainSchedule(Long trainSchedule) {
        this.trainSchedule = trainSchedule;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public String getStdPrice() {
        return stdPrice;
    }

    public void setStdPrice(String stdPrice) {
        this.stdPrice = stdPrice;
    }

    public String getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(String firstPrice) {
        this.firstPrice = firstPrice;
    }

    public List<Tickets> getTrainScheduleTicket() {
        return trainScheduleTicket;
    }

    public void setTrainScheduleTicket(List<Tickets> trainScheduleTicket) {
        this.trainScheduleTicket = trainScheduleTicket;
    }

    @OneToMany(mappedBy = "trainschedule")
    private List<Tickets> trainScheduleTicket;
}
