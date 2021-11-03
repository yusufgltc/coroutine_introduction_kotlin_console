import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        val job = this.launch {
            delay(10000)
            print("World")
        }
        println("Hello ")
        delay(5000)
        job.cancel()
        job.join()
    }
}