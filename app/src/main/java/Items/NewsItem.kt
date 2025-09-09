package Items

data class NewsItem(
    val title : String,
    val image : String
)

val newsList = listOf(
    NewsItem("Perro loco ataca abuela","https://vanguardia.com.mx/binrepository/1152x648/0c0/0d0/down-right/11604/KOHY/karla-velazquez-2024-06-27t202757_1-9335047_20240628022903.jpg"),
    NewsItem("Intentan robar la luna","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSFfgLrw0oUBI0ggiThvwbpy9AMTbupUDxX-9OAQv5q_1tJGIpTKtftgLy4PFFi91UyCo94tZV9HR3OvpFaPVOzVVighcn1diWGsxbvHKijpClkIkPW4UML22EWxm60tI0hKbnZEs342oftK5rY-7zYTFei7QH0rK7fnkKrTu5IcW7ZA5FzmRNzxPFQf76/s2000/Despicable-Me-What-Happened-To-Vector-Did-He-Survive-On.png"),
    NewsItem("Sale Silksong después de 84 años","https://i.blogs.es/c008f2/mantones-de-peregrino-silksong/840_560.jpeg"),
    NewsItem("Cada día más cerca del mundo de fallout","https://tse4.mm.bing.net/th/id/OIP.XbmkcSP7Hmt6lfL0adpQOwHaEo?rs=1&pid=ImgDetMain&o=7&rm=3"),
    NewsItem("El emperador sigue vivo solo por culpa de los orcos ?","https://th.bing.com/th/id/R.d779b5cb2b8bc0feeef2002f6e544675?rik=UKxWiXNaBwE2lg&pid=ImgRaw&r=0"),
    NewsItem("Batman Beyond es real ? ","https://rare-gallery.com/mocahbig/1323355-BatmanBatman-Beyond-4k-Ultra-HD-Wallpaper.jpg")

)