#include<stdio.h>
int main()
{
    int T,n[500],a[500],i,j,k,c=0,d,l;
    scanf("%d",&T);
    for(i=0;i<T;i++){
        scanf("%d",&n[i]);
        for(j=0;j<n[i];j++){
            scanf("%d",&a[j]);
        }
        scanf("%d",&d);
        k=d;
        for(j=0;j<n[i];j=j+d){
            if((j+d)<n[i]){
                for(l=k-1;l>=j;l--){
                    printf("%d ",a[l]);
                }
            }else{
                for(l=n[i]-1;l>j-1;l--){
                    printf("%d ",a[l]);
                }
            }
        k=k+d;
        printf("\n");
        }
        for(l=0;l<n[i];l++){
            a[l]=0;
        }
    }
	return 0;
}
