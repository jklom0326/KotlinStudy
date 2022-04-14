package com.example.jklom0326.chap10.section2

import java.io.FileWriter
import java.io.File
import java.io.PrintWriter

fun main() {

    val outString = "안녕하세요!\tHello\rWorld!." // 문자열
    val path ="F:\\test\\testfile.txt"
    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    printWriter.close()
}