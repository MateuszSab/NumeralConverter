sealed abstract class RomanDigit(val arabic: Int)

object RomanDigit {
  case object I extends RomanDigit(1)
  case object IV extends RomanDigit(4)
  case object V extends RomanDigit(5)
  case object IX extends RomanDigit(9)
  case object X extends RomanDigit(10)
  case object XL extends RomanDigit(40)
  case object L extends RomanDigit(50)
  case object XC extends RomanDigit(90)
  case object C extends RomanDigit(100)
  case object CD extends RomanDigit(400)
  case object D extends RomanDigit(500)
  case object CM extends RomanDigit(900)
  case object M extends RomanDigit(1000)

  val getAllRomansDigits = List(M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I)
}



