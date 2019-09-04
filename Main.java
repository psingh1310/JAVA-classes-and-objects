package com.prashant;

public class Main {

    public static void main(String[] args) {
	// Car is a class but also treated as the data type
        Car honda = new Car(); //created a new data type called honda of type Car
                 //or we created an object honda based on the template Car
        Car maruti = new Car();
     //   System.out.println("Model is " + honda.getModel());
       // honda.model = "Honda civic";
        honda.setModel("Honda Civic");
        System.out.println("Model is " + honda.getModel());

        //encapsulation is something not allowing the access to field directly but
        //providing the access using the data.
    }
}
