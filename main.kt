import Autobaza.*

fun main(){

    var manager1: Manager = Manager()
    println("Введите имя диспетчера:")
    manager1.name = readln()
    println("Введите машину:")
    manager1.auto = readln()
    manager1.Works()
    manager1.Auto()

    var driver1: Driver = Driver()
    println("Введите имя водителя")
    driver1.name = readln()
    driver1.auto = manager1.auto
    println("Введите количество рейсов")
    driver1.count_reys = readLine()!!.toInt()

}