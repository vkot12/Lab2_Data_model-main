import java.time.LocalDate

data class Bateria(
    val model: String,
    val manufacturer: String,
    val type: String,
    val startofproduction: LocalDate,
    val capacity: Int,
    val chargetime: Int,
    val fastcharging: Boolean
): Comparable<Bateria> {
    override fun compareTo(other: Bateria): Int {
        val cmp = model.compareTo(other.model)
        return if (cmp != 0) cmp else capacity.compareTo(other.capacity)
    }
}
