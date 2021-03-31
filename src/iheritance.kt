import java.lang.management.GarbageCollectorMXBean

open class Gari(var make:String, var model:String, var colour:String, var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if(people<=capacity){
            println("carrying $people passengers")
        }
        else{
            println("Over $x people.")
        }
    }
    fun identity(){
        println("$colour $make $model")
    }
    fun calculateParkingFees(hours:Int):Int{
        return hours*20
    }
}
class Car(make: String,model: String,colour: String,capacity: Int):Gari(make, model, colour, capacity){}


class Bus(make: String,model: String,colour: String,capacity: Int):Gari(make, model, colour, capacity){
    fun calculate (hours:Int):Int{
        return hours *capacity
    }
    fun maxTripFare(fare:Double):Double{
        var max=0
        return max+fare
    }
}
 fun main(){
     var car=Car("vs","5330","blue",9)
     car.carry(4)
     println(car.calculateParkingFees(4))
     var cat=Bus("nissan","Rio","green",65)
     println(cat.maxTripFare(300.toDouble()*cat.capacity))
     println(cat.calculate(5))
     cat.identity()
 }
