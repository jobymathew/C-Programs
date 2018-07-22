t=int(input())
for i in range(t):
    n=int(input())
    a=list(map(int,input().rstrip().split()))
    if a==sorted(a):
        print(max(a),1)
    elif a==sorted(a,reverse=True):
        print(max(a),2)
    else:
        mi=min(a)
        i_mi=a.index(mi)
        if i_mi == 0:
            left=a[n-1]
            right=a[i_mi+1]
        elif i_mi == n-1:
            left = a[i_mi-1]
            right=0
        else:
            left=a[i_mi-1]
            right=a[i_mi+1]
        if left<right:
            print(max(a),3)
        elif right<left:
            print(max(a),4)
