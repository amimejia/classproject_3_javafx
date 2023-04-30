package edu.guilford;

public class svidata {
    //Three attributes for name, address, and phone number
    private String name;
    private String address;
    private String phone_number;

    //Constructor that takes three String parameters
    public svidata(String name, String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    //getters and setters for each attribute
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phone_number;
    }
    


}
