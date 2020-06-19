// import ScriptVsClass.ConvertingSample

class ConvertingSample {
	def name

	def success() {
		return "Hello ${name}"
	}

	static void main(String[] args) {
		def cs = new ConvertingSample()
		cs.setName("Java to Groovy")
		println(cs.success())
	}
}