package com.lecture.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    /*
        Kotlin 에서는 Checked Exception 과 Unchecked Exception 을 구분하지 않음
        모두 Unchecked Exception 이다
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}