package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephone extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    private String phonetype;
    private String phoneNumber;


//    Many Phone --> Zoo
    @ManyToOne
    @JoinColumn(name = "zooid")
    private Zoo zoo;

    public Telephone()
    {
    }

    public Telephone(String phonetype, String phoneNumber, Zoo zoo)
    {
        this.phonetype = phonetype;
        this.phoneNumber = phoneNumber;
        this.zoo = zoo;
    }

    public long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(long phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
