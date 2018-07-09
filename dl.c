#include<stdio.h>
#include<stdlib.h>
typedef struct node{
    int data;
    struct node* lnode;
    struct node* rnode;
} node;
int main(){
    node* head=NULL;
    head=malloc(sizeof(node));
    head->lnode=NULL;
    node* pre=head;
    printf("Enter the elements\n");
    node* n=head;
    int tm,f=1;
    do{
        scanf("%d",&tm);
        n->data=tm;
        pre=n;
        n->rnode=malloc(sizeof(node));
        n=n->rnode;
        n->lnode=pre;
        printf("Add more? 1 or 0?");
        scanf("%d",&f);
    }while(f==1);
    printf("The elements along with the left node values  are \n");
    n=head;
    node* t;
    int am;
    while(n->rnode!=NULL){
        tm=n->data;
        printf("%d\n",tm);
        n=n->rnode;
    }
}