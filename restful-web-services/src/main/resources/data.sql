INSERT INTO user_details(id, birth_date, name)
VALUES ( 1001, CURRENT_DATE, 'Satish');

INSERT INTO user_details(id, birth_date, name)
VALUES ( 1002, CURRENT_DATE, 'Rahul');

INSERT INTO user_details(id, birth_date, name)
VALUES ( 1003, CURRENT_DATE, 'Krishna');

INSERT INTO post(id, description, user_id)
VALUES ( 20001, 'I am learninf spring boot', 1001);

INSERT INTO post(id, description, user_id)
VALUES ( 20002, 'Will be DSA master in 2026', 1001);

INSERT INTO post(id, description, user_id)
VALUES ( 20003, 'I am playing games', 1002);

INSERT INTO post(id, description, user_id)
VALUES ( 20004, 'I am at school', 1003);
