
# Question:
### Write the query to display the productionname, ownername who has not produced the ‘hindi’ movie.

# Query:
### select p.Productionname,p.Ownername from productions p left join movie m on m.Productionid=p.productionid and m.language="Hindi" where m.Language is null;

![Alt Text](https://github.com/PS99003576/MySQL/blob/main/Images/A_Query_7.png)<br />
