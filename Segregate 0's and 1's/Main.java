#include <bits/stdc++.h>
using namespace std;

int main() 
{
  	vector<int> a;
   	string st;
  	cin>>st;
  	for(char c:st) a.push_back(c-'0');
  	int s = 0,l = a.size()-1;
  	while(s < l) {
      while (a[s] == 1 && s < l)  s++; 
      while (a[l] == 0 && s < l)  l--;  
      if (s < l)  {  
            swap(a[s],a[l]); 
            s++;  
            l--;  
        }  
    }
    for(auto n:a) cout<<n;
   // Try out your code here
    
    return 0;
}