import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(2000)
        print("World")
    }
    println("Hello ")
    runBlocking {
        delay(3000)
    }
}