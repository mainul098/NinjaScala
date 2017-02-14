package Beginning

/**
  * Created by mislam on 2/13/2017.
  */
object Fibonacci {
  def fib(n: Int): Int = {
    def fibIteration(i: Int, a: Int, b: Int): Int =
      if (i == n) a else fibIteration(i + 1, b, a + b)

    fibIteration(0, 0, 1)
  }
}
