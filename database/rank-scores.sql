-- SELECT score,
--        DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
-- FROM Scores
-- ORDER BY score DESC;
-- SELECT score,
--        DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
-- FROM Scores
-- ORDER BY score DESC;
select score,
     DENSE_RANK() OVER (ORDER BY score desc) As 'rank' 
     from Scores 
     order by score desc;