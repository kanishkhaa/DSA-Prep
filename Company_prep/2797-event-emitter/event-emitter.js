class EventEmitter {
    constructor() {
        this.events = {};
    }
    /**
     * @param {string} eventName
     * @param {Function} callback
     * @return {Object}
     */
    subscribe(eventName, callback) {  
        if(!this.events[eventName]) {
            this.events[eventName] = [];
        } 
        this.events[eventName].push(callback);
        const index = this.events[eventName].length-1;
        return {
            unsubscribe: () => {
                this.events[eventName][index] = null;
            }
        };
    }
    
    /**
     * @param {string} eventName
     * @param {Array} args
     * @return {Array}
     */
    emit(eventName, args = []) {
        if(!this.events[eventName]) return[];
        const res = [];
        for(let cb of this.events[eventName]) {
            if(cb!== null) {
                res.push(cb(...args));
            }
        }
        return res;
    }
}

/**
 * const emitter = new EventEmitter();
 *
 * // Subscribe to the onClick event with onClickCallback
 * function onClickCallback() { return 99 }
 * const sub = emitter.subscribe('onClick', onClickCallback);
 *
 * emitter.emit('onClick'); // [99]
 * sub.unsubscribe(); // undefined
 * emitter.emit('onClick'); // []
 */