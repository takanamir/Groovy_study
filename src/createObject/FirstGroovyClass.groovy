package createObject

class FirstGroovyClass {
	// fields or properties
	String name
	String place

	FirstGroovyClass() {
		println "We are working on default constructor"
	}

	FirstGroovyClass(name, place) {
		this.name = name
		this.place = place
	}

	def methodOne() {
		println "Print Value of name: " + "Print Value of place: " + place
	}
}