import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val SamochodContainer = context.getBean(Container::class.java) as SamochodContainer

    val infobateria = listOf(
        Bateria("PHEV E-CVT", "Honda","single",  LocalDate.of(2023, 2, 1), 17, 6, false),
        Bateria("(ZE1) e+", "Nissan","single",  LocalDate.of(2022, 11, 4), 62,  8, false),
        Bateria("Dual Motor AWD", "Tesla","dual", LocalDate.of(2023, 1, 7), 80,  7, true)
    )

    SamochodContainer.add(
        Samochod("Honda", "Clarity", "Honda", LocalDate.of(2023, 2, 1), 200, 33250, true, infobateria)
    )
    SamochodContainer.add(
        Samochod("Nissan", "Leaf", "Nissan", LocalDate.of(2022, 11, 4), 157, 27800, true, infobateria)
    )
    SamochodContainer.add(
        Samochod("Tesla", "Model 3", "Tesla", LocalDate.of(2023, 1, 7), 261, 40240, true, infobateria)
    )
}
