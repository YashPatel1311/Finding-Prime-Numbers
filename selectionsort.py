def selectionsort(arr):
    for i in range(0,len(arr)-1):
        index = i
        for j in range(i+1,len(arr)):
            if arr[j] < arr[index]:
                index=j
        arr[i],arr[index]=arr[index],arr[i] 
  
for i in range(1,6):

   f = open("File{}.txt".format(i),"r")
   import time
   lst=[]
   for l in f.readlines():
       lst.append(int(l))
   s=time.time()
   selectionsort(lst)
   t=time.time()
   print((t-s)*1000)
