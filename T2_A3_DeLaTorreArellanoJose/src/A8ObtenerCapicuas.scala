import scala.collection.mutable.ListBuffer

object A8ObtenerCapicuas {
  
   //funcion para solicitar los numeros
  def solicitarNumeros(numoPal:Int):ListBuffer[Int] = {
    val numeros = ListBuffer.empty[Int]
    for (i <- 0 until numoPal){
      println("Ingresa el numero "+ (i+1))
      numeros.+=(readInt())
    }
    numeros
  }
  
    //funcion para si es capicula
  def esCapicua(p:String):Boolean = {
    var tam = p.length()-1
    for(i <- 0 until p.length()){
        if(p.charAt(i) != p.charAt(tam-i)){
         return false
        }
    }
    true
  }
  
   //fincion para obtener capicuas
  def obtenerCapicuas(numeros:ListBuffer[Int]):ListBuffer[Int] ={
    val res = ListBuffer.empty[Int]
    for(n <- numeros){
      if(esCapicua(n.toString())){
        res.+=(n)
      }
    }
    res
  }
  
  //main
  def main(args: Array[String]): Unit = {
    println("Ingresa la cantidad de números a ingresar: ")
    var numeros = solicitarNumeros(readInt()) 
    println("\nNúmeros capicúas:")
    println(obtenerCapicuas(numeros))
    
  }
 
}

