import RomanDigit.getAllRomansDigits

import scala.io.StdIn.readLine
import scala.sys.exit

object Main extends App {
  while (true) {
    val number = readLine("Type your number: ")
    if (getAllRomansDigits.map(_.toString).contains(number.head.toString)) println(NumberConverter.romanToArabic(number))
    else if (number.toIntOption.isDefined) println(NumberConverter.arabicToRoman(number.toInt))
    else println("ERROR! Invalid input.")

    val answer = readLine("Czy kontynuowac? (Y/n) ")
    if (answer == "n") {
      println("Arigato")

      exit()
    }
  }
}

