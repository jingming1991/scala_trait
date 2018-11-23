/**
  * limit a trait so it can only be added to classes that
  * extended a superclass or another trait
  *
  * 限定一个特质可以被哪些继承了某个类或者继承了某个特质的类所使用
  * trait [TraitName] extends [SuperThing]
  *
  * a trait inheriting from a class is not a common occurrence
  * which is commonly used to limit the classes a trait can be mixed into
  */
abstract class Employee

class CorporateEmployee extends Employee

class StoreEmployee extends Employee

trait DeliverFood extends StoreEmployee

class DeliverPerson extends StoreEmployee with DeliverFood

//won't compile ,restrict of DeliverFood must belonged to StoreEmployee
//class Receptionist extends CorporateEmployee with DeliverFood