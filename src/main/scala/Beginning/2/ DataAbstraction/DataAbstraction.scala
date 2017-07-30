package Beginning.DataAbstraction

object DataAbstraction extends App{
  val t1 = new NonEmpty(3, new Empty, new Empty)
  val t2 = t1 incl 4
  val t3 = t2 incl 2
  println(t3)
}