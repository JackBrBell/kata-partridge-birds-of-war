object Partridge extends App{

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {

    val accepted = Array ("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val filtered = args.count(accepted contains _)

    if (filtered == 0) {
      "Lynn, I've pierced my foot on a spike!!"
    } else {
      s"Mine's a Pint" + "!"*filtered
    }
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
  
  def london(input: Array[String]): String = {

    val accepted: Array[String] = Array("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")
  if (accepted.forall(inputString => input.contains(inputString)) ) {
    "Smell my cheese you mother!"
  } else {
    "No, seriously, run. You will miss it."
  }
  }

}

