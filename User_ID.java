
/*

This is a program for entering user's name.
Using one constructor and one method...

 */

import java.util.Scanner;

//main class starts here
public class User_ID {

    //data members
    String name;
    String greetingFirstName;
    String greetingFullName;



    //constructor for initialization and setting user's name
    public User_ID(String userName){
        name = userName;

    }


    public User_ID(){

    }


    //method for return userFirstName
    public String getName(){
        return name;
    }




    //another method
    public void another_method(){

        //declare obj for User_ID class
        User_ID userID_first_name,userID_last_name;



        //-----------------------------using scanner method starts here
        //declare scanner obj
        Scanner scanner;

        //create obj
        scanner = new Scanner(System.in);

        System.out.print("Enter your first name ---> ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name ---> ");
        String lastName = scanner.nextLine();

        //-------------------------------using scanner method ends here


        //create obj and set argument to constructor
        userID_first_name = new User_ID(firstName);
        userID_last_name = new User_ID(lastName);

        //out put to console window
        System.out.println("\nHello " + userID_first_name.getName() +
                " " + userID_last_name.getName() + "." + "\nWelcome to HOME.🍵");

        greetingFirstName = userID_first_name.name;
        greetingFullName = userID_first_name.name + userID_last_name.name;

    }

    //main method starts here
    public static void main(String[]args){

        User_ID userId = new User_ID();
        userId.another_method();
    }
    //main method ends here

}
//main class ends here

