const maximumWealth = (accounts) => {
    let max = 0;
    for (const account of accounts) {
        let sum = account.reduce((a, c) => a + c);
        max < sum ? max = sum : max;
    }
    return max;
}

console.log(maximumWealth([[2, 8, 7], [7, 1, 3], [1, 9, 5]]));