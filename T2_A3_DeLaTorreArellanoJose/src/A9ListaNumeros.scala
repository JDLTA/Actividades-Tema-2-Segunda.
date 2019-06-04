import scala.collection.mutable.ListBuffer

object A9ListaNumeros {
  
    //funcion para solicitar los numeros
   def solicitarNumeros(numoPal:Int):ListBuffer[Int] = {
    val numeros = ListBuffer.empty[Int]
    for (i <- 0 until numoPal){
      println("Ingresa el numero "+ (i+1))
      numeros.+=(readInt())
    }
    numeros
  }
   
  //funcion para obtener los numeros primos
   def obtenerPrimos(numeros:ListBuffer[Int]):ListBuffer[Int] ={
     val res = ListBuffer.empty[Int]
     numeros.foreach(n => if(esPrimo(n)) res.+=(n))
     res
  }
 //funcion para determinar si es primo
   def esPrimo(n:Int):Boolean={
     for(i <- 1 to n){
       if(n%i == 0 && i != 1 && n != i)
         return false
     }
     true
   }
  //funcion que hace la sumatoria 
  def obtenerSumProm(numeros:ListBuffer[Int]):ListBuffer[Double] ={
     val res = ListBuffer.empty[Double]
     var sum = 0
     for(n <- numeros)
       sum += n
  
     res.+=(sum)
     res.+=(sum/numeros.size)
     return res
  }
  //funcion para obtener numerosfactoriales
  def obtenerFactoriales(numeros:ListBuffer[Int]):ListBuffer[Int] ={
    val res = ListBuffer.empty[Int]
    for(e <- numeros){
      res.+=(factorial(e))
    }
    res
  }
  //factorial
   def factorial(num:Int): Int = {
    if(num == 0){
      1
    } else {
      factorial(num-1)*num 
    }
  }

  
  //main
  def main(args: Array[String]): Unit = {
    println("Ingresa la cantidad de números a ingresar: ")
    var numeros = solicitarNumeros(readInt()) 
    
    println("Numeros primos:")
    println(obtenerPrimos(numeros))
    println("Sumatoria y promedio:")
    println(obtenerSumProm(numeros))
    println("Factoriales:")
    println(obtenerFactoriales(numeros))
  }
  
}

