T=int(input())
for i in range (T):
    n=int(input())
    ar = []
    f=0
    c=0
    for j in range (1,n+1):
        k=0
        for i in range(2,j//2+1):
            if(j%i==0):
                k=k+1
        if(k<=0):
            ar.append(j)
    for j in range (1,len(ar)-2):
        for k in range (j+1,len(ar)-1):
            for l in range (k+1,len(ar)):
                if ar[j]+ar[k] == ar[l]:
                    c += 1
    print(c)
