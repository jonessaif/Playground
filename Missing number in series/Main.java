#include<iostream>
using namespace std;

int main()
{
  int n;
  cin>>n;
  int a[n];
  int sum[n];
  int p = 0;
  for(int i = 0; i < n; i++)  {
    cin>>a[i];
    sum[i] = p+a[i];
    p = sum[i];
  }
  int d = min(a[1]-a[0],a[2]-a[1]);
  int s = 0, e = n-1,m;
  while(s <= e) {
    m = s + (e-s)/2;
    if(sum[m] == ((m+1)*(2*a[0] + m*d)/2))  s = m+1;
    else e = m-1;
  }
  cout<<a[s]-d;                 
  //Type your code here
  return 0;
}