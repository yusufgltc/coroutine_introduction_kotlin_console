import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(2000)
        print("World")
    }
    println("Hello ")
    Thread.sleep(3000)
}