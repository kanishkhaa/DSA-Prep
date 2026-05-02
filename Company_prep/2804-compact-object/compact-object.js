/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if(Array.isArray(obj)) {
        const res = [];
        for(let item of obj) {
            if(item) {
                const compacted  = compactObject(item);
                res.push(compacted);
            }
        }
        return res;
    }
    else if(typeof obj === "object" && obj != null) {
        const res = {};
        for(let key in obj) {
            if(obj[key]) {
                const compacted = compactObject(obj[key]);
                res[key] = compacted;
            }
        }
        return res;
    }
    return obj;
};