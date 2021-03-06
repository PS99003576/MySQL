

# Query:
## select productions.Productionid, productions.Productionname, count(distinct movie.Moviename) as movie_count from productions inner join movie where productions.Productionid = movie.Productionid group by productions.Productionid;</br>
