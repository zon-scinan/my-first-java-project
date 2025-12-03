package src.com.java.practice;
/*
This is a program of random number picking.
Using Random class...
 */

import java.util.Random;
import java.util.Scanner;

//main class starts here
public class Random_Pick {
    //main method starts here
    public static void main(String[]args){

        Random_Pick randomPick = new Random_Pick();
        randomPick.random_pick_sub_main();

    }
    //main method ends here

    //random_pick_sub_main ends here
    public void random_pick_sub_main(){

        //declare objects and variables
        Random randomPick;
        int my_randomPick;
        Scanner scanner;
        String itemName1,itemName2,itemName3;
        int item1_total_random_number = 0;
        int item3_total_random_number = 0;
        int item2_total_random_number = 0;
        //---------------------------------------------------------------add code here

        System.out.println("\n(Please, enter your 3 item names.)\n");

        //create obj for random class
        randomPick = new Random();
        scanner = new Scanner(System.in);

        //sending messages to scanner class
        System.out.print("Enter here for item 1 ---> ");
        itemName1 = scanner.nextLine();

        System.out.print("Enter here for item 2 ---> ");
        itemName2 = scanner.nextLine();

        System.out.print("Enter here for item 3 ---> ");
        itemName3 = scanner.nextLine();
        //--------------------------------------------------------------add code here

        System.out.println("\n");

//for loop
        for(int j=1;j<=3;j++) {
            //for loop for number of random picking times starts here
            for (int i = 1; i <= 5; i++) {
                System.out.print("Round " + i + " = ");

                //sending message to random class
                my_randomPick = randomPick.nextInt(3); //------------------add code here

                //if condition starts here
                if (my_randomPick == 0) {

//item 1
                    item1_total_random_number = item1_total_random_number + 1;
                    String content_1 = String.valueOf(my_randomPick);
                    content_1 = itemName1;
                    System.out.println(content_1);
                    //System.out.println(my_randomPick);
                }
//item 2
                else if (my_randomPick == 1) {
                    item2_total_random_number = item2_total_random_number + 1;
                    String content2 = String.valueOf(my_randomPick);
                    content2 = itemName2;
                    System.out.println(content2);
                    // System.out.println(my_randomPick);
                }
//item 3
                else if (my_randomPick == 2) {
                    item3_total_random_number = item3_total_random_number + 1;
                    String content3 = String.valueOf(my_randomPick);
                    content3 = itemName3;
                    System.out.println(content3);
                    //System.out.println(my_randomPick);
                }
                //--------------------------------------------------------------add code here
                else {
                    System.out.println("Error ^O^");
                }

                //if condition ends here

            }
            //for loop for number of random picking times starts here

            //output to console window
            System.out.println("\n"); //skip two lines
            System.out.println("(Total result...)");
            System.out.println(itemName1 + " = " + item1_total_random_number);
            System.out.println(itemName2 + " = " + item2_total_random_number);
            System.out.println(itemName3 + " = " + item3_total_random_number);
            //------------------------------------------------------------------add code here
            System.out.println("\n"); //skip two lines

            //if condition for the biggest number
            //------------------------------------------------------------------add code here in if condition
            if (item1_total_random_number > item2_total_random_number && item1_total_random_number > item3_total_random_number) {
                System.out.println("(The final result...)");
                System.out.println("\n🎉✨ ပထမဆုံး " + itemName1 + " ပါ... ✨🎉");
                if(item2_total_random_number==item3_total_random_number) {
                    System.out.println( "👉" + itemName2 + " နဲ့ " + itemName3
                            + " ကို နောက်မှ တူတူတွဲလုပ်ပါ...🫰😁");
                    break;
                }
                else{
                    System.out.println("ကျန်တဲ့ နှစ်ခုကတော့ ကြိုက်တာလုပ်...ယူ့သဘော 🫵🙂 oK? 😉👌 ");
                }
                break;
            } else if (item2_total_random_number > item1_total_random_number && item2_total_random_number > item3_total_random_number) {
                System.out.println("The final result...");
                System.out.println("\n🎉✨ ပထမဆုံး " + itemName2 + " ပါ... ✨🎉");
                if(item1_total_random_number==item3_total_random_number) {
                    System.out.println( "👉" + itemName1 + " နဲ့ " + itemName3
                            + " ကို နောက်မှ တူတူတွဲလုပ်ပါ...🫰😁");
                    break;
                }
                else{
                    System.out.println("ကျန်တဲ့ နှစ်ခုက‌တော့ ကြိုက်တာလုပ်...ယူ့သဘော 🫵🙂 oK? 😉👌");
                }
                break;
            } else if (item3_total_random_number > item1_total_random_number && item3_total_random_number > item2_total_random_number) {
                System.out.println("(The final result...)");
                System.out.println("\n🎉✨ ပထမဆုံး " + itemName3 + " ပါ...✨🎉");
                if(item1_total_random_number==item2_total_random_number) {
                    System.out.println( "👉" + itemName1 + " နဲ့ " + itemName2
                            + " ကို နောက်မှ တူတူတွဲလုပ်ပါ...🫰😁");
                    break;
                }
                else{
                    System.out.println("ကျန်တဲ့ နှစ်ခုကတော့ ကြိုက်တာလုပ်...ယူ့သဘော 🫵🙂 oK? 😉👌");
                }
                break;
            } else {
                System.out.println("OOps...Duplicate random numbers. We will try again...\n");
                continue;
            }
        }
    }
    //random_pick_sub_main ends here

}
//main class ends here
