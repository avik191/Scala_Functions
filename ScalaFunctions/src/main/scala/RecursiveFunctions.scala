object RecursiveFunctions {

  def main(args: Array[String]): Unit = {

    println(calFactorial(5))
    println(calPower(2,5))

  }

  def calFactorial(n : Int) : Int ={
    if(n <= 1) return 1
    else
      return n * calFactorial(n - 1) // recursion here
  }

  def calPower(x : Int , y : Int ) : Int = {
    var temp : Int = 0
    if(y == 0) return 1

    temp = calPower(x,y/2)  // recursion here
    if(y%2 == 0) return temp*temp
    else return x*temp*temp
  }

}
