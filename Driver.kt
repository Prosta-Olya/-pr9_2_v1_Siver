package Autobaza

class Driver(

):Manager() {
    var count_reys = 0
    var statuc_auto = "" // состояние машины
    var completed_reys = "" // выполнение рейса
    override fun Works(){
        println("Водитель $name может совершить количество рейсов : $count_reys")
    }
    override fun Info() {
        println("Водитель $name")
    }
    override fun Auto(){
        println("Водитель $name выполняет рейсы на автомобиле $auto")
    }
    override fun Suspend() {
        println("Водитель $name отстранен от работы")
    }
    override fun Repair(){
        println("Водитель $name делает заявку на ремонт автомобиля $auto")
    }
    fun Mark(){
        println("Выполнение рейса: $completed_reys")
        println("Состояние машины: $statuc_auto")
    }
}