
# Question:
### Write the query to display the productionname, ownername who has not produced the movie

# Query:
### SELECT productions.productionname,productions.ownername FROM productions LEFT JOIN movie ON movie.productionid = productions.productionid WHERE moviename IS NULL;
![Alt Text](https://github.com/PS99003576/MySQL/blob/main/Images/A_Query_6.png)<br />
