import scala.io.StdIn._

object Q5addEven extends App{
  
  var num=10
  println(add(num))
  
  def add(x:Int):Int={
    if(x%2==0){
      if(x==0)
        0
      else
        x+add(x-1)
    }
    else{
      add(x-1)
    }
  }
 
}