package src.com.java.practice;

import java.util.Scanner;

public class Colors {
    public static void main(String[]args){
        //src.Colors colors = new src.Colors();
        //colors.colors_main();

    }
    public void colors_main(){

        //String initialization starts here.

        String indigo = "နက်ပြာရောင်ဆိုတာ စိတ်ဝိဉာဉ်နဲ့ သက်ဆိုင်တဲ့ အရောင်ဖြစ်တယ်။ " +
                "\nပင်ကိုယ်အသိစိတ်ခွန်အား ထက်သန်မှုကို ဖော်ပြတယ်။" +
                "\nတီထွင်ဖန်တီးနိုင်စွမ်း နဲ့ အတွင်းကျကျ လေ့လာနိုင်စွမ်းကောင်းတယ်။"+
                "\nMystery and unknown ဖြစ်တဲ့ type မျိုးလဲဖြစ်တယ်။" +
                "\nနက်ပြာရောင်နှစ်သက်တဲ့ သူတွေဟာ နက်နက်နဲနဲ စဉ်းစားတွေးခေါ်တတ်တဲ့ အသိစိတ်ရှိပြီး " +
                "\nခရမ်းရောင်ကဲ့သို့ Noble ဖြစ်တယ်။ " +
                "\nအပြာရာင်ကဲ့ သို့ သစ္စာရှိတယ်။";
        String red = "အနီရောင်ဟာ ချစ်ခြင်းမေတ္တာ နဲ့ ခွန်အားကြီးခြင်း ကို ကိုယ်စားပြုသလို " +
                "\nအနီရောင် နှစ်သက်သူတွေဟာ ဝါသနာကြီးခြင်း ထင်ပေါ်နေခြင်းနဲ့ ရဲရင့်တဲ့ စိတ်ဓါတ် ရှိသူတွေဖြစ်တယ်။";
        String blue = "အပြာရောင်ဟာ ယုံကြည်ထိုက်ခြင်း နဲ့ သစ္စာရှိခြင်းကို ကိုယ်စားပြုတယ်။" +
                "\nအပြာရောင် နှစ်သက်သူတွေဟာ အေးဆေးတည်ငြိမ်ခြင်း ငြိမ်းချမ်းခြင်းကို သယ်ဆောင်ထားသလို " +
                "\nတစ်ခါတစ်ရံမှာလဲ ဝမ်းနည်းနေခြင်းကို ဖော်ပြတယ်။";
        String orange = "လိမ္မော်ရောင်ဟာ စိတ်အားထက်သန်ခြင်း နဲ့ လန်းဆန်းတက်ကြွခြင်းကို ကိုယ်စားပြုတယ်။ " +
                "လိမ္မော်ရောင်နှစ်သက်သူတွေဟာ ကိုယ့်ကိုကိုယ် ယုံကြည်မှုရှိပြီး ကျန်းမာဖြတ်လတ်တဲ့ Type မျိးရှိတယ်။";
        String green = "အစိမ်းရောင်ဟာ အသစ်တဖန်စတင်ခြင်းကို ကိုယ်စားပြုတယ်။" +
                "\nအစိမ်းရောင်နှစ်သက်သူတွေဟာ  သဘာဝတရားကြီးနဲ့ ဆက်နွယ်မှုတွေကို သဘောကျပြီး " +
                "\nတောတောင်သဘာဝကို ချစ်မြတ်နိုးတဲ့ Type မျိုးရှိတယ်။ ";
        String yellow  = "အဝါရောင်ဟာ ပျော်ရွှင်ခြင်း အကောင်းမြင်ဝါဒရှိခြင်းကို ကိုယ်စားပြုတယ်။" +
                "\nအဝါရောင်နှစ်သက်သူတွေဟာ Positive thinking သမားတွေဖြစ်ကြတယ်။";
        String purple = "ခရမ်းရောင်ဟာ Power ရှိမှု လှို့ဝှက်ဆန်းကြယ်မှုကို ဖော်ပြတယ်။";
        String black = "အမဲရောင်ဟာ မှောင်မိုက်ခြင်း ဆန်းပြားခြင်း ကို ကိုယ်စားပြုသလို " +
                "သက်တောင့်သက်သာနေတတ်ခြင်း ဝမ်းနည်းခြင်းကိုလဲ ဖော်ပြတယ်။ ";
        String turquoise = "စိမ်းပြာရောင်ဟာ ကံကောင်းခြင်း တီထွင်ဖန်တီးနိုင်ခြင်းနဲ့ တည်ငြိမ်အေးဆေးခြင်းကို ကိုယ်စားပြုတယ်။";
        String pink = "ပန်းရောင်ဟာ သိမ်မွေ့ခြင်း ချစ်ခြင်းမေတ္တာ ကို ကိုယ်စားပြုပြီး" +
                "ငြိမ်သက်ခြင်းနဲ့ လှည့်ဖျားတတ်ခြင်းကိုလဲ ရည်ညွှန်းတယ်။";
        String brown = "အညိုရောင်ဟာ ခွန်အားကြီးခြင်း သက်တောင့်သက်သာရှိခြင်း " +
                "နွေးထွေးခြင်း နဲ့ ရိုးဆင်းခြင်းကို ကိုယ်စားပြုတယ်။ ";
        String gray = "မီးခိုးရောင်ဟာ ထိန်းထိန်းသိမ်းသိမ်းနေတတ်မှု ငြိမ်သက်မှုကို ကိုယ်စားပြုတယ်။";
        String white = "အဖြူရောင်ဟာ ရိုးဆင်းမှု အပြစ်ကင်းစင်မှုကို ကိုယ်စားပြုတယ်။ ";

        //String initialization ends here.

        for(int i = 0; i<100;i++) {


            //user choice for open and close the program starts here
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("\n"); // skips two lines
            System.out.print("Enter 'o' if you want to open the program\nor 'c' for close ---> ");
            String user_input1 = scanner1.nextLine();
            //user choice for open and close the program ends here

            if (user_input1.equals("o")) {


                //user input for choose the color starts here
                Scanner scanner = new Scanner(System.in);
                System.out.print("\nChoose your favorite color.\n1.Indigo = မဲနယ်ရောင်\n2.Red = အနီ\n3.Blue = အပြာ\n" +
                        "4.Orange = လိမ္မော်\n5.Green = အစိမ်း\n6.Yellow = အဝါ\n7.Purple = ခရမ်း\n" +
                        "8.Black = အမဲ/အနက်\n9.Turquoise = စိမ်းပြာ\n10.Pink = ပန်းရောင်\n" +
                        "11.Brown = အညို\n12.Gray = မီးခိုး\n13.White = အဖြူ\n\nEnter the number here ---> ");
                int user_input = scanner.nextInt();

                //switch case for user's favorite colors starts here
                switch(user_input){
                    case 1:
                        System.out.println(indigo);
                        break;
                    case 2:
                        System.out.println(red);
                        break;
                    case 3:
                        System.out.println(blue);
                        break;
                    case 4:
                        System.out.println(orange);
                        break;
                    case 5:
                        System.out.println(green);
                        break;
                    case 6:
                        System.out.println(yellow);
                        break;
                    case 7:
                        System.out.println(purple);
                        break;
                    case 8:
                        System.out.println(black);
                        break;
                    case 9:
                        System.out.println(turquoise);
                        break;
                    case 10:
                        System.out.println(pink);
                        break;
                    case 11:
                        System.out.println(brown);
                        break;
                    case 12:
                        System.out.println(gray);
                        break;
                    case 13:
                        System.out.println(white);
                        break;
                    default:
                        System.out.println("Something went wrong.  >-< \nPlease enter a number between 1 and 13.");

                }

                //switch case for user's favorite colors ends here

            } else if(user_input1.equals("c")) {
                break;
            }
        }

        //user input for choose the color ends here



    }
}

