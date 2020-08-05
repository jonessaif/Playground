#include<bits/stdc++.h>
using namespace std;
struct mp{
  int f = 0;
  int s = 0;
};

int main()
{
  int n;
  cin>>n;
  vector<struct mp> v(n);
  for(int i = 0; i < n; i++) cin>>v[i].f;
  for(int i = 0; i < n; i++) cin>>v[i].s;
  int k;

  cin>>k;
  int min = INT_MAX;
  int diff = 0,res = 0;
  int temp;
  for(int i = 0; i < n; i++) {
    int pro = v[i].f*v[i].s;
    res += pro;
    if(pro < 0 ^ v[i].f < 0) {
      temp = (v[i].f - 2 * k) * v[i].s;
    } else {
      temp = (v[i].f + 2 * k) * v[i].s;
    
    }
    int d = abs(pro - temp);
    if(d > diff) diff = d;
  }
  cout<<res-diff;
  //Type your code here
  return 0;
}