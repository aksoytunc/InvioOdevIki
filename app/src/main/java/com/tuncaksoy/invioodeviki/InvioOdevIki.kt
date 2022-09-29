package com.tuncaksoy.invioodeviki

class InvioOdevIki {

    fun questionOne(celsius: Double): Double {
        val fahrenheit = celsius * 1.8 + 32
        return fahrenheit
    }

    fun questionTwo(edgeOne: Int, edgeTwo: Int) {
        val perimeterOfRectangle = 2 * (edgeOne + edgeTwo)
        println("2-Perimeter Of Rectangle: $perimeterOfRectangle")
    }

    fun questionThree(number: Int): Long {
        var factorial = 1L

        if (number != 0) {
            for (i in 1..number) {
                factorial *= i
            }
        } else {
            factorial = 1
        }
        return factorial
    }

    fun questionFour(word: String) {
        println("4-Half Count: ${word.length}")
    }

    fun questionFive(edgeCount: Int): Long {
        val sumOfInteriorAngles = (edgeCount - 2) * 180L
        return sumOfInteriorAngles
    }

    fun questionSix(workingDay: Int): Long {
        var wage = 0L
        if (workingDay <= 20) {
            wage = workingDay * 8 * 10L
        } else {
            wage = ((20 * 10) + ((workingDay - 20) * 20)) * 8L
        }
        return wage
    }

    fun questionSeven(quota: Int): Long {
        var invoice = 0L
        if (quota <= 50) {
            invoice = 100
        } else {
            invoice = 100 + (quota - 50) * 4L
        }
        return invoice
    }
}