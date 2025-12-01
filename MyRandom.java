
import java.util.*;
/*
 * This is a small program of picking tarot cards. PTC 6:45
 *
 * Follow the rhythm...
 *
 * Deep breath and let it flow... Universe will control where you go...
 * Surrender with inner peace... That is everything what you need...
 *
 *
 * */




//PROGRAM STARTS HERE...

public class MyRandom {
    public static void main(String[]args){
       // MyRandom myRandom = new MyRandom();
       // myRandom.My_Random_main();


    }

    public void My_Random_main(){


        //declaring random class's instance, variables and scanner's obj, arrayList, arraySize
        Random random;  // for random

        int tricky_Number;

        int your_Card=0;  // for variable and initialize your_Card
        String user_Choice;

        Scanner scanner;  // for scanner your_Card
        Scanner scanner1; // for scanner number_Of_Times

        ArrayList<Integer> your_Card_Array;  // for array <---------------------------------------------------add code 1
        your_Card_Array = null; // initialize arrayList

        //creating array class's obj
        your_Card_Array = new ArrayList<Integer>();  //<------------------------------------------------------add code 2


        //initializing text styles
        //String text_Style_1 = "Your random number on the world is ";
        String ending_Text_Style_1 = """
                
                Thanks for using  little program! And let me know if you like this.

                                    Bye for now.^-^/""";
        System.out.println("""
                
                Enter number of cards , if you say yes\
              
                If you want to  chose the card, enter small letter s\

                if you want to end the task, enter small letter f. Got it? \

                ^-^/ Let's starts! I am so exciting!""");

        int number_Of_Cards;

        scanner1 = new Scanner(System.in);
        System.out.print("\nEnter number of times that you want to draw the card ---> ");
        number_Of_Cards = scanner1.nextInt();


        //while loop for all 38 tarot cards, start here...

        int i =1;
        while(i<=number_Of_Cards){

            System.out.print("\nDraw the card here ---> ");


            // creating scanner's obj for user's choice
            scanner = new Scanner(System.in);

            //sending messages
            user_Choice = scanner.nextLine();

            //storing random value to arrayList your_Card_Array
            your_Card_Array.add(your_Card);  //<--------------------------------------------------------------add code 3

            //initialize array_Size

            int array_Size = your_Card_Array.size();


            // System.out.println("your_Card_Array " + your_Card_Array
            // + "\n" + "Array Size " + array_Size); */
            // <------------------------------------------------add code 4

            tricky_Number = 0;

            // while condition for user's Choice whether continue the program or not
            while (user_Choice.equals("s")) {


                //creating random class's obj
                random = new Random();
                your_Card = random.nextInt(78);


                //second while loop for control duplicate random values <---------------------------------add code 5
                int j = 1;

                while(j!=array_Size && j<=array_Size){

                    if(your_Card_Array.get(j) == your_Card){
                        //System.out.println("\nThis is duplicate card. Please choose again.");  // testing output
                        your_Card = (-1);

                        break;
                    }
                    else if(your_Card_Array.get(j) == 0 ){

                            /*
                            this value is always coming out everytime after it's round come.
                            * */

                        //System.out.println("This is 0 random values."); // testing outputs
                        break;
                    }

                    j++;


                    /*
                     * I want to cut out of the duplicate card, but it didn't work yet.
                     *
                     * edit- I think it worked out!
                     *
                     * */


                }


                //if condition for your_Card

                //Major arcana : 22 cards start here...

                System.out.println("\n"); // line skip

                if (your_Card == 0) {
                    System.out.println("The Fool");
                    break;

                } else if (your_Card == 1) {
                    System.out.println("The Magician");
                    break;

                } else if (your_Card == 2) {
                    System.out.println("The High Priestess");
                    break;

                } else if (your_Card == 3) {
                    System.out.println("The Empress");
                    break;

                } else if (your_Card == 4) {
                    System.out.println("The Emperor");
                    break;

                } else if (your_Card == 5) {
                    System.out.println("The Hierophant");
                    break;

                } else if (your_Card == 6) {
                    System.out.println("The Lovers");
                    break;

                } else if (your_Card == 7) {
                    System.out.println("The Chariot");
                    break;

                } else if (your_Card == 8) {
                    System.out.println("Strength");
                    break;

                } else if (your_Card == 9) {
                    System.out.println("The Hermit");
                    break;

                } else if (your_Card == 10) {
                    System.out.println("The Wheel Of Fortune");
                    break;

                } else if (your_Card == 11) {
                    System.out.println("Justice");
                    break;

                } else if (your_Card == 12) {
                    System.out.println("The Hanged Man");
                    break;

                } else if (your_Card == 13) {
                    System.out.println("Death");
                    break;

                } else if (your_Card == 14) {
                    System.out.println("Temperance");
                    break;

                } else if (your_Card == 15) {
                    System.out.println("The Devil");
                    break;

                } else if (your_Card == 16) {
                    System.out.println("The Tower");
                    break;

                } else if (your_Card == 17) {
                    System.out.println("The Star");
                    break;

                } else if (your_Card == 18) {
                    System.out.println("The Moon");
                    break;

                } else if (your_Card == 19) {
                    System.out.println("The Sun");
                    break;

                } else if (your_Card == 20) {
                    System.out.println("Judgement");
                    break;

                } else if (your_Card == 21) {
                    System.out.println("The World");
                    break;

                    // Major arcana : 22 cards complete here.


                    //Suit of Cups start here...

                } else if (your_Card == 22) {
                    System.out.println("Ace of Cups");
                    break;

                } else if (your_Card == 23) {
                    System.out.println("Two of Cups");
                    break;

                } else if (your_Card == 24) {
                    System.out.println("Three of Cups");
                    break;

                } else if (your_Card == 25) {
                    System.out.println("Four of Cups");
                    break;

                } else if (your_Card == 26) {
                    System.out.println("Five of Cups");
                    break;

                } else if (your_Card == 27) {
                    System.out.println("Six of Cups");
                    break;

                } else if (your_Card == 28) {
                    System.out.println("Seven of Cups");
                    break;

                } else if (your_Card == 29) {
                    System.out.println("Eight of Cups");
                    break;

                } else if (your_Card == 30) {
                    System.out.println("Nine of Cups");
                    break;

                } else if (your_Card == 31) {
                    System.out.println("Ten of Cups");
                    break;

                } else if (your_Card == 32) {
                    System.out.println("Page of Cups");
                    break;

                } else if (your_Card == 33) {
                    System.out.println("Knight of Cups");
                    break;

                } else if (your_Card == 34) {
                    System.out.println("Queen of Cups");
                    break;

                } else if (your_Card == 35) {
                    System.out.println("King of Cups");
                    break;                                        //Suit of Cups ends here...


                    //Suit of Swords start here...

                } else if (your_Card == 36) {
                    System.out.println("King of Swords");
                    break;

                } else if (your_Card == 37) {
                    System.out.println("Knight of Swords");
                    break;

                } else if (your_Card == 38) {
                    System.out.println("Queen of Swords");
                    break;

                } else if (your_Card == 39) {
                    System.out.println("Page of Swords");
                    break;

                } else if (your_Card == 40) {
                    System.out.println("Ten of Swords");
                    break;

                } else if (your_Card == 41) {
                    System.out.println("Nine of Swords");
                    break;

                } else if (your_Card == 42) {
                    System.out.println("Eight of Swords");
                    break;

                } else if (your_Card == 43) {
                    System.out.println("Seven of Swords");
                    break;

                } else if (your_Card == 44) {
                    System.out.println("Six of Swords");
                    break;

                } else if (your_Card == 45) {
                    System.out.println("Five of Swords");
                    break;

                } else if (your_Card == 46) {
                    System.out.println("Four of Swords");
                    break;

                } else if (your_Card == 47) {
                    System.out.println("Three of Swords");
                    break;

                } else if (your_Card == 48) {
                    System.out.println("Two of Swords");
                    break;

                } else if (your_Card == 49) {
                    System.out.println("Ace of Swords");
                    break;                                             //Suit of Swords end here...


                    //Suit of Pentacles start here...

                } else if (your_Card == 50) {
                    System.out.println("King of Pentacles");
                    break;

                } else if (your_Card == 51) {
                    System.out.println("Queen of Pentacles");
                    break;

                } else if (your_Card == 52) {
                    System.out.println("Knight of Pentacles");
                    break;

                } else if (your_Card == 53) {
                    System.out.println("Page of Pentacles");
                    break;

                } else if (your_Card == 54) {
                    System.out.println("Ten of Pentacles");
                    break;

                } else if (your_Card == 55) {
                    System.out.println("Nine of Pentacles");
                    break;

                } else if (your_Card == 56) {
                    System.out.println("Eight of Pentacles");
                    break;

                } else if (your_Card == 57) {
                    System.out.println("Seven of Pentacles");
                    break;

                } else if (your_Card == 58) {
                    System.out.println("Six of Pentacles");
                    break;

                } else if (your_Card == 59) {
                    System.out.println("Five of Pentacles");
                    break;

                } else if (your_Card == 60) {
                    System.out.println("Four of Pentacles");
                    break;

                } else if (your_Card == 61) {
                    System.out.println("Three of Pentacles");
                    break;

                } else if (your_Card == 62) {
                    System.out.println("Two of Pentacles");
                    break;

                } else if (your_Card == 63) {
                    System.out.println("Ace of Pentacles");
                    break;                                           //Suit of Pentacles end here...


                    //Suit of Wands start here...

                } else if (your_Card == 64) {
                    System.out.println("Knight of Wands");
                    break;

                } else if (your_Card == 65) {
                    System.out.println("King of Wands");
                    break;

                } else if (your_Card == 66) {
                    System.out.println("Queen of Wands");
                    break;

                } else if (your_Card == 67) {
                    System.out.println("Page of Wands");
                    break;

                } else if (your_Card == 68) {
                    System.out.println("Two of Wands");
                    break;

                } else if (your_Card == 69) {
                    System.out.println("Three of Wands");
                    break;

                } else if (your_Card == 70) {
                    System.out.println("Four of Wands");
                    break;

                } else if (your_Card == 71) {
                    System.out.println("Five of Wands");
                    break;

                } else if (your_Card == 72) {
                    System.out.println("Six of Wands");
                    break;

                } else if (your_Card == 73) {
                    System.out.println("Seven of Wands");
                    break;

                } else if (your_Card == 74) {
                    System.out.println("Eight of Wands");
                    break;

                } else if (your_Card == 75) {
                    System.out.println("Nine of Wands");
                    break;

                } else if (your_Card == 76) {
                    System.out.println("Ten of Wands");
                    break;

                } else if (your_Card == 77) {
                    System.out.println("Ace of Wands");
                    break;                                          //Suit of Wands end here...

                } else{
                    System.out.println("Happy escape!");
                    break;
                }
                    /*else {
                        System.out.println("""
                                You've got the space card. :)\

                                I think you need a space.\

                                 You need alone time to recharge your energy. \

                                Go walk to the nature and talk to a tree, mother nature \

                                or drink a cup of coffee reading a book at your home with your pet.
                                Take a good rest.\

                                You deserve that.:)""");

                    }*/
            }

            if(user_Choice.equals("f")){
                //System.out.println("\n" + ending_Text_Style_1);   //duplicate text style in Linking_Area class
                break;
            }

            i++;


        }

        //while loop for all 38 tarot cards, ends here.

        //System.out.println(ending_Text_Style_1);
        System.out.println(your_Card_Array);

        //PROGRAM ENDS HERE.
    }
}
