import file.WorkWithFile
import yandex.YandexClient

fun main() {
    val workWithFile = WorkWithFile()
    val client = YandexClient()
    val addressList = workWithFile.getStringsFromFile()
    addressList?.forEach { workWithFile.setStringsToFile(client.getCoordinates(it)) }
}

