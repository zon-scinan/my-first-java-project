
/*
 edit ---> Choosing the number + else if
      ---> Can't do this. I don't know why.

There has five programs.
 MyGregorianCalendar
 MyRandom
 SevenChakra
 Colors
 ------------- ++ User_ID ----jan12/2025
 */

import java.util.Scanner;

//PROGRAM STARTS HERE...

public class LinkingAreaVer2 { //main class starts here

    public static void main(String[]args){ //main method starts here

        System.out.print("\n");

        //User Name...
        User_ID userId = new User_ID();
        userId.another_method();

        for(int i = 0 ; i<100 ; i++) {  // for loop starts here

            System.out.print("\nGo to home = enter 'h'." +
                    "\nExit the home = enter 'e'." +
                    "\nEnter here ---> ");
            Scanner user_choice = new Scanner(System.in);
            String user_string = user_choice.nextLine();

            if (user_string.equals("h")) {   //if condition for go home starts here
                // System.out.print("\n");
                System.out.println("_____________________________________________________________This is HOME... ᓚᘏᗢ");
                System.out.println("\n1.Drawing tarot cards\n2.Your chakra\n3.Your zodiac sign and age" +
                        "\n4.Your favorite color" + "\n5.Random Item");//------------------------------------------------------add codes here

                System.out.print("\nChose the number here---> ");

                Scanner scanner = new Scanner(System.in);
                String user_number = scanner.nextLine();
                int user_number_string = Integer.parseInt(user_number);

                //switch case for user choice starts here
                switch (user_number) {
                    case "1" -> {
                        System.out.println("__________________________________________________________Program 1 open ᓚᘏᗢ");
                        System.out.println("\nYou chose program 1. "); // -----------program 1

                        MyRandom myRandom = new MyRandom();
                        myRandom.My_Random_main();
                        System.out.println("_________________________________________________________Program 1 close ᓚᘏᗢ");
                    }
                    case "2" -> {
                        System.out.println("__________________________________________________________Program 2 open ᓚᘏᗢ");
                        System.out.println("\nYou chose program 2."); // -----------program 2

                        SevenChakra sevenChakra = new SevenChakra();
                        sevenChakra.SevenChakraSubMain();
                        System.out.println("_________________________________________________________Program 2 close ᓚᘏᗢ");
                    }
                    case "3" -> {
                        System.out.println("__________________________________________________________Program 3 open ᓚᘏᗢ");
                        System.out.println("\nYou chose program 3."); // -----------program 3

                        MyGregorianCalendar myGregorianCalendar = new MyGregorianCalendar();
                        myGregorianCalendar.MyGregorianCalendar_SubMain();
                        System.out.println("_________________________________________________________Program 3 close ᓚᘏᗢ");
                    }
                    case "4" -> {
                        System.out.println("__________________________________________________________Program 4 open ᓚᘏᗢ");
                        System.out.println("\nYou chose program 4."); // -----------program 4

                        Colors colors = new Colors();
                        colors.colors_main();
                        System.out.println("_________________________________________________________Program 4 close ᓚᘏᗢ");
                    }
                    case "5" -> {
                        System.out.println("__________________________________________________________Program 5 open ᓚᘏᗢ");
                        System.out.println("\nYou chose program 5."); // -----------program 5

                        Random_Pick randomPick = new Random_Pick();
                        randomPick.random_pick_sub_main();
                        System.out.println("_________________________________________________________Program 5 close ᓚᘏᗢ");
                    }//----------------------------------------------------------------------------------add codes here
                    default ->
                            System.out.println("Oops.Something went wrong.Please enter a correct number.\nTry again.");
                }
                //switch case for user choice ends here

            }
            else if(user_string.equals("e")){
                break;

            }

            else {
                System.out.println("\nOOps.I think you put the different spelling. Please try again.\n");
            }
            //if condition for go home ends here
        }
        //for loop ends here


        //This is the whole class output starts here.
        System.out.println("\nThank you for joining us.");
        System.out.println("Hope you like it.See you " + userId.greetingFirstName + " ^-^/...");
        //System.out.println("THE PROGRAM ENDS HERE.");
        System.out.println("BYE...");
        //The whole class output ends here.
    }
    //main method ends here
}
//main class ends here

//PROGRAM ENDS HERE.

