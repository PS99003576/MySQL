# Question:
### Write the query to display the production name, owner name who has produced movie for more languages.

# Query:
### select Distinct p.Productionname,p.Ownername ,count(p.Productionname) as counter  from  movie as m right join productions as p ON  m.productionid =p.productionid  group by(m.language) order by(counter) desc limit 1;
11)select p.Ownername ,p.Productionname from  movie as m right join productions as p ON  m.productionid =p.productionid where m.moviename is  null ;

![Alt Text](https://github.com/PS99003576/MySQL/blob/main/Images/A_Query_10.png)<br />
