/**
 * @param {string[]} operations
 * @return {number}
 */
var calPoints = function(operations) {
    let record = [];
    let sum = 0;
    for(let i=0;i<operations.length;i++){
        if(operations[i]==='C'){
            record.pop();
        }else if(operations[i]==='D'){
            record.push(record[record.length-1]*2);
        }else if(operations[i]==='+'){
            record.push(record[record.length-1]+record[record.length-2]);
        }else{
            record.push(parseInt(operations[i]));
        }
    }
    for(let i=0;i<record.length;i++){
        sum+=record[i];
    }
    return sum;
    
};