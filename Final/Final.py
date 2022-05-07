#Q1
class Solution:
    def isValid(self, s: str) -> bool:
        while '{}' in s or '()' in s or '[]' in s:
            s = s.replace('{}', '')
            s = s.replace('[]', '')
            s = s.replace('()', '')
        return s == ''


#Q2
class Solution:
    def compress(self, res):
        if len(res) == 0:
            return res
        ans = []
        count = 1
        last = res[0]
        for c in res[1:]:
            if c == last:
                count += 1
            else:
                ans.append(last)
                ans.append("%s" % count)
                last = c
                count = 1

        ans.append(last)
        ans.append("%s" % count)

        if len(ans) < len(res):
            return ''.join(ans)
        else:
            return res


#Q3
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        a = []
        res = 0
        for i in s:
            if i in a:
                a = a[a.index(i)+1:]
            a.append(i)
            res = res if len(a) < res else len(a)
        return res


#Q4
class Solution:
    def sumZero(self, n: int) -> List[int]:
        res = []
        if n%2 == 1:
            res.append(0)
        for i in range(1, n//2+1):
            res.append(i)
            res.append(-i)
        return res


#Q5
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        l = len(nums)
        for i in range(k):
            for j in range(i+1, l):
                if nums[i] <= nums[j]:
                    nums[i], nums[j] = nums[j], nums[i]
        return nums[k-1]



