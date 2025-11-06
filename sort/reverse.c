#include<stdio.h>
void print(int lista[],int length);
void reverse(int lista[],int length);
int main(){
    int a[] = {39, 39, 42, 20, 18, 52, 59, 15, 63, 35, 42,
    36, 67, 1, 66, 96, 76, 50, 58, 26, 23, 90, 4, 44};
   int len = sizeof(a)/sizeof(a[0]);
   reverse(a,len);
   print(a,len);
    return 0;
}
void print(int lista[],int length){
    int i=0;
    printf("{");
    for (i=0;i<length;i++){
        printf("%d ",lista[i]);
    }
    printf("}");
}
void reverse(int lista[],int length){
    int left=0 , right=length-1 , t;
    while(left<right){
        t = lista[left];
        lista[left] = lista[right];
        lista[right] = t;
        left++;
        right--;
    }
}