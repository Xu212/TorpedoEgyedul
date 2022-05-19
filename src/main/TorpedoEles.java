package main;

import java.util.Scanner;

public class TorpedoEles {
    int randomszam1 = (int)(Math.random()*5);
    public static void main(String[] args) {
        TorpedoEles gm = new TorpedoEles();
        gm.jatek();
    }

    public String loves(int poz) {
        int randomszam2 = randomszam1 + 1;
        int randomszam3 = randomszam1 + 2;
        int[] pozicio = {randomszam1, randomszam2, randomszam3};
        Hajo hajo = new Hajo(pozicio);
        String talalte = hajo.talalat(poz);
        return talalte;
    }

    public void jatek() {
        int loves = 0;
        int talalat = 0;
        TorpedoEles te = new TorpedoEles();
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Lövés: ");
            int hovaloves = scn.nextInt();
            String talalte = te.loves(hovaloves);
            if (talalte.equals("talált")) {
                talalat++;
            }
            System.out.println(talalte);
            loves++;
        } while (talalat < 3);
        System.out.println("Játék vége ennyiszer lőttél " + loves);
    }
}
