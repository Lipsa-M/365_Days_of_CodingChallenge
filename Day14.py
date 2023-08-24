def nearly_equal(str1,str2):
    i=0
    count = 0
    if len(str1)==len(str2):
        while i==len(str1):
            if str1[i]==str2[i]:
                i+=1
            else:
                count+=1
                i+=1
              
           
    else :
        print("enter the same length of string ")
    if count<=1:
        print("it is nearly equal")

str1 = input("enter the first string ")
str2 = input("enter the second string ")
nearly_equal(str1,str2)
