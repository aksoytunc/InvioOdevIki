package com.tuncaksoy.invioodeviki

fun main() {
    val invioOdevIki = InvioOdevIki()

    println("1-Fahrenheit:${invioOdevIki.questionOne(19.0)}") //1

    invioOdevIki.questionTwo(5,7) //2

    println("3-Factorial: ${invioOdevIki.questionThree(6)}") //3

    invioOdevIki.questionFour("TunçAksoy")//4

    println("5-Sum of Interior Angles: ${invioOdevIki.questionFive(3)}")//5

    println("6-Wage: ${invioOdevIki.questionSix(23)}")//6

    println("7-İnvoice: ${invioOdevIki.questionSeven(55)}₺")
}