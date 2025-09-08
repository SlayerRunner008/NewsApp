package Items

data class newsBoxItem (
    val title : String,
    val date : String
)

val newsBoxList = listOf(
    newsBoxItem("Perro ataca abuela","febrero 08 - 2024"),
    newsBoxItem("Hombre clona a su pez","enero 25 - 2025"),
    newsBoxItem("Indios descubren cueva alienígena","Marzo 25 - 2025"),
    newsBoxItem("Encuentran ballena mutante en un río","Agosto 08 - 2025")

)