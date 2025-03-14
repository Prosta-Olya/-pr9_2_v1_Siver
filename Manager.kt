package Autobaza

open class Manager(

) {
    var name = ""
    var auto = ""
    open fun Works(){
        println("Диспетчер $name работает по графику")
    }
    open fun Info(){
        println("Диспетчер $name")
    }
    open fun Auto(){
        println("Диспетчер $name назначает водителю автомобиль $auto")
    }
    open fun Suspend(){
        println("Диспетчер отстраняет водителя")
    }
    open fun Repair(){
        println("Машина $auto отправлена на ремонт")
    }
}