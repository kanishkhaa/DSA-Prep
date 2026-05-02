/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    const res = [];
    function helper(current, depth){
        for (let item of current) {
            if(Array.isArray(item) && depth < n) {
                helper(item, depth+1);
            } else {
                res.push(item);
            }
        }
    }
    helper(arr,0);
    return res;
};