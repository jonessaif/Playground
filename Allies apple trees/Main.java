#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here
  long long n;
  cin>>n;
  if(n == 0) {
    cout<<0;
    return 0;
  }
  long long i = 1,sum = 12;
  while(sum < n) {
    for(long long a = 0;a <= i;a++) sum += 8*(a+i);
    sum -= (8*i);
    sum -=(2*i);
    i++;
  }
  long long  res = 8*i;
  cout<<res;
  return 0;
}