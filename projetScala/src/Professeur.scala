class Professeur {
  private var _idProfesseur: String= " "
  private var _nomProfesseur: String= " "
  private var _prenomPro: String= " "
  private var _grade: String= " "

  // getteur
  def idProfesseur = _idProfesseur
  // setteur
  def idProfesseur_= (newValue: String): Unit = {
    _idProfesseur = newValue
  }

  // getteur
  def nomProfesseur = _nomProfesseur
  // setteur
  def nomProfesseur_= (newValue: String): Unit = {
    _nomProfesseur = newValue
  }

  // getteur
  def prenomPro = _prenomPro
  // setteur
  def prenomPro_= (newValue: String): Unit = {
    _prenomPro = newValue
  }

  // getteur
  def grade = _grade
  // setteur
  def grade_= (newValue: String): Unit = {
    _grade = newValue
  }

  override def toString: String =
    s"($idProfesseur, $nomProfesseur $prenomPro, $grade)"
}
