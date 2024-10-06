package com.pluralsight;

public class CellPhone {

    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;

    public CellPhone(){
        serialNum = 0;
        model = "";
        carrier = "";
        phoneNum = "";
        owner = "";
    }

    public int getSerialNum() {
        return this.serialNum;
    }
    public void setSerialNum(int serialNum){
        this.serialNum = serialNum;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String Model){
        this.model = Model;
    }

    public String getCarrier() {
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public String dial(String _phoneNum){
        return this.owner + "'s Phone is calling " + _phoneNum;

    }





}
