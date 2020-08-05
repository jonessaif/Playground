#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here
  int n;
  cin>>n;
  vector<int> d{1000,500,100,50,20,10,5,2,1};
  for(int a:d) {
    while(n >= a) {
      cout<<a<<"  ";
      n = n - a;
    }
  }
  return 0;
}