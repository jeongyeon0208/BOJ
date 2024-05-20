n = int(input())

arr = list(map(int, input().split()))

arr.sort()

ans = 0

for i in range(n):
    for k in range(i+1):
        ans += arr[k]

print(ans)