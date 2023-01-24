//Jodae lowe
//1/24/23
//csci1660

public class Main {
    public static void main(String[] args) {
        String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        int[] degrees = {45,29,10,22,41,28};
        int[] percent = {95,60,25,5,0,75,90};
        for (int i = 0; i < degrees.length; i++) {
            if (percent[i] >= 50 && degrees[i] < 32){
                System.out.printf("theres a high chance for snow on %s %n",days[i]);
            }
            }


        }
    }
