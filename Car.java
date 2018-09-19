/* By Ajmal shah
   SIMPLE WAY TO UNDERSTAND THE WORKING OF CONSTRUCTOR AND METHOD IN JAVA.
   play and modify with the code untill you're a expert.

REMEMBER: CONSTRUCTOR -  has no return type and are as the same name as the class.
                         They can be called/involked without the .dot operator.
          METHODS -  has a return type everytime evenvif there is no data to be returned, void 
                     return type specifies that. always return the correct type.
          
*/
package car;
import java.util.*;

public class Car  //class name car is the blueprint for the objects to work.
{

    private int maxspeed, noofdoors; // private type variable of type integer.
  
    public Car(int speed,int doors) // a constructor,which are as the same name of a class and does not have a return type.
    { // Its a parameterised constructor having two integer type variables for passing the value.
        noofdoors = doors; //passing the values of given variable doors to noofdoors.
        
        maxspeed = speed;  // variable value passing as above.
        
        System.out.println(" No of doors "+noofdoors+"\n Max speed "+maxspeed); // prints the value that is passed.
    }
    
    public int howfastcanitgo(int total) // a parameterised Method of return type int.
    {
        int newspeed = maxspeed+total; //adiing new passed value to the maxspeed to get new speed.
        
        return newspeed; // returning the value newspeed.
    }
    public static void main(String[] args)  // main
    {   //pass different values in the bellow function brackets for different answers.
    
        Car newcar = new Car(130,2); // creating an object of the class and involking the Constructor.
        
        int totalspeed =newcar.howfastcanitgo(60); /*  calling the member functin using the object and (.) dot operator 
                                                       and saving the value to totalspeed */
        
        System.out.println("Total Speed =" + totalspeed); // prints total speed.
    
    }
    
    
}
