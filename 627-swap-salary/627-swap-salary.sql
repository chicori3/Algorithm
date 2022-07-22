# Write your MySQL query statement below
# select id,name, 
# case sex
#     when 'm' then 'f'
#     else 'f' end,
# salary
# from salary

update salary
set sex = (
    case sex
        when 'm' then 'f'
        else 'm' end
)
