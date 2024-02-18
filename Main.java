public class Main {

    public static void main(String[] args) {

       //Create instance (object) of class User
       User user = new User();
       //give value to the different variables defining user
       user.name = "Nathan";
       user.age = 29;
       user.isMen = true;

       //call function presentMySelf of user
       user.presentMySelf();

       //Do the same with a second User instance
       User user2 = new User();
       user2.name = "Sarah";
       user2.age = 28;
       user2.isMen = false;

       user2.presentMySelf();

       //print the value of user and user2, you'll see there are different
       System.out.println(user);
       System.out.println(user2);

       //insert value of user2 (the pointer/memory address to the value of the whole user2) into user
       user = user2;

       //call function presentMySelf of user and user2, you'll see that now user point to the same user as user2
       user.presentMySelf();
       user2.presentMySelf();

       //print the value of user and user2, you'll see this is the same: the memory address of user2
       System.out.println(user);
       System.out.println(user2);

       //Do the same with primitive variables
       int primitivNumber1 = 10;
       int primitivNumber2 = primitivNumber1;
       primitivNumber2 = primitivNumber2 + 1;

       //primitivNumber1 still = 10 because we insert the value of primitivNumber1 in primitivNumber2
       // so 10 in primitivNumber2 but this only a numerical value not the address of the whole object value
       // so this is not "connect" the 2 variables
       System.out.println("Valeurs des nombres primitifs :");
       System.out.println("Nombre primitif 1 : " + primitivNumber1);
       System.out.println("Nombre primitif 2 : " + primitivNumber2);


       //static variables is a class property not an istance property so when I create a new instance it's not reset his value
       System.out.println("counter (1): "+Car.counter);
//       I create a new instance of Car calling his constructor that expect for a parameter of type String
       Car car = new Car("S400");
       System.out.println("counter (2): "+car.counter);

       Car car2 = new Car("S600");
       System.out.println("counter (3): "+car2.counter);
    }
}