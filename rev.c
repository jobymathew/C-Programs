#include<stdio.h>
#include<stdlib.h>
typedef struct node{
    int data;
    struct node * link;
} node;
int main(){
    node * head;
    head=malloc(sizeof(node));
    printf("enter the values in linked list\n");
    int tm,f=1;
    node * n=head;
    do{
        scanf("%d",&tm);
        n->data=tm;
        n->link=malloc(sizeof(node));
        n=n->link;
        printf("Add more 1/0?\n");
        scanf("%d",&f);
    }while(f==1);
    n->link=NULL;
    n=head;
    int c=0;
    while(n->link!=NULL){
        c++;
        n=n->link;
    }
    int i=0;
    while(c!=0)
    {
        n=head;
    for(i=0;i<c-1;i++)
    {
        n=n->link;
    }
    tm=n->data;
    printf("%d\t",tm);
    n=NULL;
    c--;
    }
}