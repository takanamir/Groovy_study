package fileOperation

def file = new File('newFile.txt')

file.readLines().each {
	line -> line.tokenize().each {
				word -> println word
			}
}