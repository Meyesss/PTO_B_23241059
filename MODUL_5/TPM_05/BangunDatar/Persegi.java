package BangunDatar;

public class Persegi {
    
    private float sisi;

    public Persegi(float sisi){
        this.sisi = (sisi >= 0) ? sisi : 0; // menangani sisi negatif
    }

    public float luas(){
        return sisi*sisi;
    }
    public float keliling(){
        return 4*sisi;
    }
    
}
