/**
  * put abstract or concrete fields in the trait
  * those field could be access by all types implement this trait
  */
trait PizzaTrait {
  //abstract
  var numTopping: Int
  //concrete var
  var size: Int = 10
  //concrete val
  val maxNumTopping: Int = 10
}

/**
  * need to define the values for the abstract value
  * fields of a trait can be declared as val or var
  * var fields : no need add override
  * val fields : must with override
  */
class Pizza extends PizzaTrait {
  var numTopping: Int = 5
  size = 7
  override val maxNumTopping: Int = 10
}