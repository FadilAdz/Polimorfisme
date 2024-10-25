public class Persegi extends BangunDatar {
    private int sisi;

    // Constructor
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    // Implement area calculation
    @Override
    public float luas() {
        return sisi * sisi;
    }

    // Implement perimeter calculation
    @Override
    public float keliling() {
        return 4 * sisi;
    }
}
