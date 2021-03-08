# Question:
### Write the query to display the productionname, producername who has not produced any movie.

# Query:
### select p.Ownername ,p.Productionname from  movie as m right join productions as p ON  m.productionid =p.productionid where m.moviename is  null ;

![Alt Text](https://github.com/PS99003576/MySQL/blob/main/Images/A_Query_11.png)<br />
