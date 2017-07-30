// Parameterize Arrays with Types
// Configure an instance when you create it
def greet() = {
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello" // Arrays are accessed by placing the index inside parentheses
  greetStrings(1) = ","
  greetStrings(2) = "World"

  for (i <- 0 to 2) // equivalent to (0).to(2)
    print(greetStrings(i))
}

greet()

val numNames1 = Array("zero", "one", "two") // call factory method, named apply
val numNames2 = Array.apply("zero", "one", "two")

// When you define a variable with val, the variable can't be re-assigned,
// but the object to which it refers could potentially still be changed.
numNames1(0) = "nonzero"
numNames1

val numNames3 = numNames1 ++ numNames2 // Concat array


// Use List
// Arrays in scala is mutable sequence of objects that all share the same type. Although you cannot change
// the length of an array after it is instantiated, you can change its element values.
// For immutable sequence of objects that shae the same type you can use List class.
val oneTwo = List(1,2) //List.apply(1, 2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour  //oneTwo ++ threeFour

// Be careful with ::, this prepends a new element to the beginning of an existing list
// and returns the resulting list
val oneTwoThree = 1 :: threeFour

// Shortcut way to specify an empty list is Nil
val numList = 1 :: 2 :: 3 :: 4 :: Nil


// List can be a var variable
var numList1 = 1 :: 2 :: Nil
numList1 = 2 :: 3 :: Nil

// Immutable like List but can contain different types of elements
val pair = (98, "Mainul")
pair._1 // Tuple indexing starts from 1

