INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');


INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Java Basics', 'https://example.com/java-basics.jpg', 'https://example.com/java-basics-gray.jpg');
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z',TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', 1); 
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-09-14T10:00:00Z',TIMESTAMP WITH TIME ZONE '2020-09-14T10:00:00Z', 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Java Basics - Lesson 1', 'Introduction to Java', 1, 'https://example.com/java-basics-lesson1.jpg', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'Tire suas duvidas', 2, 'https://example.com/java-basics-lesson1.jpg', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Lives Exclusivas para turma', 3, 'https://example.com/java-basics-lesson1.jpg', 0, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('CAP 1', 'Getting Started', 1, 'https://example.com/java-basics-section1.jpg', 1, NULL); 
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('CAP 2', 'Continuar', 1, 'https://example.com/java-basics-section1.jpg', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('CAP 3', 'finalizar', 1, 'https://example.com/java-basics-section1.jpg', 1, 2); 