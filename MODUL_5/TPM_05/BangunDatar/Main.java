package BangunDatar;

class BangunDatar{
    public float luas(){
        return 0; // Implementasi standar, harus ditimpa oleh subclass
    } 
    public float keliling(){
        return 0; // Implementasi standar, harus ditimpa oleh subclass
    }
} 




public class Main {
    public static void main(String[] args) {

        // membuat program (baru)
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(2);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Segitiga segitiga = new Segitiga(6, 8);



        // Keluran (hasil)

        System.out.println("Luas Persegi: " + persegi.luas());
            System.out.println("Keliling Persegi: " + persegi.keliling());
            System.out.println("Luas Lingkaran: " + lingkaran.luas());
            System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
            System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
            System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
            System.out.println("Luas Segitiga: " + segitiga.luas());
            System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
    
}
