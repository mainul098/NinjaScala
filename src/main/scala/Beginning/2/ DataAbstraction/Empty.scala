package Beginning.DataAbstraction

class Empty extends IntSet{
  def incl(x: Int): IntSet = new NonEmpty(x,new Empty, new Empty)

  def contains(x: Int): Boolean = false

  override def toString: String = "."
}
