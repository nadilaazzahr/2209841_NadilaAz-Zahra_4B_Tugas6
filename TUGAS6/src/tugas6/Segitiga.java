
package tugas6;

class Segitiga {
    double alas;
    double tinggi;
    double sisi;
    
    public Segitiga (double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
    public double getLuas ()  {
        return 0.5 * (alas * tinggi);
    }
    
    public double getKeliling () {
        return alas + tinggi + sisi;
    }

}
    

    
