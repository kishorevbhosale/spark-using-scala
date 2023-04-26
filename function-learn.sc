// function

// Syntax :  def <function-name>(parameter name:type ...) : return type = { }

def squareIt(x:Int) : Int = {
  x * x
}

squareIt(4)

def cubeIt(x:Int) : Int = {
  x*x*x
}

cubeIt(4)

def transofrmInt(x:Int, f:Int => Int): Int = {
  f(x)
}
val result  = transofrmInt(2, cubeIt)

transofrmInt(3, x => x*x*x)

transofrmInt(10, x => x/2)

transofrmInt(2, x => {val y = x*2; y*y})

def uppercase(x: String) : String = {
  x.toUpperCase
}

println(uppercase("hello"))

def toUppercaseFun(x:String, f:String =>  String):String = {
  f(x)
}

val result = toUppercaseFun("hello how are you?", uppercase)

toUppercaseFun("hello", x => x.toUpperCase)