/**
  * in most basic use Scala.trait == Java.interface
  * scala class can extend multiple traits
  * using keywords : extend and with
  *
  * the first : extend ; others : with
  *
  * unless the class implementing a trait is abstract
  * it must implement all the abstract methods
  *
  * if a class extends a traits but does not implement
  * the abstract methods defined in that trait
  * this class must be declared abstract
  *
  * one trait can extended by another trait
  */
trait BaseTrait {

}


trait A

trait B

trait C extends A

class D extends A with B
