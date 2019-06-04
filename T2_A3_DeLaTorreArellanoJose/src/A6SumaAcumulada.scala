
import scala.collection.mutable.ListBuffer

object A6SumaAcumulada {
  
    //funcion para solicitar los numeros para la sumatoria
   def solicitarNumeros(numoPal:Int):ListBuffer[Int] = {
    val num = ListBuffer.empty[Int]
    for (i <- 0 until numoPal){
      println("Ingresa el numero "+ (i+1))
      num.+=(readInt())
    }
    num
  }
   
   //funcion para obter la sumatoria de los numeros
  def obtenerSumatoria(numeros:ListBuffer[Int]):ListBuffer[Int] ={
    val res = ListBuffer.empty[Int]
    var sumatoria = 0
    for(n <- numeros){
      sumatoria += n
      res.+=(sumatoria)
    }
    res
  }

  
  //main
  def main(args: Array[String]): Unit = {
    println("Ingresa la cantidad de números a ingresar: ")
    var numeros = solicitarNumeros(readInt()) 
    
    println("\nSumaorias: ")
    println(obtenerSumatoria(numeros))
    
  }
 
}
