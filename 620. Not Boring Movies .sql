/*
620. Not Boring Movies 
X city opened a new cinema, many people would like to go to this cinema. The cinema also gives out a poster indicating the movies’ ratings and descriptions.

Please write a SQL query to output movies with an odd numbered ID and a description that is not 'boring'. Order the result by rating.

For example, table cinema: 
*/
# Write your MySQL query statement below
SELECT * FROM CINEMA C
WHERE C.DESCRIPTION <> 'boring'
AND MOD(C.ID, 2)=1
ORDER BY C.RATING DESC