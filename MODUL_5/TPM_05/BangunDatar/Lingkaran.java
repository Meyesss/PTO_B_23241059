package BangunDatar;

public class Lingkaran {
    
    private float r;

    public Lingkaran(float r){
        this.r = (r >= 0)? r : 0; // menangani jari-jari negatif
    }

    public float luas(){
        return(float) (Math.PI * r * r);
    }

    public float keliling(){
        return(float) (2 * Math.PI * r);
    }
    
}
