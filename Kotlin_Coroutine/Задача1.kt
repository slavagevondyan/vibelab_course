import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("World")
    }
    println("Hello,")
    Thread.sleep(2000)
}
