/**
  * Using trait like Java.abstract class
  *
  */
trait Pett {
  //concrete implementation
  def speak(): Unit = {
    println("ha")
  }

  //abstract method
  def comeToMaster
}

class Dogg extends Pett {
  //Pet.speak is no need to implement
  def comeToMaster: Unit = println("coming")
}

class Catt extends Pett {
  //override the Pet.speak method
  override def speak(): Unit = println("meow")

  //Pet.speak is no need to implement
  def comeToMaster: Unit = println("no coming")
}

abstract class FlyingPet extends Pett {
  def fly(): Unit = {
    println("flying")
  }
}