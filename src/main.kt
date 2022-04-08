fun main() {
    oddNumber()
    var z = nameArray(arrayOf("Faith", "Shaina", "Timothy", "Ngina", "Mollen"))
    println(z)
    robot(5)
    robot(12)
    robot(18)
    multipleNumber()

}

//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumber() {
    for (num in 1..100) {
        if (num % 2 != 0) {
            println(num)
        }
    }

}

//Create a function that takes in an array of names and returns the number of
//names longer than  5 characters
fun nameArray(names: Array<String>): Int {
    var x = 0
    names.forEach { name ->
        if (name.length > 5) {
            x++
        }
    }
    return x
}

fun robot(age: Int) {
    if (age < 6) {
        println("Serve milk")
    } else if (age > 6 && age < 15) {
        println("Serve Fanta Orange")
    } else {
        println("Serve Cocacola")
    }

}

fun multipleNumber() {
    for (num in 1..100) {
        if (num % 3 == 0 && num % 5 == 0)
            println("FizzBuzz")
        else if (num % 3 == 0) {
            println("Fizz")
        } else if (num % 5 == 0)
            println("Buzz")
        else {
            println(num)
        }
    }
}


