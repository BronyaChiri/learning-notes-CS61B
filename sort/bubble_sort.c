#include<stdio.h>
int main(){
    int list[] = {39, 39, 42, 20, 18, 52, 59, 15, 63, 35, 42, 36, 
        67, 1, 66, 96, 76, 50, 58, 26, 23, 90, 4, 44};
      
        int i=1,j=0,t=0;
        int len=0;
        len = sizeof(list)/sizeof(list[0]);
        for (i=1;i<len;i++){
            for (j=0;j<len-i;j++) {
                if (list[j] > list[j+1]) {t=list[j];list[j]=list[j+1];list[j+1]=t;}
            }
        }
        for (i=0;i<len;i++){printf("%d ",list[i]);}
    
    return 0;
}