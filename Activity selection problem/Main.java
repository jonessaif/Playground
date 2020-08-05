#include<bits/stdc++.h>
using namespace std;
struct item {
	int s;
  	int e;
  	int a;
};
static bool myc(struct item a, struct item b) {
 return a.e < b.e;
}
int main()
{
  int n;
  cin>>n;
  vector<struct item> v(n);
  for(int i = 0; i < n; i++) cin>>v[i].s;
  for(int i = 0; i < n; i++)  {
    cin>>v[i].e;
    v[i].a = i;
  }
  sort(v.begin(),v.end(),myc);
  int prev = v[0].e;
  cout<<v[0].a<<" ";
  for(int i = 1; i < n; i++) {
    if(v[i].s >= prev) {
      prev = v[i].e;
      cout<<v[i].a<<" ";
    }
  }
  //Type your code here
  return 0;
}