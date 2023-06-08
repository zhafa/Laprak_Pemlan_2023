package Praktikum7;

public abstract class Kue {
    private String nama;
    private double harga;
    public Kue (String nama, double harga){
        this.nama=nama;
        this.harga=harga;
    }
    public abstract double hitungHarga();
    public String toString(){
        return "Nama Kue : "+nama+"\nHarga Kue : "+harga;
    }
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
}
