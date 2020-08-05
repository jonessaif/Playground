#include<bits/stdc++.h>
using namespace std;
int main()
{
  set<int> s;
  while(1) {
  	int t;
    cin>>t;
    if(t < 0) break;
    int n = s.size();
    s.insert(t);
    if(n != s.size()) cout<<t<<"\n";
  }
  if(s.size() == 0) cout<<"List is empty";
  return 0;
  //Type your code here
}