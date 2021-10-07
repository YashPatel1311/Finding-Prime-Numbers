#include <bits/stdc++.h>
using namespace std;

int binarySearch(int arr[], int val, int start, int end)
{
    while (start <= end)
    {
        int mid = start + ((end - start) / 2);

        if (arr[mid] == val)
            return mid + 1;

        else if (arr[mid] < val)
            start = mid + 1;

        else
            end = mid - 1;
    }

    return -1;
}

int main()
{

    int n;
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];

        if (i != 0 && arr[i] <= arr[i - 1])
        {
            cout << "Numbers are not in ascending order\n";
            exit(0);
        }
    }

    int m;
    cin >> m;

    while (m--)
    {
        int num;
        cin >> num;
        cout << binarySearch(arr, num, 0, n - 1) << " ";
    }

    return 0;
}
