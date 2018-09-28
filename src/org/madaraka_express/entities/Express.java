package org.madaraka_express.entities;

import javax.persistence.*;

@Entity
@Table(name = "express")
public class Express {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "express_id")
    private Long express_id;

    @Column(name = "from_place")
    private String from_place;

    @Column(name = "to_place")
    private String to_place;

    @Column(name = "price")
    private int price;

    public Express() {
    } 
    public Long getExpress_id() {
        return express_id;
    }

    public void setExpress_id(Long express_id) {
        this.express_id = express_id;
    }

    public String getFrom_place() {
        return from_place;
    }

    public void setFrom_place(String from_place) {
        this.from_place = from_place;
    }

    public String getTo_place() {
        return to_place;
    }

    public void setTo_place(String to_place) {
        this.to_place = to_place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
