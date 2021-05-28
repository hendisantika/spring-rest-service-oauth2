INSERT INTO user(id, name, login, password)
VALUES (1, 'Hendi', 'hendi', '{noop}spring');
INSERT INTO user(id, name, login, password)
VALUES (2, 'Naruto', 'naruto', '{noop}spring');
INSERT INTO user(id, name, login, password)
VALUES (3, 'Sasuke', 'sasuke', '{noop}spring');
INSERT INTO user(id, name, login, password)
VALUES (4, 'Kakashi', 'kakashi', '{noop}spring');

INSERT INTO role(id, name)
VALUES (1, 'ROLE_USER');
INSERT INTO role(id, name)
VALUES (2, 'ROLE_ADMIN');
INSERT INTO role(id, name)
VALUES (3, 'ROLE_GUEST');

INSERT INTO user_role(user_id, role_id)
VALUES (1, 1);
INSERT INTO user_role(user_id, role_id)
VALUES (1, 2);
INSERT INTO user_role(user_id, role_id)
VALUES (2, 1);
insert into user_role(user_id, role_id) values (3,1);
insert into user_role(user_id, role_id) values (4,2);
