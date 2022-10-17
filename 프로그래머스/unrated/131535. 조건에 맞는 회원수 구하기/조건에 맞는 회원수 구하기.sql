-- 코드를 입력하세요
SELECT count(u.user_id)
FROM user_info u
where age between 20 and 29
and joined between '2021-01-01' and '2021-12-31';

