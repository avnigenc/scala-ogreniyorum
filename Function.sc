
// Immutable
val cx: Int = 0

// Mutable
var cy: Int = 0
cy += 1
cy

"""
  Hello World
  Hello Scala
  New Line
"""

// ------------ //
// Function Definition
// Unit => Void
def funcA(): Unit = {
  println("Hello word")
}

funcA()

// ------------ //
// Anonymous Function Definition
def funcB: Int => Int = (x: Int) => {
  // no more return keyword
  // last line of the function is
  // returning by default
 x
}

var result = funcB(1)
result
var result0 = funcB.apply(1)
result0

// ------------ //
val anonymousFunc = () => "Hello world"
// anonymousFunc is a function
anonymousFunc.apply()
  // or
anonymousFunc()


// ------------ //

// Convert Normal Function to Anonymous Function
def NormalAdd(x: Int, y: Int): Int = {
  x + y
}

val anonAdd = NormalAdd _
anonAdd.apply(1,2)
