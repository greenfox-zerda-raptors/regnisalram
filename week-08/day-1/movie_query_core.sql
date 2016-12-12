-- Q1-- 
SELECT title
FROM movie
where director = "Steven Spielberg";

-- Q2 --
select distinct year
from movie
join rating on movie.mID = rating.mID
where stars between 4 and 5
order by year asc;

-- Q3 --
select title
from movie
where not exists(select 2 from rating where movie.mId = rating.mId);

-- Q4 --
select name
from Reviewer
left join rating on Reviewer.rID = Rating.rID
where ratingDate is NULL;

-- Q5 --
select name, title, stars, ratingDate
from rating
join reviewer on reviewer.rID = rating.rID
join movie on rating.mID = movie.mID
order by name, title, stars;

-- Q6 --
select name, title
from reviewer
join rating on rating.rID = Reviewer.rID
join rating r2 on rating.rID = r2.rID
join movie on rating.mID = movie.mID
where rating.stars < r2.stars and rating.ratingDate < r2.ratingDate
group by name , title having count(*) = 1;

-- Q7 --
select movie.title, max(stars)
from movie
join rating on movie.mID = rating.mID
group by movie.title;

-- Q8 --
select movie.title, max(stars) - min(stars) as spread
from movie, rating
where movie.mID = Rating.mID 
group by title
order by spread desc;

-- Q9 --move

