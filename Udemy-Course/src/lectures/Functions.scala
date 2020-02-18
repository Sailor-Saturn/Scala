package lectures

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 22))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def greetingForKid(name: String, age: Int): String =
    "Hi, my name is " + name + "and I'm " + age + "years old."

  println(greetingForKid("David", 5));

  /*  def factorial(n: Int): Int = {
      if (n <= 0) 1
      else n * factorial(n-1)
    }*/

  def calc_fact(i: Int, value: Int): Int = {
    if (i <= 1) value else calc_fact(i - 1, i * value)
  }

  def factorial(n: Int): Int = {
    calc_fact(n, 1)
  }

  def fibo(n: Int): Int = {
    if (n <= 2) 1
    else fibo(n - 1) + fibo(n - 2)
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }

  println(isPrime(33))
  println(isPrime(11))
}
