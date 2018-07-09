#include<stdio.h>
#include<stdlib.h>
typedef struct node {
        int data;
        struct node* link;
    } node;
    void reverse(struct node *);
int main(){
    node* head=NULL;
    head=malloc(sizeof(node));
    if(head==NULL){
        exit(0);
    }
    printf("Enter the number of nodes");
    int n,tm,i;
    scanf("%d",&n);
    node* new=head;
    for(i=0;i<n;i++)
    {
        scanf("%d",&tm);
        new->data=tm;
        new->link=malloc(sizeof(node));
        new=new->link;
    }
    new->link=NULL;
    new=head;
    for(i=0;i<n;i++)
    {
        tm=new->data;
        printf("Data in node %d is %d\n",(i+1),tm);
        new=new->link;
    }
    printf("Displaying in reverse\n");
    reverse(head);
    return(1);
    }
    void reverse(struct node* head){
        if(head->link!=NULL){
            reverse(head->link);
        printf("%d\t",head->data);}
}