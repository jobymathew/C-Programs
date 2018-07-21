#include<stdio.h>
int main()
{
	int T,i,j,a[100],n[100],d,ar[100],l=0,c=0,k,s;
	scanf("%d",&T);
	for(i=0;i<T;i++){
	    scanf("%d",&n[i]);
	    scanf("%d",&d);
	    for(j=0;j<n[i];j++){
	        scanf("%d",&a[j]);
	    }
	    
	    k=n[i]-d+1;
	    for(j=0;j<k;j++){
	        s=a[j];
	        for(l=j+1;l<d+j;l++){
	            if(s<a[l]){
	                s=a[l];
	            }
	        }
		printf("%d ",s);
	    }
	    printf("\n");c=0;
	}
	return 0;
}
