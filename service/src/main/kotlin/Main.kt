class App(): TestApi {
    override fun getHuman(name: String): Human {
        return Human(21, "Anna")
    }
}

fun main(vararg args: String) {
    val app = App()
    val answer = app.getHuman("any")
    println("The answer to the ultimate question of Life, the Universe and Everything is $answer.")
}