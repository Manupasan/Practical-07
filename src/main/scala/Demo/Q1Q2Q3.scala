import scala.io.StdIn._

@main def main() =
  filterEvenNumbers()
  calculateSquare()
  filterPrime()

def filterEvenNumbers(): Unit =
  println("========== Filter Even Numbers ==========")
  println("How many numbers do you want to enter : ")
  val count = readInt()
  println("Enter numbers : ")
  val numList =  (for (i <- 1 to count) yield readInt()).toList

  val evenNumbers = numList.filter(_%2==0)
  println("Even numbers are : " + evenNumbers.mkString(","))

def calculateSquare(): Unit =
  println("========== Calculate Square ==========")
  println("How many numbers do you want to enter : ")
  val count = readInt()
  println("Enter numbers : ")
  val numList = (for (i <- 1 to count) yield readInt()).toList

  val squareList = numList.map(p=>p*p)
  println("Squares of the input : " + squareList.mkString(","))

def filterPrime() : Unit =
  println("========== Filter Prime Numbers ==========")
  println("How many numbers do you want to enter : ")
  val count = readInt()
  println("Enter numbers : ")
  val numList = (for (i <- 1 to count) yield readInt()).toList

  val primeNumbersLv1 = numList.filter(n => {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 until n).exists(i => n % i == 0)
  })
  println("Prime numbers are : " + primeNumbersLv1)

