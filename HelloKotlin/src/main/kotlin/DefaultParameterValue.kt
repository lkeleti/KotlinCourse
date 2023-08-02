fun swim(speed: String = "fast") {
    println("Swimming speed is $speed")
}

fun main() {
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
}