data class Barang(val nama: String = "Cornetto Disc Chocolate", val harga: Int = 10500, var jumlah: Int = 2, var diskon: Int = 10)

fun tampil() {
    println("Nama : $nama, Harga : $harga, Jumlah : $jumlah, Diskon : $diskon")
}

fun hitungTotal(x: Int, y: Int, z: Int) = x * y * z

fun main(args: Array<String>) {

    val brg = Barang("Cornetto Disc Chocolate", 10500, 2, 10)

    println(tampil())
    println(hitungTotal(10500, 2, 10))
}