INSERT INTO `user` (name, surname, login, password) VALUES ('Axel', 'Katz', 'axel', 'axel');
INSERT INTO `user` (name, surname, login, password) VALUES ('Brad', 'Pitt', 'brad', 'brad');
INSERT INTO `user` (name, surname, login, password) VALUES ('Mahatma', 'Gandhi', 'mahatma', 'mahatma');

INSERT INTO `cat` (name, race, birth, photo, user_id) VALUES ('Ernest', 'Main Coon', '2012-12-12', 'ernest.jpg', 1);
INSERT INTO `cat` (name, race, birth, photo, user_id) VALUES ('Garfield', 'Chat roux', '2012-06-12', 'garfield.jpg', 2);
INSERT INTO `cat` (name, race, birth, photo, user_id) VALUES ('Flipette', 'Chat flipé', '2012-01-12', 'flipette.jpg', 3);

INSERT INTO `toy` (name, cat_id) VALUES ('Canard', 1);
INSERT INTO `toy` (name, cat_id) VALUES ('Souris', 2);
INSERT INTO `toy` (name, cat_id) VALUES ('Pelote de laine', 3);
