#include<bits/stdc++.h>
using namespace std;

int main()
{
  int n,k;
  cin>>n>>k;
  vector<int> a(n);
  for(int i = 0; i < n;i++) a[i] = i;
  int it = 0;
  while(a.size() > 1) {
    int i = 0;
    while(i < k) {
      it++;
      if(it == a.size()) it = 0;
      i++;
    }
    a.erase(a.begin()+it);
    it--;
  }
  cout<<a[0];
  
  
  //Type your code here
  return 0;
}