package lectures

object Expressions extends App {
  val x = 1 + 2; //Expression
  println(x);

  println(2 + 3 + 4);
  // >>> right shift with zero extension
  println(1 == x);

  //== !=
  println(!(1 == x));

  //Instructions vs Expressions
  val aCondition = true;
  val aConditionValue = if (aCondition) 5 else 3; //IF Expression
  println(aConditionValue);

  println(1 + 3);

  var i = 0;
  while (i < 10) {
    println(i);
    i += 1;
  }

  val aCodeBlock = {
    val y = 2;
    val z = y + 1;
    if (z > 2) "hello" else "goodbye"
  }

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}
