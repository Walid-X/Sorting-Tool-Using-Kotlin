@file:Suppress("SpellCheckingInspection")

import java.util.Scanner

fun main() {
    var choi: String
    val scan = Scanner(System.`in`)

    // Display a welcome message and instructions to the user
    do {
        println("Welcome to our Sorting Tool")
        println("Using this Tool you can sort different data types forms")
        println("like numbers and Strings using different sorting methods")
        println("Please Choose which data type you are willing to sort using our Tool:")
        println("- Numbers")
        println("- Strings")
        choi = readln()

        // Based on the user's choice, call the fill() function to input and sort data
        when(choi) {
            "Numbers" -> {
                fill(scan, choi)
                choi = " "
            }
            "Strings" -> {
                fill(scan, choi)
                choi = " "
            }
        }
    } while (choi != " ")
}

fun fill(scan: Scanner, choice: String) {
    var i = 0
    when (choice) {
        "Numbers" -> {
            // To use a dynamic array, we need to use ArrayList<Int> data type
            val array = ArrayList<Int>()
            var chx: String
            do {
                println("Enter the element number N" + (i + 1))
                i += 1
                array.add(scan.nextInt())
                print("Add Or End ?? ")
                chx = readln()
            } while (chx == "Add")
            sortN(array)
        }
        "Strings" -> {
            val array = ArrayList<String>()
            var chx: String
            do {
                println("Enter the String N" + (i + 1))
                i += 1
                array.add(readln())
                print("Add Or End ?? ")
                chx = readln()
            } while (chx == "Add")
            sortS(array)
        }
    }
}

fun sortN(arr: ArrayList<Int>) {
    var help: Int
    println("The Unsorted Version : ")
    for (element in arr) {
        print("$element |")
    }

    // Sorting the array in ascending order using a simple bubble sort algorithm
    for (i in arr.indices) {
        for (j in i + 1 until arr.size - 1) {
            if (arr[i] > arr[j]) {
                help = arr[i]
                arr[i] = arr[j]
                arr[j] = help
            }
        }
    }

    println("")
    println("The Sorted Version : ")
    for (element in arr) {
        print("$element | ")
    }
}

fun sortS(arr: ArrayList<String>) {
    var help: String
    println("The Unsorted Version : ")
    for (element in arr) {
        print("$element |")
    }

    // Sorting the array of strings in lexicographic (alphabetical) order
    for (i in arr.indices) {
        for (j in i + 1 until arr.size - 1) {
            if (arr[i] > arr[j]) {
                help = arr[i]
                arr[i] = arr[j]
                arr[j] = help
            }
        }
    }

    println("")
    println("The Sorted Version : ")
    for (element in arr) {
        print("$element | ")
    }
}

// Some mistakes get made, that's the moral of the story
