#include<bits/stdc++.h>
using namespace std;

int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  bool m = true;
  int sum = 0;
  while(a) {
    int a1,b1,c1;
    a1 = a%10;
    b1 = b%10;
    c1 = c%10;
    if (m) sum = sum*10 + max({a1,b1,c1});
    else sum =sum*10 + min({a1,b1,c1});
    a /= 10;
    b /= 10;
    c /= 10;
    m = !m;
  }
  
  int n = 0;
  while(sum) {
    int r = sum%10;
    n = n*10 + r;
    sum /= 10;
  }
  cout<<n;
  //Type your code here
  return 0;
}