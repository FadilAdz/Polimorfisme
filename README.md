# Polimorfisme
## Praktikum Pertemuan Ke 6 Pemrograman Orientasi Objek.
<img src=https://raw.githubusercontent.com/bablubambal/All_logo_and_pictures/1ac69ce5fbc389725f16f989fa53c62d6e1b4883/programming%20languages/java.svg width="120px">

## Latihan
Implementasikan
java code diagram
class berikut :

![img](P6/assets/soal.png)

<br> <br>

<b>1. BangunDatar.java (Kelas Abstrak)</b>

``` java
public abstract class BangunDatar {
    // Metode abstrak untuk menghitung luas dan keliling
    public abstract float luas();
    public abstract float keliling();
}

```

Ini adalah kelas abstrak bernama ```BangunDatar```, yang mewakili bentuk-bentuk geometri 2D (misalnya, lingkaran, segitiga, persegi).
Kelas ini memiliki dua metode abstrak : <br>
```luas()``` (untuk menghitung luas)
```keliling()``` (untuk menghitung keliling).
Metode abstrak dideklarasikan tanpa implementasi di sini. Metode ini akan ditimpa (override) oleh kelas yang mewarisi ```BangunDatar```. Artinya, setiap bentuk (misalnya, ```Lingkaran```, ```Segitiga```, ```Persegi```) akan mendefinisikan logika mereka sendiri untuk menghitung luas dan keliling.
