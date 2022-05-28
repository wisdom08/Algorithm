const finalValueAfterOperations = (operations) => {
    let val = 0;
    for (const operation of operations) {
        operation.includes('+') ? val++ : val--;
    }
    return val;
}


console.log(finalValueAfterOperations(["--X","X++","X++"]))