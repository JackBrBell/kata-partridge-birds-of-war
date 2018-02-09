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
  ???
  }

  def london(args: Array[String]): String = {
    ???
}

}
