
/*
 * This is a program of testing Gregorian calendar class.
 *
 * Enter your birth year. This program will tell your age approximately only one year different in general.
 * And your zodiac sign.
 *
 * This is not a complete program yet.
 *
 * Date       Sep23,2024.
 *
 * */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MyGregorianCalendar {

    public static void main(String[] args) {

        //MyGregorianCalendar myGregorianCalendar = new MyGregorianCalendar();
        //myGregorianCalendar.MyGregorianCalendar_SubMain();


    }
    public void MyGregorianCalendar_SubMain(){

        //PROGRAM STARTS HERE...

        // Coding for computing user's age is STARTS HERE...

        // 1.declaring instances
        GregorianCalendar gregorianCalendar;
        SimpleDateFormat dateFormat, yearFormat, monthFormat, dayFormat;
        int myYear, currentYear, currentDay, currentMonth, age, day, month, inputYear, inputDay, inputMonth, myDay, myMonth;
        Date date;
        Scanner scanner;

        // 2. asking input data from user
        scanner = new Scanner(System.in);
        System.out.print("Enter your birth year <2005> like this : ");


        inputYear = scanner.nextInt();
        System.out.print("Enter your birth month <2> like this : ");
        inputMonth = scanner.nextInt();
        System.out.print("Enter your birth day <9> like this : ");
        inputDay = scanner.nextInt();

        // 3. creating objects
        gregorianCalendar = new GregorianCalendar(inputYear, inputMonth, inputDay);
        yearFormat = new SimpleDateFormat("yyyy");
        dayFormat = new SimpleDateFormat("dd");
        monthFormat = new SimpleDateFormat("MM");
        date = new Date();

        // 4. sending messages to objects
        myYear = gregorianCalendar.get(Calendar.YEAR);
        myMonth = gregorianCalendar.get(Calendar.MONTH);
        myDay = gregorianCalendar.get(Calendar.DATE);

        currentYear = Integer.parseInt(yearFormat.format(date));
        currentMonth = Integer.parseInt(monthFormat.format(date));
        currentDay = Integer.parseInt(dayFormat.format(date));

        // 5. formula computing
        age = currentYear - myYear;

        // 6. checking condition for user's age
        if (myYear < currentYear) {

            if (myMonth < currentMonth) {
                System.out.println("\n^-^/\nYour age is " + age + ".");
            } else if (myMonth == currentMonth) {
                if (myDay < currentDay) {
                    System.out.println("\n^-^/\nYour age is " + age + ".");
                } else if (myDay == currentDay) {
                    System.out.println("\n^-^/\nYour age is " + age + ".");
                    System.out.println("\nBy the way, HAPPY BIRTHDAY! Today is your birthday.^-^/");
                } else {
                    System.out.println("\n^-^/\nYour age is " + (age - 1) + ".");
                }
            } else {
                System.out.println("\n^-^/\nYour age is " + (age - 1) + ".");
            }
        } else {
            System.out.println("""

                    Ah! Something went wrong. I can't calculate your age! \
                    Please make sure you enter the correct number.
                    Come on! Your birthday should not greater than current year!
                    No String and white space available.
                    """);
        }
        // Coding for computing user's age is ENDS HERE.








        //Coding for user's Zodiac sign is STARTS HERE...

        if (myMonth == 1) {                                                 // for month 1
            if (myDay <= 19) {
                System.out.println("You are Capricorn!");
            } else if (myDay <= 31) {
                System.out.println("You are Aquarius!");

            }

        } else if (myMonth == 2) {                                    // for month 2
            if (myDay <= 18) {
                System.out.println("You are Aquarius!");
            } else if (myDay <= 29) {
                System.out.println("You are Pisces!");

            }

        } else if (myMonth == 3) {                                     // for month 3
            if (myDay <= 20) {
                System.out.println("You are Pisces!");
            } else if (myDay <= 31) {
                System.out.println("You are Aries!");

            }

        } else if (myMonth == 4) {                                    // for month 4
            if (myDay <= 19) {
                System.out.println("You are Aries!");
            } else if (myDay <= 30) {
                System.out.println("You are Taurus!");

            }

        } else if (myMonth == 5) {                                    // for month 5
            if (myDay <= 20) {
                System.out.println("You are Taurus!");
            } else if (myDay <= 31) {
                System.out.println("You are Gemini!");

            }

        } else if (myMonth == 6) {                                    // for month 6
            if (myDay <= 21) {
                System.out.println("You are Gemini!");
            } else if (myDay <= 30) {
                System.out.println("You are Cancer!");

            }

        } else if (myMonth == 7) {                                    // for month 7
            if (myDay <= 22) {
                System.out.println("You are Cancer!");
            } else if (myDay <= 31) {
                System.out.println("You are Leo!");

            }

        } else if (myMonth == 8) {                                    // for month 8
            if (myDay <= 22) {
                System.out.println("You are Leo!");
            } else if (myDay <= 31) {
                System.out.println("You are Virgo!");

            }


        } else if (myMonth == 9) {                                    // for month 9
            if (myDay <= 22) {
                System.out.println("You are Virgo!");
            } else if (myDay <= 30) {
                System.out.println("You are Libra!");

            }

        } else if (myMonth == 10) {                                    // for month 10
            if (myDay <= 22) {
                System.out.println("You are Libra!");
            } else if (myDay <= 31) {
                System.out.println("You are Scorpio!");

            }

        } else if (myMonth == 11) {                                    // for month 11
            if (myDay <= 21) {
                System.out.println("You are Scorpio!");
            } else if (myDay <= 30) {
                System.out.println("You are Sagittarius!");

            }

        } else if (myMonth == 12) {                                   // for month 12
            if (myDay <= 21) {
                System.out.println("You are Sagittarius!");
            } else if (myDay <= 31) {
                System.out.println("You are Capricorn!");

            }

        } else {
            System.out.println("Something went wrong.Please try again.");
        }
        // Coding for computing user's Zodiac sign is ENDS HERE.







        // Coding for computing user's age converting into days, is STARTS HERE...
        //declaring variables
        int your_Birthdays, total_Years_to_Days, edit_Month,
                checking_Month, total_Days, final_Total_Days;

        // Declaring instance for String class
        String your_Birthdays_Text_Style;
        String your_Birthdays_Text_Style_1;
        String your_Birthdays_Text_Style_2;
        String your_Birthdays_Text_Style_3;
        int age_in_days, leftover_Days_Your_Month;

        // Initializing to String Class's object and integer
        your_Birthdays_Text_Style = "Here, I make your age into days. ^-^ ";
        your_Birthdays_Text_Style_1 = "\nSo... you've lived such a long time! Congratulation!";
        your_Birthdays_Text_Style_2 = " days approximately! " +
                "Ha..ha...";
        your_Birthdays_Text_Style_3 = " days approximately!.. Wait! What! Something went wrong...! That is impossible!";
        final_Total_Days = 0;
        total_Days = 1;


        // Computing formula
        total_Years_to_Days = age * 365;                        // computing year to day

        if (myMonth < currentMonth) {

            edit_Month = currentMonth - myMonth - 1;     // minus 1 to know exactly extra months beyond user birth month
            checking_Month = myMonth + edit_Month;             // this is for checking condition for exact days in month
            total_Days = edit_Month * 31;                       // computing months into days roughly

            for (int i = 1; i <= checking_Month; i++) {

                while(i<=checking_Month) {
                    if (i > myMonth) {

                        if (i == 2) {
                            final_Total_Days = final_Total_Days - 3;
                        } else if (i == 4) {
                            final_Total_Days = final_Total_Days - 1;
                        } else if (i == 6) {
                            final_Total_Days = final_Total_Days - 1;
                        } else if (i == 9) {
                            final_Total_Days = final_Total_Days - 1;
                        } else if (i == 11) {
                            final_Total_Days = final_Total_Days - 1;
                        }

                    } else if (edit_Month == 0) {  // this is your birth month and current month are side by side situation
                        if (myMonth == 1) {
                            final_Total_Days = 31 - myDay;
                        } else if (myMonth == 2) {
                            final_Total_Days = 28 - myDay;
                        } else if (myMonth == 3) {
                            final_Total_Days = 31 - myDay;
                        } else if (myMonth == 4) {
                            final_Total_Days = 30 - myDay;
                        } else if (myMonth == 5) {
                            final_Total_Days = 31 - myDay;
                        } else if (myMonth == 6) {
                            final_Total_Days = 30 - myDay;
                        } else if (myMonth == 7) {
                            final_Total_Days = 31 - myDay;
                        } else if (myMonth == 8) {
                            final_Total_Days = 31 - myDay;
                        } else if (myMonth == 9) {
                            final_Total_Days = 30 - myDay;
                        } else if (myMonth == 10) {
                            final_Total_Days = 31 - myDay;
                        } else if (myMonth == 11) {
                            final_Total_Days = 30 - myDay;
                        }

                    }
                    i++;

                }
                if(myMonth+1<currentMonth) {
                    if (myMonth == 1) {
                        final_Total_Days = 31 - myDay;
                    } else if (myMonth == 2) {
                        final_Total_Days =  28 - myDay;
                    } else if (myMonth == 3) {
                        final_Total_Days =  31 - myDay;
                    } else if (myMonth == 4) {
                        final_Total_Days =  30 - myDay;
                    } else if (myMonth == 5) {
                        final_Total_Days = 31 - myDay;
                    } else if (myMonth == 6) {
                        final_Total_Days =  30 - myDay;
                    } else if (myMonth == 7) {
                        final_Total_Days =  31 - myDay;
                    } else if (myMonth == 8) {
                        final_Total_Days =  31 - myDay;
                    } else if (myMonth == 9) {
                        final_Total_Days =  30 - myDay;
                    } else if (myMonth == 10) {
                        final_Total_Days =  30 - myDay;
                    } else if (myMonth == 11) {
                        final_Total_Days =  31 - myDay;
                    }
                    break;
                }

            }

            // coding for leap year, STARTS HERE...

            for(int j = myYear+1 ; j<currentYear; j++){
                if  (j%4 == 0){  // leap year
                    final_Total_Days = (final_Total_Days + 1);

                }


                else if (j%100 != 0 && j%400 == 0){  // leap year
                    final_Total_Days = (final_Total_Days + 1);

                }

            }
            if(myMonth<2 || myDay<=29) {

                if (myYear % 4 == 0 && myYear % 400 == 0 && myYear % 100 != 0) {
                    final_Total_Days = final_Total_Days + 1;
                }

            }

            if(currentMonth>2){
                if (currentYear % 4 == 0 && currentYear % 400 == 0 && currentYear % 100 != 0) {
                    final_Total_Days = final_Total_Days + 1;
                }

            }


            //coding for leap year, ENDS HERE.



            age_in_days = total_Years_to_Days + final_Total_Days + total_Days + currentDay;

            // condition for output for negative days (wrong input)(if) and true input(else)
            if (age_in_days <= 0) {
                //output
                System.out.println(your_Birthdays_Text_Style
                        + (age_in_days
                        + your_Birthdays_Text_Style_3));

            } else {
                System.out.println(your_Birthdays_Text_Style
                        + (age_in_days + your_Birthdays_Text_Style_2
                        + your_Birthdays_Text_Style_1));

            }
        }
        else if(myMonth == currentMonth) {
            final_Total_Days = currentDay - myDay;
            your_Birthdays = final_Total_Days + total_Years_to_Days;

            if (your_Birthdays <= 0) {
                //output
                System.out.println(your_Birthdays_Text_Style + your_Birthdays + your_Birthdays_Text_Style_3);


            } else {

                final_Total_Days = currentDay - myDay;
                your_Birthdays = final_Total_Days + total_Years_to_Days;
                System.out.println(your_Birthdays_Text_Style + your_Birthdays + your_Birthdays_Text_Style_2
                        + your_Birthdays_Text_Style_1);
            }

        }
        // Coding for computing user's age converting into days, is ENDS HERE.


        //The last out put is here.
          /* System.out.println("""

                    Thanks for using our program! And let me know if you like this.\

                    Bye for now.^-^/""");

           */




        //PROGRAM ENDS HERE.


    }

}

