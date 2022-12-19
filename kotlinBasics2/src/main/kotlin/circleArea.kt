class Circle(
    val radius: Int

) {
    val pi= 3.142
    init {
        println("This is a circle of radius: $radius")
    }
    fun area() = radius*radius*pi
    fun perimeter()= 2*pi*radius
}