#include<stdio.h>
#include<stdlib.h>

typedef struct Node {
    int value;
    struct Node* link;
} Node;

void print_node(Node * );

int main() {

    Node* head = NULL;
    head=malloc(sizeof(Node));
    if (head==NULL) {
       return 0;
    }
    printf("Insert the number of nodes :\n");
    int N;
    scanf("%d",&N);
    int i;
    Node * Node_c=head;
    for (i=0;i<N;i++) {
        if (i<N-1) {
            int temp;
            printf("Insert value stored into the node %d:\n",i+1);
            scanf("%d",&temp);
            Node_c->value=temp;
            Node_c->link=malloc(sizeof(Node));
            Node_c=Node_c->link;
        } else if (i=N-1) {
            int temp;
            printf("Insert value stored into the node %d:\n",i+1);
            scanf("%d",&temp);
            Node_c->value=temp;
            Node_c->link=NULL;
        }
    }
    printf("\n");
    print_node(head);
    return 0 ;
}
void print_node(Node * head) {
    Node * Node_current = head;
    int i=1;
    while (Node_current != NULL) {
        printf("Value stored into node %d:  %d\n",i,Node_current->value);
        Node_current = Node_current->link;
        i++;
    }
}