fun imprimirVelas(edad: Int){
    repeat(edad){
        print("'")
    }
    println()
    repeat(edad){
        print("|")
    }
    println()
}
fun imprimirCapaSup(edad: Int){
    repeat(edad){
        print("=")}
    println()
}
fun imprimirCapasInf(edad: Int, numCapas: Int){
    repeat(numCapas){
        repeat(edad){
            print("@")
        }
        println()
    }
}
fun imprimirMensaje(mensaje: String, edad: Int){
    var num = (mensaje.chars().count().toInt())/2
    repeat(edad/8){
      print("''-._.-''")
    }
    println()
    repeat(num){
        print(" ")
    }
    print(mensaje)
    println()
    repeat(edad/8){
        print("''-._.-''")
    }
    println()
}
fun main() {
    println("Introduce la edad: ")
    val edad = readLine()?.toInt()?: 0
    println("Introduce la cantidad de capas: ")
    val capas = readLine()?.toInt()?: 0
    println("Introduce el mensaje: ")
    val mensaje = readLine()?: "Felicidades"
    imprimirMensaje(mensaje, edad)
    imprimirVelas(edad)
    imprimirCapaSup(edad)
    imprimirCapasInf(edad,capas)
    imprimirMensaje(mensaje, edad)
}