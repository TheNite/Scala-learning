package lectures.part1Basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  print(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("Hello World")

  def aBigFunction(n: Int): Int = {
    def aSamllerFunction(a: Int, b: Int): Int = a + b

    aSamllerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    2. Factorial Function  1 * 2 * 3 * ... * n
    3. A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n -2)
    4. Tests if a number is prime
   */

  // 1.
  def aGreeting(name: String, age: Int): String = {
    f"Hi, my name is $name and I am $age years old"
  }
  println(aGreeting("Paul", 27))

  def factorial(n: Int): Int =
    if (n <= 0 ) 1
    else n * factorial(n-1)

  println(factorial(5)) // 120

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)


  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
