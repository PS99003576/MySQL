# Question:
### Write the query to display production name, owner name have produced more than 2 movies

# Query:
### select productions.Productionname, productions.Ownername, count(movie.Moviename) as 'more than 2 movies' from productions left join movie on productions.Productionid = movie.Productionid group by productions.Productionid having count(Moviename) > 2;

![Alt Text](https://github.com/PS99003576/MySQL/blob/main/Images/A_Query_2.png)<br />
