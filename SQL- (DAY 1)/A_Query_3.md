# Question:
### Write the query to display production name, owner name have produced maximum movies

# Query:
### SELECT productions.productionname,productions.ownername
###       FROM productions
###       INNER JOIN movie ON movie.productionid = productions.productionid
###       group by productionname
###       ORDER BY COUNT(*) DESC
###       LIMIT 1;

![Alt Text](https://github.com/PS99003576/MySQL/blob/main/Images/A_Query_3.png)<br />
