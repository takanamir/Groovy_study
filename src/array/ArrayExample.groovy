package array

def arrayOne = new String[3]

String[] arrayTwo = ["Example1", "Example2", "Example3"]

def arrayThree = ["Example34", "Example24", "Example34"] as String

arrayOne[0] = "Array"

arrayOne.putAt(2, "Class")

arrayOne[1] = "Example"

println arrayOne        // [Array, Example, Class]

println arrayOne[1]     // Example

println arrayTwo.length // 3

println arrayTwo.size() // 3

def arrayInt = [1,2,3,0,8] as Integer[]

println arrayInt.min()  // 0

println arrayInt.max()  // 8