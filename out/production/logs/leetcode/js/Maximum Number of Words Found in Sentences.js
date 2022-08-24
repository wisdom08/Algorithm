const mostWordsFound = (sentences) => {
    let max = 0;
    sentences.filter(v => {
        let sum = v.split(" ").length;
        max < sum ? max = sum : max;
    })
    return max;
}

console.log(mostWordsFound(["alice and bob love leetcode", "i think so too", "this is great thanks very much"]));