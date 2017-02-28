import scala.annotation.tailrec

object function {
  def abs(x: Double): Double = if (x < 0) -x else x

  def sqrt(x: Double) : Double = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double) = abs(guess * guess - x) < 0.001

    def improve(guess: Double, x: Double) = (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }
  sqrt(4.0)

  @tailrec
  def gcd(a:Int, b: Int) : Int = if (b == 0) a else gcd(b, a%b)
  gcd(10,20)

  def factorial1(n:Int):Int = if (n == 0) 1 else n * factorial(n-1)
  factorial1(10)

  def factorial(n:Int):Int = {
    def loop(acc:Int, n:Int) : Int = if (n == 0) acc else loop(acc * n , n - 1)
    loop(1, n)
  }
  factorial(10)

  def fibonacci(n:Int) : BigInt = {
    @tailrec
    def fibonacci_tail(n: Int, a: BigInt, b: BigInt): BigInt = if (n == 0) a else fibonacci_tail(n - 1, b, a + b)

    fibonacci_tail(n, 0, 1)
  }
  fibonacci(100)
}