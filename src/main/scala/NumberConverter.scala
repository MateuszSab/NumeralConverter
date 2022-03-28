import scala.annotation.tailrec

object NumberConverter {
  def romanToArabic(input: String): Int = {
    @tailrec
    def romanToArabicHelper(input: String, result: Int, romanDigits: List[RomanDigit]): Int = {
      if (romanDigits.isEmpty) throw new IllegalArgumentException("Input cannot be converted")
      if (input.isEmpty) result
      else {
        val romanSymbol = romanDigits.head.toString
        if (input.startsWith(romanSymbol))
          romanToArabicHelper(input.substring(romanSymbol.length), result + romanDigits.head.arabic, romanDigits)
        else
          romanToArabicHelper(input, result, romanDigits.tail)
      }
    }

    romanToArabicHelper(input, 0, RomanDigit.getAllRomansDigits)
  }

  def arabicToRoman(number: Int): String = {
    @tailrec
    def arabicToRomanHelper(number: Int, result: String, romanDigits: List[RomanDigit]): String = {
      if (number <= 0) result
      else {
        if (romanDigits.head.arabic <= number)
          arabicToRomanHelper(number - romanDigits.head.arabic, result + romanDigits.head.toString, romanDigits)
        else
          arabicToRomanHelper(number, result, romanDigits.tail)
      }
    }

    if ((number <= 0) || (number > 4000)) throw new IllegalArgumentException(number + " is not in range (0,4000]")
    arabicToRomanHelper(number, "", RomanDigit.getAllRomansDigits)
  }

}
