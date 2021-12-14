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
fun imprimirMensaje(mensaje: String){
    println("''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''")
    println("  ¡¡¡¡¡¡¡¡¡¡$mensaje¡¡¡¡¡¡¡¡¡¡  ")
    println("''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''")
}
fun main() {
    val edad = 30
    val capas = 5
    val mensaje = "MUCHAS FELICIDADES"
    imprimirMensaje(mensaje)
    imprimirVelas(edad)
    imprimirCapaSup(edad)
    imprimirCapasInf(edad,capas)
    imprimirMensaje(mensaje)
}