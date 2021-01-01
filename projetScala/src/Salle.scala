class Salle {
  private val _numeroSalle: String= " "
  private var _libelleSalle: String= " "

  // getteur
  def numeroSalle = _numeroSalle

  // getteur
  def libelleSalle = _libelleSalle
  // setteur
  def libelleSalle_= (newValue: String): Unit = {
    _libelleSalle = newValue
  }

  override def toString: String =
    s"($numeroSalle, $libelleSalle)"
}