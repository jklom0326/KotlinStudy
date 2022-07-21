package com.example.jklom0326.chap10.section1

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("f:\\test\\output.txt")).use {
        it.println("umjunsik")
    }
}