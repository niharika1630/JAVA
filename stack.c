#include<stdio.h>
#define MAX_SIZE 5
int main(){
    int top=-1,n;
    printf("enter elements of stack:");
    scanf("%d",&n);
    top=n-1;
    if(top==-1){
        printf("stack is empty\n");

    }
    else if(top==MAX_SIZE-1){
        printf("stack is full\n");

    }
    else{
        printf("stack is not empty nor full");
    }
    return 0;

}