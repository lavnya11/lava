def linearsearch(alist,key):
    """return index of key in alist.Return-1 if key not present.:"""
    for i in range(len(alist)):
        if alist[i]==key:
            return i
    return-1
alist=input("enter the list of number:")
alist=alist.split()
alist=[int(x) for x in alist]
key=int(input("the number to search for:"))
index=linearsearch(alist,key)
if index<0:
    print("{} was not found.".format(key))
else:
    print("{} was found at index{}.".format(key,index))
