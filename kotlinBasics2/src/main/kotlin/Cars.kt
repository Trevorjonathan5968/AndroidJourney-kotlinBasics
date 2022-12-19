//Abstract class ensures one cannot create instances of the parent class, only the child class
abstract class Cars (
    var name: String
){
    init {
        println("CAR")
    }
    abstract fun fuel() //Abstract functions ensures child classes must have those functions
    abstract fun fuel(engine: String, cylinders: Int)
    abstract val wheels: Int
    fun changeName(new: String){
        name= new
    }
}

