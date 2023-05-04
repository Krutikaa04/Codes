fr = open("FileHandling.txt", 'r')  #opens the file to read

print(fr)

print(fr.read())

#output --> "<_io.TextIOWrapper name='FileHandling.txt' mode='r' encoding='cp1252'>""



fw = open("FileHandling.txt", 'w')   #opens the file to write

fw.write("Welcome to the FileHandling file of Python. You can write anything here.")



fa = open("FileHandling.txt", 'a')       #opens the file to append 

fa.write("\nThis is the appended section done through append function.")