fun main(args : Array<String>) {
    val pangkat = {bil1: Int, bil2: Int -> Math.pow(bil1, bil2)}
    println("4 pangkat 3 = ${pangkat(4,3)}")
}