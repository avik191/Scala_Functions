object CallByNameFunctions {

  def main(args: Array[String]): Unit = {

    delay(time(3))

  }

  def time(x:Int) : Long = {
    println("Inside time function .."+x)
    System.nanoTime()
  }

  def delay(t: => Long) = {
    println("Inside delay function ..")
    println("t = " + t)
    println("Calling time again")
    println("t = " + t)
  }

}
