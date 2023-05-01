package edu.guilford;

public class svidata {
    //Three attributes for name, address, and phone number
    private String name;
    private String address;
    private String phone_number;

    //Boolean for RadioButtons
    private Boolean below_poverty_level_B;
    private Boolean unemployed_B;
    private Boolean no_highschool_diploma_B;
    private Boolean disabled_B;
    private Boolean over_65_B;
    private Boolean single_parent_household_B;
    private Boolean minority_B;
    private Boolean limited_english_B;
    private Boolean multi_unit_housing_B;
    private Boolean mobile_homes_B;
    private Boolean crowded_housing_B;
    private Boolean no_vehicle_B;

    //Constructor that takes three String parameters
    public svidata(){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;

        //Boolean for RadioButtons
        below_poverty_level_B = true;
        unemployed_B = true;
        no_highschool_diploma_B = true;
        disabled_B = true;
        over_65_B = true;
        single_parent_household_B = true;
        minority_B = true;
        limited_english_B = true;
        multi_unit_housing_B = true;
        mobile_homes_B = true;
        crowded_housing_B = true;
        no_vehicle_B = true;



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
    //Getters and Setters for Booleans
    public Boolean getBelow_poverty_level_B(){
        return below_poverty_level_B;
    }
    public void setBelow_poverty_level_B(Boolean below_poverty_level_B){
        this.below_poverty_level_B = below_poverty_level_B;
    }
    public Boolean getUnemployed_B(){
        return unemployed_B;
    }
    public void setUnemployed_B(Boolean unemployed_B){
        this.unemployed_B = unemployed_B;
    }
    public Boolean getNo_highschool_diploma_B(){
        return no_highschool_diploma_B;
    }
    public void setNo_highschool_diploma_B(Boolean no_highschool_diploma_B){
        this.no_highschool_diploma_B = no_highschool_diploma_B;
    }
    public Boolean getDisabled_B(){
        return disabled_B;
    }
    public void setDisabled_B(Boolean disabled_B){
        this.disabled_B = disabled_B;
    }
    public Boolean getOver_65_B(){
        return over_65_B;
    }
    public void setOver_65_B(Boolean over_65_B){
        this.over_65_B = over_65_B;
    }
    public Boolean getSingle_parent_household_B(){
        return single_parent_household_B;
    }
    public void setSingle_parent_household_B(Boolean single_parent_household_B){
        this.single_parent_household_B = single_parent_household_B;
    }
    public Boolean getMinority_B(){
        return minority_B;
    }
    public void setMinority_B(Boolean minority_B){
        this.minority_B = minority_B;
    }
    public Boolean getLimited_english_B(){
        return limited_english_B;
    }
    public void setLimited_english_B(Boolean limited_english_B){
        this.limited_english_B = limited_english_B;
    }
    public Boolean getMulti_unit_housing_B(){
        return multi_unit_housing_B;
    }
    public void setMulti_unit_housing_B(Boolean multi_unit_housing_B){
        this.multi_unit_housing_B = multi_unit_housing_B;
    }
    public Boolean getMobile_homes_B(){
        return mobile_homes_B;
    }
    public void setMobile_homes_B(Boolean mobile_homes_B){
        this.mobile_homes_B = mobile_homes_B;
    }
    public Boolean getCrowded_housing_B(){
        return crowded_housing_B;
    }
    public void setCrowded_housing_B(Boolean crowded_housing_B){
        this.crowded_housing_B = crowded_housing_B;
    }
    public Boolean getNo_vehicle_B(){
        return no_vehicle_B;
    }
    public void setNo_vehicle_B(Boolean no_vehicle_B){
        this.no_vehicle_B = no_vehicle_B;
    }
    


    @Override
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phone_number;
    }
    


}
