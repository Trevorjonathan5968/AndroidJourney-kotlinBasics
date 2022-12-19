class Toyota (
    override val wheels: Int
): Cars("Toyota") {
    init {
        println("This is a $name")
    }
    constructor(wheels: Int, pair: Int): this(wheels*pair)//'this' is used to refer to class name
    companion object{
        //functions inside here do not require instances, they can be called directly as objects.
        fun ModelNumber(){
            println("Model number 45Y65UHW4FD345GE567")
        }
    }
    override fun fuel(){// overrides the parent function
        println("Uses unleaded petrol")
    }

    override fun fuel(engine: String, cylinders: Int) { //overloading..hehe
        println("Uses Diesel")
    }

}