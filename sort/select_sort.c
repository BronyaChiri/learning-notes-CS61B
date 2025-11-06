#include<stdio.h>
void select_sort(int lista[],int length);
void print(int lista[],int length);
int main(){
   int a[] = {39, 39, 42, 20, 18, 52, 59, 15, 63, 35, 42,
    36, 67, 1, 66, 96, 76, 50, 58, 26, 23, 90, 4, 44};
   int len = sizeof(a)/sizeof(a[0]);
   select_sort(a,len);
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