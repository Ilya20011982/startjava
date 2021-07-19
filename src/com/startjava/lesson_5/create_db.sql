CREATE DATABASE mydb;

\c mydb;

CREATE TABLE Jaegers
(
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(10),
    height    NUMERIC(2),
    weight    INT,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INT
);