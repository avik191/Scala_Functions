object Anonymous_Currying_Functions {

  def main(args: Array[String]): Unit = {

    // Anonymous Functions
    val sum = (x:Int,y:Int) => (x+y)
    println(sum(2,3))

    val hello = () => (println("Hello Scala"))
    hello()

    // Currying Functions
    val str1:String = "Hello, "
    val str2:String = "Scala!"

    println( "str1 + str2 = " +  strcat(str1)(str2))

    val add1 = add(10)_
    val add2 = add1(5)
    println(add2)
  }

  def strcat(str1: String)(str2 : String) : String = {
    str1 + str2
  }

  def add(x:Int)(y:Int) : Int = {
    x+y
  }

}
