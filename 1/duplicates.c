#include <stdio.h>
#include <conio.h>

int main(){
    // DECLARATION
    int length;
    printf("Input the number of elements to be stored in the array:");
    scanf(" %d",&length);
    int i,j,tmp,count=0;
    int arr[length];
    int ext[length/2],index=0;
    // USER INPUT
    printf("Enter %d elements:\n",length);
    for(i=0;i<length;i++){
        scanf("%d",&arr[i]);
    }
    // SORTING ARRAY
    for(i=0;i<length;i++){
        for(j=i+1;j<length;j++){
            if(arr[i]>arr[j]){
                tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
    }
    // TRACING DUPLICATE ARRAY ELEMENTS
    for(i=0;i<length;i++){
        if(arr[i]==arr[i+1] && (i+1) < length){
            while(arr[i]==arr[i+1]){
                i++;
            }
            ext[index++]=arr[i];
            count++;
        }    
    }
    // OUTPUTING RESULT
    printf("\nTotal number of duplicate elements found in the array are: %d\nDuplicate elements:",count);
    if(count){for(i=0;i<count-1;i++){
        printf("%d,",ext[i]);
    }
    printf("%d",ext[i]);}
    getch();
    return 0;
}