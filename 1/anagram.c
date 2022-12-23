#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
#define length 3
int anagram(char*,char*);
int main(){
    int i;
    int r;
    char s[length][10];
    char in[10];
    time_t t;
    srand(time(&t));
    r=rand()%length;  
    printf("Enter %d strings:\n",length);
    for(i=0;i<length;i++){
        scanf("%s",s[i]);
    }

    printf("Enter string to check for anagram with string\'%s\':\n",s[r]);
    scanf("%s",&in);
    if(anagram(strupr(s[r]),strupr(in))){
        printf("YES");
    }else{
        printf("NO");
    }
    getch();
    return 0;
}

int anagram(char *s1,char *s2){
    if(strlen(s1)!=strlen(s2)){
        return 0;
    }
    int arr1[26]={0};
    int arr2[26]={0};
    int i=0;
    while(s1[i]!='\0'){
        arr1[s1[i]-'A']++;
        i++;
    }
    i=0;
    while(s2[i]!='\0'){
        arr2[s2[i]-'A']++;
        i++;
    }
    for(i=0;i<26;i++){
        if(arr1[i]!=arr2[i]){
            return 0;
        }
    }
    return 1;
}