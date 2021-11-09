package file

import java.io.File

class WorkWithFile {
    fun getStringsFromFile() =
        this::class.java.getResource("/address")?.readText()?.split("\n")?.filter { it.isNotEmpty() }?.toList()

    fun setStringsToFile(s: String) = File("/coordinates").writeText(s + "\n")
}