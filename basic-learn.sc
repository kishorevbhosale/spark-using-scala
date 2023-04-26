import scala.math.Equiv.Float

// values are immutable constants
val name : String = "mithil"
name
print(name)


// variables are mutable
var helloThere : String = name
helloThere = name + " there!"
print(helloThere)


// Data types
val numberOne : Int = 1
val truth : Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.1415925
val piSinglePrescion : Float = 3.1415925f
val bignumber : Long = 123456789
val smallNumber: Byte = 127

val ans:String = "The life, the universe, the answer 34 is correct"

val pattern = """.*([\d]+).*""".r
val pattern(answer) = ans
val result = answer.toInt
print(result)

// Boolean
val isGreater = 1 > 2
val isLesser =  1 < 2
val impossible = isGreater & isLesser
val impossible = isGreater || isLesser

val picard:  String = "picard"
val bestCard: String = "picard"
val isBest : Boolean = picard == bestCard

val piVal: Double = 3.141267878
print(f"$piVal%.3f".toString)
