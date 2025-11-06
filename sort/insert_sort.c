#include<stdio.h>
void insert_sort(int lista[],int length);
void print(int lista[],int length);
int main(){
    int a[] = {39, 39, 42, 20, 18, 52, 59, 15, 63, 35, 42,
    36, 67, 1, 66, 96, 76, 50, 58, 26, 23, 90, 4, 44};
   int len = sizeof(a)/sizeof(a[0]);
   insert_sort(a,len);
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
void insert_sort(int lista[],int length){
    int i=0,j=0,t=0,point=0;
    for(i=1;i<length;i++){
        if (lista[i]>lista[i-1]) continue;
        for(j=0;j<i;j++){
            if (lista[j]>lista[i]) {point = j;break;}
        }
        t = lista[i];
        for(j=i;j>point;j--){
            lista[j] = lista[j-1];
        }
        lista[point] = t;
    }
}