#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  vector<char> a(n);
  vector<bool> v(n);
  int res = 0;
  for(int i = 0; i < n; i++)  cin>>a[i];
  int k;
  cin>>k;
  for(int i = 0; i < n; i++) {
    if(a[i] == 'P') {
      for(int j = i - k ; j <= i + k; j++) {
        if(j >= 0 and j < n and a[j] == 'T' and !v[j]) {
          v[j] = true;
          res++;
          break;
        }
      }
  	}
  }
  cout<<"Maximum thieves caught: "<<res;
    
  //Type your code here
  return 0;
}