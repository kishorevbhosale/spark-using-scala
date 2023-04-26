// tupes
// immutable list

val captainStuff = ("Picard", "Enterprose-D", "NCC-1701-D")
print(captainStuff)
print(captainStuff._1)
print(captainStuff._2)
print(captainStuff._3)

val picardShip  = "Picard" -> "Enterprise-D" -> "NCC-2171-D"
println(picardShip)
print(picardShip._2)
print(picardShip._1._2)

val aBunchOfStuff= ("kick", 1945, true, 3.14)
println(aBunchOfStuff)

// List
// Like a tuple, but more functionality
// Must be of same type

val shipList = List("Demo", "how", "are", "you")
println(shipList)
print(shipList.head)
print(shipList.tail)

for (ship <- shipList){print(ship)}

// map
val mapShip = shipList.map((ship: String) => {ship.toUpperCase.reverse})

// reduce
val numberList  = List(1,2,3,4,5)
val sum = numberList.reduce((x : Int, y:Int) => x+y)

//filter
val iHateFives = numberList.filter((x:Int) => x!=5)
val iHateThree = numberList.filter(_!=3)

var moreNumbers = List(6,7,8)
val allNum = numberList ++ moreNumbers
print(allNum)

val reversed = allNum.reverse
print(reversed)

val sorted = List(12,3,56,34,23,45,18,34,3,34,56).sorted
val distinct = sorted.distinct

val maxVal = distinct.max
val min = distinct.min
val sum = distinct.sum
val hasThree = iHateThree.contains(3)


//MAPS
val kvMap = Map("one" -> 1, "two" -> 2, "three"-> 3)
