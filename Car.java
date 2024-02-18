public class Car {

//    static variable, only one instance of the variable is created in the memory
    //it's a class' variable and not depend on any instance created with this class
    public static int counter;

    //these are instance variables
    public int wheelsCount = 4;
    public String companyName;
    public String model;
    public int motorVolume;

    //constructor: special function without name but with return type same has the class name
    //it's called when we want o create a new instance of this class (new Car())
    //also if you don't write it in your code, each class have a default constructor
    //this constructor expect to receive a parameter of type String when we call it (new Car(""))
    public Car(String model1){
        //assign the passed value to the constructor when called to the variable model for the created instance
        model = model1;
        //we increase the static variable counter value by 1 each time we call the constructor
        // so it usefully to count the number of instance we create of this class
        counter = counter + 1;
    }

    public void drive(){
        System.out.println("I'm driving");
    }
}
