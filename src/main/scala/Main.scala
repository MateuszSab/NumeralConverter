import RomanDigit.getAllRomansDigits

import scala.io.StdIn.readLine
import scala.sys.exit

object Main extends App {
  val romanDig = List("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
  while (true) {
    val number = readLine("Type your number: ")
    if (romanDig.contains(number(0).toString)) println(NumberConverter.romanToArabic(number))
    else if (number.toIntOption.isDefined) println(NumberConverter.arabicToRoman(number.toInt))
    else println("ERROR! Invalid input.")

    val answer = readLine("Czy kontynuowac? (Y/n) ")
    if (answer == "n") {
      println("Arigato")

      exit()
    }
  }
}

