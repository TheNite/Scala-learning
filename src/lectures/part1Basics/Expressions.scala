package lectures.part1Basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)

  println( 1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  // Instructions(DO) vs Expressions

  // IF Expressions
  val aCondition = true
  val aConditionValued = if(aCondition) 5 else 3
  println(aConditionValued)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while(i < 10) {
    println(i)
    i += 1
  }

  println(aWhile)
//  while(i < 10) {
//    println(i)
//    i += 1
//  }

  // NEVER WRITE THIS AGAIN
  // EVERYTHING in Scala is an Expressions!
  val aWeirdValue = (aVariable = 3) // Units === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if ( z > 2) "hello" else "goodbye"
  }

  // 1. different between "hello world" vs println("hello world")?
      // string literal and println() is a side effects or expression
  // 2.
  val someValue = {
    2 < 3
    // value = true
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
    // value = 42
  }

}
