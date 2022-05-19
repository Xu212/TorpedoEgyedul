package main;
public class TorpedoTeszt {
    public static void main(String[] args) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(4);
        assert t.equals("talált"):"nem jó a találat ellenőrzése";
    }
    public String tesztLoves(int poz){
        return "";
    }
}
