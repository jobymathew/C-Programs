#include<stdio.h>
#include<stdlib.h>
int main(){
    typedef struct node {
        int data;
        struct node* next; 
    } 
    node* head;
    node* create(int data, node* next){
        node* new_node=(node*)malloc(sizeof(node));
        if(new_node==null){
            printf("Error creating a new node");
            exit(0);
        }  
        new_node->data=data;
        new_node->next=next;
        }
    node* prepend(node* head, int data){
        node* new_node=create(data,head);
        head=new_node;
    }
    int n;
    node* nnode;
    scanf("%d",&n);
    int i=0,temp;
    node* link;
    for(i=0;i<n-1;i++){
        scanf("%d",&temp);
        nnode=create(temp,link);
        nnode=nnode->link;
    }
    nnode->link=NULL;
    nnode=head;
    for(i=0;i<n-1;i++){
        if(nnode->link!=NULL){
        printf("%d",&temp);
        nnode=nnode->link;}
    }
return(0);
}   