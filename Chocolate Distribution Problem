#include<stdio.h>
int main()
{
	int T,n,a[1000],d,i,j,k,t,l,c=0,m=0,no,p;
	scanf("%d",&T);
	for(i=0;i<T;i++){
	    scanf("%d",&n);
	    for(j=0;j<n;j++){
	        scanf("%d",&a[j]);
	    }
	    scanf("%d",&d);
	    for(j=0;j<n;j++){
	        for(k=j+1;k<n;k++){
	        if(a[j]>a[k]){
	            t=a[j];
	            a[j]=a[k];
	            a[k]=t;
	        }
	    }
	    }
	    if((d-1)!=0){
	    t=a[d-1]-a[0];
	    no=d;
	    for(j=1;j<n-d+1;j++){
	        p=a[j+d-1]-a[j];
	        if(p<t){
	            t=p;
	            m=j;
	            no=j+d;
	        }
	    }
	    }else{
	        t=0;
	    }
	    
	    printf("%d \n",t);
	}
	return 0;
}
