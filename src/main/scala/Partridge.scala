object Partridge {

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {
    ???
  }

  def apple(x: Any): String = {

    def process(num: Int): String = {
      val squared = num*num
      if (squared >= 1000) {
        "It's hotter than the sun!!"
      } else {
        "Help yourself to a honeycomb Yorkie for the glovebox"
      }
    }
    x match {
      case i: Int => process(i)
      case s: String =>
        try {
          process(s.toInt)
        } catch {
          case ex: NumberFormatException => "Not a number"
        }
      case _ => "Not a number"
    }
  }

  def london(args: Array[String]): String = {
    ???
  }
}
