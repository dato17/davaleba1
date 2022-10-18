import kotlin.math.pow
import kotlin.math.sqrt

fun main() {



    var point1=Point(1.0,2.0)
    println(point1)

    println(point1 == point1)
    println(point1.distance(point1))

    println(point1.simetria())
}



class   Point(x:Double,y:Double){
    private var X=x
    private var Y=y
    override fun toString(): String {
        return "$X,$Y"

    }

    override fun equals(other: Any?): Boolean {
        return other is Point && X==other.X && Y==other.Y
    }

    fun distance(p:Point):Double{
        var x1 =X
        var y1 =Y
        var x2 =p.X
        var y2 =p.Y
        return (sqrt(x1-x2).pow(2)+ sqrt(y1-y2).pow(2))

    }
    fun simetria():Point{
        return Point(X*-1,Y*-1)
    }


}