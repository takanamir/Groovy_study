package list

// Empty list
def list0 = []

println list0.size() // 0

// Creating list the way we create in java
def list1 = new ArrayList<String>()

// List with initial value
def list2 = [2,3,4,5,1]

// adding value to list

// first way of adding
list0.add("Takanami")

// second way
list0 << "ListExample"

// third way to add value always at the end
list0.push("Example3")

println list0 // [Takanami, List Example, Example3]

// fourth way to keep the data at specific index
list0.putAt(1, "Collect")

println list0 // [Takanami, Collect, Example3]

// Retrieving data from list

// first way
println list0[1] // Collect

// second way
println list0.get(2) // Example3

// third method to retrieve value
println list0.getAt(0) // Takanami

// fourth approach negative index
println list0[-1] // Example3

// Removing value from list
println list0 // [Takanami, Collect, Example3]

// first way to remove data from list
println list0.remove("Example3") // true

println list0 // [Takanami, Collect]

list0.add("Demo")

list0.add("Demoq")

list0.add("DemoA")

println list0 // [Takanami, Collect, Demo, Demoq, DemoA]

// second way to remove data
list0.remove(2)

println list0 // [Takanami, Collect, Demoq, DemoA]

// third way to remove data from list
list0 = list0 - "Demoq"

println list0 // [Takanami, Collect, DemoA]

// Counting same kind data in list

def list5 = [1,3,4,5,6,3,1,3,4]

println list5.count(3) // 3

println list5.sort() // [1, 1, 3, 3, 3, 4, 4, 5, 6]

def list6 = [5,6,4,[1,2],4,5,[3,4,5,6,6]]

println list6.flatten() // [5, 6, 4, 1, 2, 4, 5, 3, 4, 5, 6, 6]