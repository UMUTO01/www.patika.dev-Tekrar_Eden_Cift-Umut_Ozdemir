import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int delta[] = {5, 7, 10, 20, 12, 22, 34, 40, 803, 40, 82, 5, 22, 10};


        int Blashov[] = new int[delta.length];

        int ant = 0;

        for (int i = 0; i < delta.length; i++) {

            for (int klara = 0; klara < delta.length; klara++) {

                if ((i != klara) && (delta[i] == delta[klara])) {
                    if(Gorto(Blashov, delta[i]) == false){
                        Blashov[ant++] = delta[i];
                    }
                }
            }
        }


        for(int botton = 0; botton <Blashov.length;botton++){
            if (Blashov[botton] !=0&& Blashov[botton]%2 ==0){
                System.out.println("The non prime numbers in the list that repeats themselves are: "+ Blashov[botton]);
            }
        }
    }

    public static boolean Gorto(int[] arr, int crosswalk) {

        for (int i : arr) {
            if (i == crosswalk) {
                return true;}

        }
        return false;
    }
}
