/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.util.Scanner;

public class Proje {

    public static void koordinatlar(char[][] sos) {
        
        System.out.println();
        System.out.println(" ------------------");
        
        for (int i = 0; i < sos.length; i++) {

            for (int j = 0; j < sos.length; j++) {

                System.out.print(" |"+sos[i][j] + "| ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println(" ------------------");
    }
 

    public static boolean puanlama(char[][] sos) {
        if (sos[0][0] == 's' && sos[0][1] == 'o' && sos[0][2] == 's') {
            return true;
        }
        if (sos[1][0] == 's' && sos[1][1] == 'o' && sos[1][2] == 's') {
            return true;
        }
        if (sos[2][0] == 's' && sos[2][1] == 'o' && sos[2][2] == 's') {
            return true;
        }
        if (sos[0][0] == 's' && sos[1][0] == 'o' && sos[2][0] == 's') {
            return true;
        }
        if (sos[0][1] == 's' && sos[1][1] == 'o' && sos[2][1] == 's') {
            return true;
        }
        if (sos[0][2] == 's' && sos[1][2] == 'o' && sos[2][2] == 's') {
            return true;
        }
        if (sos[0][0] == 's' && sos[1][1] == 'o' && sos[2][2] == 's') {
            return true;
        }
        if (sos[0][2] == 's' && sos[1][1] == 'o' && sos[2][0] == 's') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int toplamKrdntSayisi = 9;
        int sayma = 1;
        int oyuncu1puani = 0;
        int oyuncu2puani = 0;
        Scanner rastgele = new Scanner(System.in);
        int rstkoordinat1;
        int rstkoordinat2;
        char a;
        double r=Math.random();
        char[][] sos = new char[3][3];
        while (sayma < toplamKrdntSayisi) {
            System.out.println("Oyuncu 1 lütfen rastgele iki tane koordinat giriniz");
            rstkoordinat1 = rastgele.nextInt();
            rstkoordinat2 = rastgele.nextInt();
            System.out.println("Oyuncu 1 lütfen 'S' veya 'O' harflerinden birini girin");
            a = rastgele.next().charAt(0);

            sos[rstkoordinat1][rstkoordinat2] = a;
            
            if (puanlama(sos) == true&& r<=0.5) {
                oyuncu1puani=oyuncu1puani+1;
            }
            
            
            koordinatlar(sos);
            System.out.println("1.oyuncunun puanı:" + oyuncu1puani + " 2.oyuncunun puanı:" + oyuncu2puani);
            System.out.println("Oyuncu 2 lütfen iki tane koordinat girniz");
            rstkoordinat1 = rastgele.nextInt();
            rstkoordinat2 = rastgele.nextInt();
            System.out.println("Oyuncu 2 lütfen 'S' veya 'O' harflerinden birini girin");
            a = rastgele.next().charAt(0);
            sos[rstkoordinat1][rstkoordinat2] = a;
            
            if (puanlama(sos) == true&& r>0.5) {
                oyuncu2puani=oyuncu2puani+1;
            }
            
            
            koordinatlar(sos);
            

            System.out.println("1.oyuncunun puanı:" + oyuncu1puani + " 2.oyuncunun puanı:" + oyuncu2puani);
            sayma=sayma+sayma;

        }
        if(oyuncu2puani>oyuncu1puani){
            System.out.println("TEBRİKLER OYUNU OYUNCU 2 KAZANDI");
        }
        else if(oyuncu2puani==oyuncu1puani)
        {
            System.out.println("TEBRİKLER OYUN BERABERE ");
        }
        else
        {
            System.out.println("TEBRİKLER OYUNU OYUNCU 1 KAZANDI");
        }
    }

}
