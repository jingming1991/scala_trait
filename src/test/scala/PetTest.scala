import org.scalatest.FunSuite

class PetTest extends FunSuite {

  test("trait as abstract class") {
    val ming = Dog("ming")
    ming.ownerInHome
  }
}
