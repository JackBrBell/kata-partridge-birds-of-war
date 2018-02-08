object Partridge {

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {

    //Input array = args

    //Array of accepted strings = accepted
    val accepted = Array ("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    //filter args using accepted
    val filtered = args.filter(_.contains(accepted))
    //output = filtered

    //check is filtered is empty
    if (filtered.isEmpty) {
      "Lynn, I've pierced my foot on a spike!!"
    } else {
      val exPoints = "!"*filtered.length
      s"Mines a pint!$exPoints"
    }
    //If empty, return FOOT SPIKE!!
    //If not, check length of filtered
    //length of filtered = number of !
    // MINES A PINT!
  }

  def apple(x: Any): String = {
    ???
  }

  def london(args: Array[String]): String = {
    ???
  }

}
