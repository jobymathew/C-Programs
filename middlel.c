#include<stdio.h>
#include<stdlib.h>
typedef struct node{
    int data;
    struct node * link;
} node;
int main(){
    node * head=NULL;
    head=malloc(sizeof(node));
    printf("Create a linked List\n");
    printf("Add value\n");
    node * new=head;
    int tm,f=0;
    do{
        scanf("%d",&tm);
        new->data=tm;
        new->link=malloc(sizeof(node));
        new=new->link;
        printf("Do you want to continue? 1/0\n");
        scanf("%d",&f);
    }while(f!=0);
    new->link=NULL;
    node * n1=head;
    node * n2=head;
    new=head;
    int l=0;    
    while(new->link!=NULL)
    {
        tm=new->data;
        printf("Data in nodes is %d\n",tm);
        new=new->link;
    }
    while(n2->link!=NULL){
        n2=n2->link;
        l++;
        if(l%2==0){
        n1=n1->link;}
    }
     printf("The length is %d\n",l);
     tm=n1->data;
     printf("The middle element is %d\n",tm);
    return(0);
}