import scala.io.StdIn.readLine
import scala.sys.exit

object Main extends App {
  while (true) {
    val number = readLine("Type your number: ")
    val question: String = readLine("From what numerical system do you want to convert?(R/ Roman, A/ Arabic): ")
    if (question == "R") println(NumberConverter.romanToArabic(number))
    else if (question == "A") println(NumberConverter.arabicToRoman(number.toInt))
    else println("ERROR! number/system mismatch")

    val answer = readLine("Czy kontynuowac? (Y/n) ")
    if (answer == "n") {
      println("Arigato")

      exit()
    }
  }
}



