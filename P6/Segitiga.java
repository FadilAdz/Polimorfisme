public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    // Constructor
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Implement area calculation
    @Override
    public float luas() {
        return (alas * tinggi) / 2.0f;
    }

    // Implement perimeter calculation (Assumes equilateral triangle)
    @Override
    public float keliling() {
        return 3 * alas;
    }
}
