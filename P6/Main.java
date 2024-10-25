public class Main {
    public static void main(String[] args) {
        // Create object instances
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(6, 8);
        Persegi persegi = new Persegi(4);

        // Display area and perimeter of each object
        System.out.println("Lingkaran: Luas = " + lingkaran.luas() + ", Keliling = " + lingkaran.keliling());
        System.out.println("Segitiga: Luas = " + segitiga.luas() + ", Keliling = " + segitiga.keliling());
        System.out.println("Persegi: Luas = " + persegi.luas() + ", Keliling = " + persegi.keliling());
    }
}
