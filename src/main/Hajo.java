package main;
public class Hajo {
    private int[] pozicio = new int[3];
    
    public Hajo(int[] pozicio){
        this.pozicio = pozicio;
    }
        public String talalat(int poz){
        int i = 0;
        String talalt = "";
        while (i<pozicio.length && pozicio[i]!=poz) {            
            i++;
        }
        if(i<pozicio.length){
            talalt = "talált";
        }
        else{
            talalt = "nem talált";
        }
        return talalt;
    }
    
}
