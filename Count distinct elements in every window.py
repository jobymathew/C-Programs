{
if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n,k = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        countDistinct(arr, n, k)
# Contributed by: Harshit Sidhwa
}


def countDistinct(arr, n, k):
    for i in range(n-k+1):
        print(len(set(arr[i: i+k])),end=' ')
        print("")
