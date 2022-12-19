class Mercedes (override val wheels: Int): Cars("Mercedes"){
    init{
        println("This is a $name")
    }
    constructor(wheels: Int, pair: Int): this(wheels*pair)//can define wheels in terms of pairs of wheels
    override fun fuel(){
        println("Uses Diesel")
    }
    override fun fuel(engine: String, cylinders: Int) { //overloading..hehe
        println("Uses Diesel")
    }

}