### 회고 

```javascript
let res = [];

for (i = 0; i < n; i++) {
    res.push(nums[i],nums[i+n]);
}
```
- 와..!! 왜 index 에 i+n 넣어주는 걸 생각 못했을까? 신기하다.