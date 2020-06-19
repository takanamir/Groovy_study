package fileOperation

def file = new File('targetFile.txt')

file.write("First Line String\n")

file << "Second Line of String added in File\n"

file << "Third Line of String added in File\n"