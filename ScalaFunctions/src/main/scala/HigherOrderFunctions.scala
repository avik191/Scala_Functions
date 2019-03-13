object HigherOrderFunctions {

  def main(args: Array[String]): Unit = {
   // 1.
    func(multiplyFunction,5)
   // 2.
    addition(squareAdd,2,3)
    addition(cubeAdd,2,3)
    // 3.
    val sum = operateList(List(1,2,3),add,"sum")
    println(sum)
  }

  def multiplyFunction(n:Int) : Int = {
    return n * 2
  }

  def func(f:Int => Int,n:Int)={
    println(f(n))
  }
////////////////////////////////////////////////

  def addition(f:(Int,Int) => Int,x:Int,y:Int) = {
    println(f(x,y))
  }

  def squareAdd(x:Int,y:Int) : Int = {
    (x*x + y*y)
  }

  def cubeAdd(x:Int,y:Int) : Int = {
    (x*x*x + y*y*y)
  }
 ////////////////////////////////////////////////////


  def operateList(list: List[Int], f: (Int, Int) => Int, operation: String): Int = {
    def inner(list: List[Int], result: Int): Int = {
      list match {
        case head :: tail => inner(tail, f(head, result))
        case Nil => result
      }
    }
    operation.toLowerCase match {
      case "product" => inner(list, 1)
      case "sum" => inner(list, 0)
    }
  }

  def add(x:Int,y:Int) : Int = {
    (x + y)
  }

}
