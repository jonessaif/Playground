#include<bits/stdc++.h>
using namespace std;
set<string> t;
void permute(string s,int l,int r) {
  if(l == r) {
    t.insert(s);
  }
  for (int i=l; i<=r; i++) {
            swap(s[l], s[i]);
            permute(s, l+1, r);
            swap(s[l], s[i]);
  }
}
int main()
{
  //Type your code here
  string s;
  cin>>s;
  sort(s.begin(),s.end());
  permute(s,0,s.size()-1);
  for(auto it = t.begin();it != t.end();++it) cout<<*it<<"\n";
  return 0;
}