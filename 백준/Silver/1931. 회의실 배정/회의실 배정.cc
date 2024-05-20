#include<iostream>
#include<algorithm>
using namespace std;

struct meeting
{
	int start, end = 0;
}arr[100001];

bool cmp(const meeting& x, const meeting& y)
{
	if (x.end == y.end) return x.start < y.start;
	else return x.end < y.end;
}

int main()
{
	int n = 0;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i].start >> arr[i].end;
	}

	sort(arr, arr + n, cmp);

	int t = 0, ans = 0;
	for (int i = 0; i < n; i++)
	{
		if (t <= arr[i].start) ans++, t = arr[i].end;
	}

	cout << ans;

	return 0;
}