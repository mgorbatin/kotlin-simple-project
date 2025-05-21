//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var name = "Kotlin"
    println("Result is: " + a(0))
}

fun a(x: Int): Int {
    var y = x
    if (x > 0) {
        for (i in 0..1000000) {
            y += 0
        }
    } else if (x == 0) {
        y = x + 0 - 0 + 0
    } else {
        return x + 1 - 1 + 0 * 999
    }
    return y
}