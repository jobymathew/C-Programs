#include<stdio.h>
int main()
{
	int T,n,a[1000],i,j,k,c1=0,c2=0,ar1[1000],ar2[1000],t;
	scanf("%d",&T);
	for(i=0;i<T;i++){
	    scanf("%d",&n);
	    for(j=0;j<n;j++){
	        scanf("%d",&a[j]);
	    }
	    for(j=0;j<n;j++){
	        if(a[j]%2==0){
	            ar1[c1]=a[j];
	            c1++;
	        }
	        else{
	            ar2[c2]=a[j];
	            c2++;
	        }
	    }
	    for(j=0;j<c1;j++){
	        for(k=j+1;k<c1;k++){
	            if(ar1[j]>ar1[k]){
	                t=ar1[j];
	                ar1[j]=ar1[k];
	                ar1[k]=t;
	            }
	        }
	    }
	        for(j=0;j<c2;j++){
	        for(k=j+1;k<c2;k++){
	            if(ar2[j]<ar2[k]){
	                t=ar2[j];
	                ar2[j]=ar2[k];
	                ar2[k]=t;
	            }
	        }
	    }
	  
	    for(j=0;j<c2;j++){
	        printf("%d ",ar2[j]);
	    }
	     for(j=0;j<c1;j++){
	        printf("%d ",ar1[j]);
	    }
	    printf("\n");
	    c1=0;
	  c2=0;
	}
	return 0;
}
