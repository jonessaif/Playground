#include<iostream>
using namespace std;

int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i = 0; i < n; i++) cin>>a[i];
  int k;
  cin>>k;
  int s = 0,e = n-1;
  while(s <= e) {
    int m = (e+s)/2;
    if(a[m] == k) {
      cout<<m;
      break;
    } else if(a[m] > k) e = m-1;
    else s = m+1;
  }
  if(s > e) cout<<"Not found"; 
  //Type your code here
  return 0;
}