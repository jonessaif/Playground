#include<stdio.h>
#include<limits.h>
void merge(int a[],int s,int m,int l) {
  int l1 = m-s+1;
  int l2 = l-m;
  int v1[l1];
  int v2[l2];
  for(int i = 0; i < l1;i++) v1[i] = a[s+i];
  for(int i = 0; i < l2;i++) v2[i] = a[m+1+i];
  int i = 0,j = 0,k = s;
  while(i < l1 && j < l2) {
    if(v1[i] < v2[j]) {
      a[k] = v1[i];
      i++;
    } else {
      a[k] = v2[j];
      j++;
    }
    k++;
  }
  while(i < l1) {
    a[k] = v1[i];
    i++;
    k++;
  }
  while(j < l2) {
    a[k] = v2[j];
    j++;
    k++;
  }
}
void mergesort(int a[],int s,int l) {
  if (s < l) {
  int m = (s+l)/2;
  mergesort(a,s,m);
  mergesort(a,m+1,l);
  merge(a,s,m,l); 
  }
}
int main()
{
  int n;
  scanf(" %d",&n);
  int a[n];
  for(int i = 0; i < n; i++) {
    scanf(" %d",&a[i]);
  }
  printf("Before Sort:\n");
  for(int i = 0; i < n; i++) printf("%d ",a[i]);
  mergesort(a,0,n-1);
  printf("\nAfter Sort:\n");
  for(int i = 0; i < n; i++) printf("%d ",a[i]);
  //type your code
  return 0;
}