package Praktikum7;

public class KueJadi extends Kue {
    public KueJadi(String nama, double harga, double jumlah){
        super(nama,harga);
        this.jumlah=jumlah;
    }
    private double jumlah;
    public double hitungHarga() {
        return getHarga() *(double) jumlah *(double) 2;
    }
    public String toString(){
        return super.toString()+ "\nJenis Kue : Kue Jadi";
    }
    public double getJumlah() {
        return jumlah;
    }
}
