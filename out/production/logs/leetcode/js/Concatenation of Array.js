const getConcatenation = (nums) => {
    const len = 2*nums.length;
    let arr = [];
    let j = 0;

    for (let i = 0; i < len; i++) {
        arr.push(nums[j]);
        j++;
        if(nums.length-1 === i) j = 0;
    }

    return arr;
}


console.log(getConcatenation([1,2,1]))


