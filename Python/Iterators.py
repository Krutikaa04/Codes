#In Python, an iterator is an object that allows you to iterate over collections of data, such as lists, tuples, dictionaries, and sets. 
#Python iterators implement the iterator design pattern, which allows you to traverse a container and access its elements.

arr =  [1, 2, 3, 4, 5]
for i in arr:        #here i is the iterator
    print(i)


#single element will be printed one by one
a = iter(arr)           #here a is the iterator
print(a.__next__())    #output --> 1 

print(a.__next__())    #output --> 2   ....and so on


#example of iterators in printing numbers from 1 to 10
class Numbers:

    def __init__(self) :
        self.num = 1

    def __iter__(self):
        return self
    
    def __next__(self):
        if(self.num<=10):
            val = self.num
            self.num+=1
            return val
        else : 
            raise StopIteration
        
values = Numbers()

print(values.__next__())

for i in values:
    print(i)