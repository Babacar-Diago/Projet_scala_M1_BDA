class Matiere {
  private val _codeMatiere: String= " "
  private var _libelleMatiere: String= " "
  private var _coeffMatiere: String= " "

  // getteur
  def codeMatiere = _codeMatiere

  // getteur
  def libelleMatiere = _libelleMatiere
  // setteur
  def libelleMatiere_= (newValue: String): Unit = {
    _libelleMatiere = newValue
  }

  // getteur
  def coeffMatiere = _coeffMatiere
  // setteur
  def coeffMatiere_= (newValue: String): Unit = {
    _coeffMatiere = newValue
  }

  override def toString: String =
    s"($codeMatiere, $libelleMatiere, $coeffMatiere)"
}