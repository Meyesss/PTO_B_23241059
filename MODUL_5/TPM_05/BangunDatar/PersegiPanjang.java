package BangunDatar;

public class PersegiPanjang {
    
    private float Panjang;
    private float Lebar;

    public PersegiPanjang(float Panjang, float Lebar){
        this.Panjang = (Panjang >= 0) ? Panjang : 0; // Menangani Panjang Negatif
        this.Lebar = (Lebar >= 0) ? Lebar : 0; // Menangani Lebar Negatif
    }

    public float luas(){
        return Panjang * Lebar;
    }

    public float keliling(){
        return 2 * (Panjang + Lebar);
    }
    
}
