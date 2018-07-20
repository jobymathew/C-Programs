#include<stdio.h>
int main()
{
    int T,n[100],d,a[100],i,j;
    scanf("%d",&T);
    for(i=0;i<T;i++){
        scanf("%d",&n[i]);
        scanf("%d",&d);
        for(j=0;j<n[i];j++){
            scanf("%d",&a[j]);
        }
        for(j=d;j<n[i];j++){
            printf("%d ",a[j]);
        }for(j=0;j<d;j++){
            printf("%d ",a[j]);
        }
        printf("\n");
    }
	return 0;
}
