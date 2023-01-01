## 회고 

```javascript

const finalValueAfterOperations = (operations) => operations.reduce((a, c) => {
    return c.includes("+") ? a++ : a--;
}, 0); 

```

- 처음에 reduce 를 활용해서 코드를 작성했는데 내가 원하는 결과로 나오지 않길래 reduce 사용법이 잘못 됐나? 라고 생각하고 다른 방식으로 풀었다.
- 근데 reduce 사용이 잘못된 게 아니라, **postfix operator** 을 제대로 이해하지 않고 사용하고 있었기 때문이었다.
- 위에 코드처럼 작성하게 되면 ++ 더하기와 -- 빼기 연산이 일어나기 전에 return 을 해버린다. 그래서 a의 값이 계속 초깃값을 유지하게 되는 것이었고 내가 기대했던 결과값이 나오지 않는 것이었다.

### 참고
- https://stackoverflow.com/questions/67050329/weird-function-about-array-reduce
- https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Increment#description