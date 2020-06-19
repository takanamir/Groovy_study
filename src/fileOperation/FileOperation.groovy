package fileOperation

def file = new File('newFile.txt')

println file.absolutePath

println file.size()

println "File ? ${file.isFile()}"

println "Director ? ${file.isDirectory()}"

println file.renameTo('renameFile.txt')