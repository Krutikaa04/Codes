str1 = "python"

print(str1)
print(str1.capitalize())
print(str1.lower())
print(str1.startswith("p"))
print(str1.endswith("n"))
print(str1.endswith("o"))
print(str1.isdigit())

#Lists in Python
print(type([]))     # output --> list
lst1 = list()
print(type(lst1))   #output --> list


lst = ["English", "Mathematics", "Physics", "Chemistry"]


lst.append("Botany")    #to add item at the end of the  list

lst.insert(1, "Psychology")    #to insert at a specific index

print(lst)


lst.extend(["Zoology", "English", "Economics"])    #to add multiple items to existing list
print(lst)


print(lst[5])        #print the item at the given index


print(lst[2:7])       #range from one index to another


print(lst.pop())            #removes the top element like stack


print(lst.count("English"))      #gives count of specifed item

