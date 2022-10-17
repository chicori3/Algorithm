-- 코드를 입력하세요
SELECT member_id, member_name, gender, date_format(date_of_birth, "%Y-%m-%d") as date_of_birth
FROM member_profile
WHERE tlno is not null
AND gender LIKE ('W')
AND date_format(date_of_birth, '%m') = '03'
ORDER BY member_id ASC;

