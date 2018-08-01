#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
struct node {
    int val;
    struct node* right;
    struct node* left;
};
void eachlevel(struct node* root, int level, int ltr);
int height(struct node* node);
struct node* newNode(int data);

void spiral(struct node* root) {
    int h = height(root);
    int i;
    bool ltr=false;
    for(i=1;i<=h;i++){
        eachlevel(root,i,ltr);
        ltr= !ltr;
    }
}
void eachlevel(struct node* tree, int level, int ltr){
    if(tree==NULL){
        return;
    }
    if(level==1){
        printf("%d ",tree->val);
    }
    else if(level > 1){
        if(ltr){
            eachlevel(tree->left,level-1,ltr);
            eachlevel(tree->right,level-1,ltr);
        }else{
            eachlevel(tree->right,level-1,ltr);
            eachlevel(tree->left,level-1,ltr);
        }
    }
}
int height(struct node* root){
    if(root==NULL){
        return 0;
    }
    else{
        int lh=height(root->left);
        int rh=height(root->right);
        if(lh>rh){
            return(lh+1);
        }else{
            return(rh+1);
        }
    }
}
struct node* newNode(int data){
    struct node* node = (struct node*)
                        malloc(sizeof(struct node));
    node->val=data;
    node->left=NULL;
    node->right=NULL;  
    return(node);  
}


int main()
{
    struct node* root=newNode(1);
    root->left=newNode(2);
    root->right=newNode(3);
    root->right->right=newNode(4);
    root->right->left=newNode(5);
    root->left->right=newNode(6);
    root->left->left=newNode(7);
    printf("Spiral is \n");
    spiral(root);
    return 0;
}
