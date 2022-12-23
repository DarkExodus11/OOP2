#include <stdio.h>
#include <conio.h>

int main(){
    // DECLARATION
    int length;
    printf("Input the number of elements to be stored in the array:");
    scanf("%d",&length);
    int i,j,tmp,count=0;
    int arr[length];
    int ext[length],index=0;
    int frq[length],findex=0,fcount=1;
    // USER INPUT
    printf("Enter %d elements:\n",length);
    for(i=0;i<length;i++){
        scanf("%d",&arr[i]);
    }
    // SORTING
    for(i=0;i<length;i++){
        for(j=i+1;j<length;j++){
            if(arr[i]>arr[j]){
                tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
    }
    // TRACING FREQUENCY FOR EACH ELEMENT
    for(i=0;i<length;i++){
        frq[findex]=1;
        if(arr[i]==arr[i+1] && (i+1) < length){
            fcount=0;
            while(arr[i]==arr[i+1]){
                i++;
                fcount++;
            }
            frq[findex++]+=fcount;
        }else{
            findex++;
        }  
        ext[index++]=arr[i];
        count++;
    }
    // OUTPUTING RESULT
    for(i=0;i<count;i++){
        printf("\n%d occurs %d times\n",ext[i],frq[i]);
    }
    getch();
    return 0;
}