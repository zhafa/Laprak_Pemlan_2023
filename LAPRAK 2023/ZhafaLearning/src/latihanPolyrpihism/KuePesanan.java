package Praktikum7;

public class KuePesanan extends Kue{
    public KuePesanan(String nama, double harga, double berat){
        super(nama,harga);
        this.berat=berat;
    }
    private double berat;
    public double hitungHarga() {
        return getHarga() *(double) berat;
    }
    public String toString(){
        return super.toString()+ "\nJenis Kue : Kue Pesanan";
    }
    public double getBerat() {
        return berat;
    }
}
