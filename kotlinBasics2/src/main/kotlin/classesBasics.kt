fun main(){
    /*val newCircle= Circle(7)
    println("The perimeter is: ${newCircle.perimeter()}")
    println("The perimeter is: ${newCircle.area()}")*/

    val car1= Toyota(4)
    val car2= Mercedes(8)
    car1.changeName("Land Cruiser V8")
    println(car2.wheels)
    car2.fuel()
    println(car1.name)

    Toyota.ModelNumber()//instance of companion object ModelNumber in class Toyota, without specifying a variable

    //anonymous class instantiation and execution
    val audi= object: Cars("Audi"){
        init{
            println("This is the new Audi")
        }

        override fun fuel(){
            println("Is electric")
        }

        override fun fuel(engine: String, cylinders: Int) {
            println("Is Hybrid")
        }

        override val wheels: Int= 4

    }

    audi.fuel()
}

//lambda functions: will do more research
