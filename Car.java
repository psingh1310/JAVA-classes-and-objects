package com.prashant;

public class Car {
    //public is the access modifier whic means un restricted access to the class
    //class is just the template,object is the blue print.
    //fields or variables
    private int doors;  //private means don't allow this class to be accessed outside of this car class
    private int wheels;  //we can accesss them by changing the modifier to the public
    private String model;
    private String engine ;
    private String colour;

    //why do we need geters and seters
    //method to update the model
    public void setModel(String model){
        //here model is a parameter not a field
        //this is created to update the field model

        String validModel = model.toLowerCase();
        if (model.equals("Honda Civic") || model.equals("Swift")){
            this.model = model;      //means update the field model with parameter model
        }else
        {
            this.model = "unknown";
        }

    }
    public String getModel(){
        return this.model; //model is field
    }
}
