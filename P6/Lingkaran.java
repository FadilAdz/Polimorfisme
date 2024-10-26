public class Lingkaran extends BangunDatar {
    private int r;

    // Constructor
    public Lingkaran(int r) {
        this.r = r;
    }

    // Implement area calculation
    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    // Implement perimeter calculation
    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
