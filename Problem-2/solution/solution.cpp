#include<bits/stdc++.h>
using namespace std;
 
int main(){
	int n , m , k;
	cin>>n>>m>>k;
	int dsz[n];
	int asz[m];
 
	unordered_map<int,int>mp;
	for(int i = 0 ; i < n ; i++)cin>>dsz[i];
	for(int i = 0 ; i < m ; i++)cin>>asz[i];
	int count = 0;
	sort(dsz, dsz+n);
	sort(asz, asz+m);
 
	int  i = 0 , j = 0;
	while(j < n && i < m){
		if(abs(dsz[j] - asz[i]) <= k){
			count++;
			i++;
			j++;
		}
		else if(dsz[j] - asz[i] < k){
			j++;
		}
		else{
			i++;
		}
	}
 
	cout<<count;
}