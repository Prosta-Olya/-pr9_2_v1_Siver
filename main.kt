import Autobaza.*

fun main(){
try {
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
    driver1.Works()
    driver1.Auto()

    println("Диспетчер ${manager1.name} хочет отстранить водителя ${driver1.name} от работы? \n 1 - Да \n 2 - Нет")
    var dialogue = readLine()!!.toInt()
    when(dialogue){
        1 ->{
            manager1.Suspend()
            driver1.Suspend()
            return
        }
        2 ->{
            driver1.Auto()
        }
        else -> println("Неверный ввод данных")
    }

    println("Водитель  ${driver1.name} хочет сделать заявку на ремонт автомобиля? \n 1 - Да \n 2 - Нет")
    dialogue = readLine()!!.toInt()
    when(dialogue){
        1 ->{
           driver1.Repair()
            manager1.Repair()
            println("Введите новую машину")
            manager1.auto = readln()
            driver1.auto = manager1.auto
            driver1.Auto()
        }
        2 ->{
          driver1.Auto()
        }
        else -> println("Неверный ввод данных")
    }
    println("Введите сведения о выполнении рейса")
    driver1.completed_reys = readln()
    println("Введите сведения о состоянии автомобиля ${driver1.auto}")
    driver1.statuc_auto = readln()
    driver1.Mark()
}
catch (e:Exception){
    println("Ошибка, некорректный ввод данных")
}
}