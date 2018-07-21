#include<stdio.h>
int main()
{
	int T,n,i,j,a[1000],c=0,k,f=0;
	scanf("%d",&T);
	for(i=0;i<T;i++){
	    scanf("%d",&n);
	    for(j=0;j<n;j++){
	        scanf("%d",&a[j]);
	    }
	    k=0;
	    for(j=0;j<n-1;j++){
	       // if(j+1!=n-1){
	        if(a[j+1]<a[j]){
	            
	            if(j-k>0){
	                f=1;
	           printf("(%d %d) ",k,j);
	            }
		   k=j+1;
	        }}
	       // }else{
	            if(a[k]<a[n-1]){
	                printf("(%d %d) ",k,j);
	            }
	        
	    
	        if(f==0){
	            printf("No Profit");
	        }   
	printf("\n");
	}
	return 0;
}
