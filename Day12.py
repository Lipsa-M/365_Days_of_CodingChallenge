import functools

#initializing the list
lis=[1,22,18,15,11]

#using reduce function compute sum of list
print("The sum of list is :", end="")
print(functools.reduce(lambda a,b: a+b,lis))

#using reduce function to compute maximum element from list
print("The maximum of the list is :", end="")
print(functools.reduce(lambda a,b:a if a>b else b,lis))
