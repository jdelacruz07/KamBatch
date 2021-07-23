DROP TABLE people IF EXISTS;

CREATE TABLE people  (
    person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);

CREATE TABLE fibo  (
    fibo_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    fibo618 VARCHAR(20),
    fibo786 VARCHAR(20)
);
