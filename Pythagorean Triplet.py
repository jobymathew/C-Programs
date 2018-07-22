T=int(input())
f=0
for i in range(T):
    n=int(input())
    a=list(map(int, input().strip().split()))
    for j in range(n-2):
        for k in range (j+1,n-1):
            for l in range (k+1,n):
                if(a[j]*a[j]+a[k]*a[k] == a[l]*a[l]):
                    f=1
                    break
    if(f==1):
        print ("Yes")
    else:
        print ("No")
