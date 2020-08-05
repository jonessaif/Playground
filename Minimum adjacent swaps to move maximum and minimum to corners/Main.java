#include<bits/stdc++.h>
using namespace std;

int main()
{
  int n;
  scanf(" %d",&n);
  int a[n];
  int maxat = 0,amax = INT_MIN,minat = 0,a_min = INT_MAX;
  for(int i = 0; i < n; i++) {
    scanf(" %d",&a[i]);
    if(a[i] > amax) {
      amax = a[i];
      maxat = i;
    }
    if(a[i] < a_min) {
      a_min = a[i];
      minat = i;
    }
  }
  int res = maxat + n - minat-1;
  if(maxat > minat) res--;
  cout<<res;
  return 0;
}