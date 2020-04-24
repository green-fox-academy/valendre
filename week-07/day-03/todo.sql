SHOW databases;
CREATE DATABASE IF NOT EXISTS todo;

SHOW databases;

USE todo;

CREATE TABLE IF NOT EXISTS todo_list (
id INT unsigned NOT NULL AUTO_INCREMENT,
done BOOLEAN,
description VARCHAR(100),
PRIMARY KEY (id));

DESCRIBE todo_list;

INSERT INTO  todo_list (done, description)
VALUES ('0', 'Walk the dog'), ('0', 'Buy milk'), ('0',  'Do homework');

INSERT INTO  todo_list (done, description)
VALUES ('0', 'Walk the dog again'), ('0', 'Buy milk again'), ('0',  'Do homework again');

DELETE FROM todo_list
WHERE id>3;

SELECT * FROM todo_list;

UPDATE todo_list SET done='1' WHERE id>5;

SELECT * FROM todo_list;

