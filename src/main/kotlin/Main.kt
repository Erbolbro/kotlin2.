import anime.Bleach
import anime.Characteristic
import java.util.Scanner
fun main(args: Array<String>) {
    val characteristicList = listOf(
        Bleach(name = "Ичиго", spiritualSword = "зангецо", capabilities = "гетсего таншо", bankai = "тенса зангецу"),
        Bleach(name = "Айзен", spiritualSword = "кьеку суйгецу", capabilities = "хогьёку", bankai = "кьеку суйгецу"),
        Bleach(name = "Зараки", spiritualSword = "нозараши", capabilities = "хаори", bankai = "ААААААААА"),
        Bleach(
            name = "Бьякуя", spiritualSword = "зенбонзакура", capabilities = "цикада", bankai = "зенбонзакура кагейоши"
        )
    )

    val printInfo = Characteristic()
    characteristicList.forEachIndexed { index, bleach ->
        println("${index + 1}:${bleach.name}")
    }
    val scanner = Scanner(System.`in`)
    println("напишите номер героя , о котором хотите узнать")
    val bleachInput = readLine()?.toIntOrNull()
    if (bleachInput != null && bleachInput >= 1 && bleachInput <= bleachInput) {
        val selectorBleach = characteristicList[bleachInput - 1]
        println("информация о <<${selectorBleach.name}>>:")
        printInfo.Sinigami(selectorBleach)
    } else {
        println("такой номер не существует")
    }
}