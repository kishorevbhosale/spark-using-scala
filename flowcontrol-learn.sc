// if else
if(1>3) println("impossible") else println("its wrong expression")

if (1>3){
  println("Impossible")
  println("Really")
} else {
  println("its wrong expression")
  println("still")
}

// Matching
val number = 3
number match {
  case 1 => println("one")
  case 2 => println("two")
  case 3 => println("three")
}

for (x <- 1 to 4){
  val square = x*x
  println(square)
}

var x = 10
while (x>=0){
  println(x)
  x -= 1
}

// Expression
{val x = 10; x+20}
print({val x = 10; x+20})

// fibonnaci series upto 10
val num = 10
var num1 = 0
var num2 = 1
print(num1)
print(num2)
for (i <- 2 to num){
  val res = num1+num2
  println(res)
  num1 = num2
  num2 = res
}