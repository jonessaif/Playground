#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int n = s.size();
  int dp[n][n];
  for(int l = 0; l < n;l++) {
    for(int j = 0; j+l < n;j++) {
      if(l == 0) 
        dp[j][j] = 1;
      else if(s[j] == s[l+j]) 
        dp[j][l+j] = max({dp[j+1][l+j],dp[j][l+j-1],2+dp[j+1][l+j-1]});
      else dp[j][l+j] = max(dp[j+1][l+j],dp[j][l+j-1]);
    }
  }
  string res;
  stack<char> st;
  int i = 0,j = n-1;
  while(dp[i][j] != 1) {
    if(s[i] != s[j]) {
      if(dp[i+1][j] == dp[i][j]) i += 1;
      else j -= 1;
    } else {
      res += s[i];
      st.push(s[i]);
      i = i+1;
      j = j-1;
    }
  }
  
  res += s[j];
  while(!st.empty()) {
    res += st.top();
    st.pop();
  }
  cout<<res;
    //Type your code here
  return 0;
}