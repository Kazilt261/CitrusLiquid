class Personaje(val Nombre: String,
             var HitMax: Int,
             val HitAct: Int,
             val ATK: Int,
             val DEF: Int,
             val EVA: Int,
             var Estado: String) extends UnidadTrait {
  def isKO(): Unit = {
    if (HitAct <= 0){
      Estado = "KO"
    }
  }

}
