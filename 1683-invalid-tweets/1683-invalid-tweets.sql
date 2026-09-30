# Write your MySQL query statement

WITH temp AS(
    SELECT tweet_id, LENGTH(content) AS len
    FROM Tweets
)

SELECT tweet_id 
FROM temp
WHERE len > 15