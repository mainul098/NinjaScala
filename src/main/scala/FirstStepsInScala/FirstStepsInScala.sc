// Define variables
val msg:String = "Hello, world!"

val msg1 = "Hello, worlds again"

// val variables cannot be re-assign
// msg = "Hello, Universe"

var msg2 = "Hello, World"
msg2 = "Hello, Universe" // var variable can be re-assign in it's whole lifecycle



// Define functions
def max(x:Int, y:Int) : Int = {
  if (x>y) x
  else y
}

def max_simplified(x:Int, y:Int) = if (x > y) x else y

def greet() = println("Hello, world")
greet()

// Iterate with foreach
def print_array(args: Array[String]) = args.foreach(arg => println(arg))
print_array(Array("One", "Two", "Three"))

def print_array_simplified(args: Array[String]) = args.foreach(println)
print_array(Array("One", "Two", "Three"))
