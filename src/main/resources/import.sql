INSERT INTO role (id, name, description) VALUES (1, 'ROLE_USER', 'Standard User - Has no admin rights');
INSERT INTO role (id, name, description) VALUES (2, 'ROLE_ADMIN', 'Admin User - Has permission to perform admin tasks');

INSERT INTO user (id, password, username) VALUES (1, '$2a$04$8TqKBZptUcfLVOB5yTNNP.2asbSLv8ET5tUuFMZJlivu472en2C3G', 'user');
INSERT INTO user (id, password, username) VALUES (2, '$2a$04$8TqKBZptUcfLVOB5yTNNP.2asbSLv8ET5tUuFMZJlivu472en2C3G', 'admin');

INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);
