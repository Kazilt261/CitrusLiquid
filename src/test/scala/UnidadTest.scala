import munit.FunSuite

class UnidadTest extends munit.FunSuite {
  test("crear una unidad"){
    val player1 = new Personaje("Juan",10, 10, 25, 8, 15, "Vivo")
  }
  test("revisar cuando un personaje no jugable no tiene vida"){
    val chiken = new WildUnit("pollo", 3, 0, -1, -1, 1, "Vivo")
    assertEquals(chiken.Estado, "Vivo")
    chiken.isKO()
    assertEquals(chiken.Estado, "Desaparece")
  }
  test("revisar cuando un personaje jugable no tiene vida") {
    val player1 = new Personaje("Juan",10, 0, 25, 8, 15, "Vivo")
    assertEquals(player1.Estado, "Vivo")
    player1.isKO()
    assertEquals(player1.Estado, "KO")
  }
}

