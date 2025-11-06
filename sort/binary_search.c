#include<stdio.h>
int binary_search(int lista[],int length,int x);
void select_sort(int lista[],int length);
int main(){
    int a[] = {3, 3, 6, 6, 9, 11, 14, 16, 34, 37, 64, 65, 95};
   int len = sizeof(a)/sizeof(a[0]);
   int index=-1,num=0;
   scanf("%d",&num);
   select_sort(a,len);
   index = binary_search(a,len,num);
   if (index==-1) printf("Not found");
   else printf("a[%d]=%d",index,num);
    return 0;
}
int binary_search(int lista[],int length,int x){
    int left=0,right=length-1,middle=(left+right)/2,index=-1;
    while(left<=right){
        middle = (left+right)/2;
        if (lista[middle] == x ) {index=middle;return index;}
        else if (lista[middle] > x) {right = middle-1;continue;}
        else {left = middle+1;continue;}
    }
    return index;
}
void select_sort(int lista[],int length){
    int mini=0,i=0,t,j=0;
    for(i=0;i<length-1;i++){
        mini = i;
        for(j=i+1;j<length;j++){
            if (lista[j]<lista[mini]) mini=j;
        }
        t = lista[i];
        lista[i] = lista[mini];
        lista[mini] = t;
    }
}
