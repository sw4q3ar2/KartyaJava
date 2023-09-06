package kartyas;

import java.util.Scanner;

public class Kartyas {

    static Scanner myObj = new Scanner(System.in);
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        Feltolt();
        Kirak();
        Melyik();
        Kever();
        EzVolt();
      
    }

    private static void Kirak() {
        for (int i = 0; i < pakli.length; i++) {

            System.out.print(pakli[i]);
            if (i % 3 == 0) {
                System.out.println(" ");
            }
        }
    }

    private static String Melyik() {
        System.out.println("Válassz egy kártyát: ");
        String tipp = myObj.nextLine();
        return tipp;
    }

    private static void Kever() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void EzVolt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void Feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", ",X", "IX", "VIII"};
        for (int i = 0; i < pakli.length; i++) {
            for (int k = 0; k < szinek.length; k++) {
                for (int j = 0; j < ertekek.length; j++) {
                    pakli[i]= szinek[k]+"_"+ertekek[j] ;
                }
            }
        }
    }

}
