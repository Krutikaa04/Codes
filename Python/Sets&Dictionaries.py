# Set is an unordered collection datatypes, which is iterable, unchangeable, unindexable and doesnot have duplicate values. Set is based on data structure hash table

setVar = set()
print(type(setVar))


setVar = {1, 2, 3, 4, 5}
print(setVar)        #print elements in a set

for i in setVar:     #print elements of set one on each line
    print(i)


setVar.add(6)       #to add element in set
print(setVar)


setVar2 = {4, 5, 6, 7, 8, 9}
setVar.intersection_update(setVar2)       #to perform intersection between two sets
print(setVar)

setVar.intersection(setVar2)        #method 2 of intersection
print(setVar)

set3 = setVar.union(setVar2)        #union of two sets
print(set3)

#perform similarly for difference, symmetric difference etc..




# Dictionary in Python is a datastructure with Key-value pairs. Dictionaries are changeable, ordered and do not allow duplicates

dictVar = {
    "name": "Diksha",
    "stream": "Science",
    "age": 20
}
print(dictVar)


print(dictVar["name"])      #print only one key value 
x = dictVar.get("name")     #method 2 
print(x)


print(dictVar.keys())      #print keys


dictVar["age"] = 19
print(dictVar)
dictVar.update({"age": 18})          #only age has been updated
print(dictVar)


dictVar.update({"hobby":"travelling"})          # add items
dictVar.pop("stream")                  #Remove items
for x, y in dictVar.items():
  print(x, y)


for x in dictVar.values():            #only print values one on each line
  print(x)
