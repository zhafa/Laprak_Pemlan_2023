package bab7;

public class CommissionEmployee extends Employee {
    private double grossSales;// penjualan per minggu
    private double commissionRate;// komisi

    public CommissionEmployee(String name, String noKTP, double sales, double rate, int tanggal, int bulan, int tahun) { // tambahkan
                                                                                                                         // int
                                                                                                                         // tanggal,
                                                                                                                         // int
                                                                                                                         // bulan,
                                                                                                                         // int
                                                                                                                         // tahun
                                                                                                                         // //jawaban
                                                                                                                         // no
                                                                                                                         // 4
        super(name, noKTP, tanggal, bulan, tahun); // tambahkan tanggal, bulan, tahun //jawaban no 4
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    public String toString() {
        return String.format("Commision  employee: " + super.toString() + "\ngross  sales: " + getGrossSales()
                + "\ncommission rate: " + getCommissionRate());
    }
}