interface TestApi {
    fun getHuman(name: String) : Human
}

data class Human(val age: Int, val name: String)