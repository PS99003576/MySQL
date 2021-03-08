# Question:
### Write the query to display the heroname who acted in maximum languages.

# Query:
### select distinct Heroname ,Language , count(Heroname) as result from  movie group by(Language) order by (result) desc limit 1   ;

![Alt Text](https://github.com/PS99003576/MySQL/blob/main/Images/A_Query_9.png)<br />
