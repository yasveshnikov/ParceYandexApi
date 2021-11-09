package yandex

class YandexClient {
    private val authKey = "0f71a61d-0b29-4422-a0f5-2a5cb6aa0608"
    private val client = Client.getClient()

    fun getCoordinates(address: String): String {
        return try {
            client.getNearStations(authKey, address).execute()
                .body()?.geoObjectCollection?.featureMember?.geoObject?.point?.pos!!
        } catch (e: NullPointerException) {
            "null"
        }

    }
}