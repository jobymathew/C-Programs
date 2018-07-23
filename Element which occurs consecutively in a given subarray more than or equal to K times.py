n=int(input())
arr=list(map(int, input().strip().split()))
q=int(input())
c=0
f=0
for k in range (q):
    l=int(input())
    r=int(input())
    k=int(input())
    for i in range (l-1,r-1):
	    if arr[i]==arr[i+1] and i!=r-1:
   		    while arr[i]==arr[i+1]:
   		        c+=1
   		        m=arr[i]
   		        i+=1
    if c==k:
        print(m)
        f=1
    if f==0:
        print(-1)
    c=0
    f=0
