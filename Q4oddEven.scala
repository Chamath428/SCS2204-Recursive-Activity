object Q4oddEven extends App{
  var num=50
  println(if (isEven(num))"Even" else "Odd")
  
  def isEven(x:Int):Boolean = x match{
    case 0 => true
    case _  => isOdd(x-1)
  }

  def isOdd(x:Int):Boolean = !isEven(x)
 
}