select w1.id from Weather w1, Weather w2
where w1.recordDate =  DATE_ADD(w2.recordDate, Interval 1 Day) and w1.temperature > w2.temperature;