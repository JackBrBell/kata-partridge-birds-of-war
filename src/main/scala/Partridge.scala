object Partridge extends App{

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {

    //Input array = args

    //Array of accepted strings = accepted
    val accepted = Array ("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    //filter args using accepted
    //val statements = accepted.mkString(" ")
    val filtered = args.count(accepted contains _)
    //output = filtered

    //check is filtered is empty
    if (filtered == 0) {
      "Lynn, I've pierced my foot on a spike!!"
    } else {
      //val exPoints = "!"*filtered.length
      s"Mine's a Pint" + "!"*filtered
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


  part(Array("sausage", "pelvis"))
}
