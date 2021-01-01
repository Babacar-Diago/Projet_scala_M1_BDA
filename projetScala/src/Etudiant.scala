class Etudiant {
  private val _idEtudiant: String= " "
  private var _nomEtudiant: String= " "
  private var _prenomEtudiant: String= " "
  private var _niveauEtude: String= " "

  // getteur
  def idEtudiant = _idEtudiant

  // getteur
  def nomEtudiant = _nomEtudiant
  // setteur
  def nomEtudiant_= (newValue: String): Unit = {
    _nomEtudiant = newValue
  }

  // getteur
  def prenomEtudiant = _prenomEtudiant
  // setteur
  def prenomEtudiant_= (newValue: String): Unit = {
    _prenomEtudiant = newValue
  }

  // getteur
  def niveauEtude = _niveauEtude
  // setteur
  def niveauEtude_= (newValue: String): Unit = {
    _niveauEtude = newValue
  }

  override def toString: String =
    s"($idEtudiant, $nomEtudiant $prenomEtudiant, $niveauEtude)"
}