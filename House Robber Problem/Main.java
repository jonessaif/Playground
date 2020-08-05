#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i = 0; i < n; i++) cin>>a[i];
  int t[n],s[n];
  t[0] = a[0];
  s[0] = 0;
  for(int i = 1; i < n;i++) {
    t[i] = a[i]+s[i-1];
    s[i] = max(t[i-1],s[i-1]);
  }
  cout<<max(t[n-1],s[n-1]);
  return 0;
  //Type your code here
}