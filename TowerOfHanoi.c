#include<stdio.h>
void tower(int,char,char,char);
int main(){
    int n;
    printf("Enter the size of the tower : ");
    scanf("%d",&n);
    printf("\n");
    tower(n,'A','B','C');
    return 0;
}
void tower(int n, char beg, char aux, char end){
    if(n==1){
        printf("Move from %c to %c\n",beg,end);
    }
    else{
        tower(n-1,beg,end,aux);
        tower(1,beg,aux,end);
        tower(n-1,aux,beg,end);
    }
}
