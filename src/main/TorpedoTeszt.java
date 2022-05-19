package main;

public class TorpedoTeszt {

    public static void main(String[] args) {
        TorpedoTeszt tt = new TorpedoTeszt();
        tt.tesztLoves(4);
    }

    public String tesztLoves(int poz) {
        int[] pozicio = {2, 3, 4};
        Hajo hajo = new Hajo(pozicio);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
}
