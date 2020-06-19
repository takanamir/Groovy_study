package fileOperation

def file = new File('newFile.txt')

//println file.readLines()

file.readLines().each {
	line -> println line
}