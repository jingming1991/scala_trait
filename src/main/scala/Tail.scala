trait Tail {
  def wagTail {
    println("tail is wagging")
  }

  def stopTail {
    println("tail is stopped")
  }
}

abstract class Pet(var name: String) {
  //abstract
  def speak

  def ownerInHome {
    println("owner is in home")
  }

  def junmpForJou {
    println("have fun")
  }

}

class Dog(name: String) extends Pet(name) with Tail {
  override def speak: Unit = {
    println("I am a dog")
  }

  override def ownerInHome: Unit = {
    wagTail
    stopTail
    speak
  }
}

object Dog {
  var name: String = _



  def apply(name: String): Dog = new Dog(name)
}
