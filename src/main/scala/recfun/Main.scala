package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def maintainControl(chars: List[Char], acc: Int): Boolean = {
      if (chars.tail.isEmpty && chars.head == '(') false
      else if (chars.tail.isEmpty && chars.head == ')' && acc == 0) false
      else if (chars.tail.isEmpty && chars.head == ')' && acc == 1) true
      else if (chars.tail.isEmpty && acc == 0) true
      else if (chars.head == '(') maintainControl(chars.tail, acc + 1)
      else if (chars.head == ')') maintainControl(chars.tail, acc - 1)
      else maintainControl(chars.tail, acc)
    }

    maintainControl(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
