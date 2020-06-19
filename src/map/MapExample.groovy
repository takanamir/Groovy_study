package map

// Empty Map
def mapVariable = [:]

// adding value
mapVariable.put('Color', 'Red')

println mapVariable.size()       // 1

mapVariable['Size'] = '5'

println mapVariable.size()       // 2

// Property method to add any key to value pair

mapVariable.length = '40'

println mapVariable.size()       // 3

mapVariable << ['width': "34"]

println mapVariable.size()       // 4

println mapVariable['width']     // 34
println mapVariable.width        // 34

println mapVariable.get('width') // 34