object NestedFunctions {

  def main(args: Array[String]): Unit = {

    println(calSum3(2,3,4))
    println(calFactorial(5))

  }

  def calSum3(a:Int,b:Int,c:Int) : Int = {

    def sum2(x:Int,y:Int) : Int = {
      x+y
    }
    val result = sum2(a,sum2(b,c))
    result
  }

  def calFactorial(n:Int) : Int = {

    def fact(n:Int,accumulator:Int) : Int = {
      if (n <= 1) return accumulator
      else
        return fact(n-1,n*accumulator)
    }

    fact(n,1)
  }

}
