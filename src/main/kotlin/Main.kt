import java.util.*

fun main(args: Array<String>) {
    var diametro = 0.0
    var area = 0.0
    var pi = 3.14
    var raio = 0.0
    var leitura = Scanner(System.`in`)


    print("Digite o valor do diâmetro da área: ")
    diametro = leitura.nextInt()
    raio = diametro/2
    area = pi * raio * raio

    println("A área de um círculo de raio $raio é $area")

}