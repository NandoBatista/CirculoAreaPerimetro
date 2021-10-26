import java.util.*

fun main(args: Array<String>) {
    var diametro = 0.0
    var perimetro = 0.0
    var area = 0.0
    var pi = 3.14
    var raio = 0.0
    var leitura = Scanner(System.`in`)


    print("Digite o valor do diâmetro do círculo: ")
    diametro = leitura.nextInt()
    raio = diametro/2
    area = pi * raio * raio
    perimetro = (raio * 2) * pi

    println("Com base no diametro $diametro da área de um círculo, temos qu a area é igual a $area e seu perimetro é igual a $perimetro")

}
