-- \c mydb

SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status != 'Destroyed';
SELECT * FROM Jaegers WHERE mark = 'Mark-1' or mark = 'Mark-6';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT min(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijukill = (SELECT max(kaijukill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijukill = (SELECT min(kaijukill) FROM Jaegers);
SELECT avg(weight) FROM Jaegers;
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Active';
DELETE FROM Jaegers WHERE status = 'Destroyed';