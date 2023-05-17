import java.time.LocalDate

data class Samochod(
    val brand: String,
    val model: String,
    val manufacturer: String,
    val startofproduction: LocalDate,
    val maxspeed: Int,
    val price: Int,
    val ABS: Boolean,
    val infobateria: List<Bateria>
): Comparable<Samochod> {
    override fun compareTo(other: Samochod): Int {
        val cmp = brand.compareTo(other.brand)
        return if (cmp != 0) cmp else price.compareTo(price)
    }
}
