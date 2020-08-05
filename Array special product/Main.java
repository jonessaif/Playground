#include<bits/stdc++.h>
using namespace std;

int main()
{
  int n ; 
  cin>>n;
  vector<int> a(n);
  for(int i = 0; i < n; i++) cin>>a[i];
  int prod = accumulate(a.begin(),a.end(),1,multiplies<int>());
 
  for(int j = 0; j < n; j++) {
    int divisor = a[j],temp = 0,quotient = 0;
    for (int i = 7; i >= 0; --i) { 
      if (temp + (divisor << i) <= prod) { 
        temp += divisor << i; 
        quotient |= 1 << i; 
      } 
  	}
    a[j] = quotient;
  }
  for(int i = 0; i < n; i++) cout<<a[i]<<"\n";
  //Type your code here
  return 0;
}