\c mydb;

SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status != 'Destroyed';
SELECT * FROM Jaegers WHERE mark = 'Mark-1' and mark = 'Mark-6';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT min(launch));
SELECT * FROM Jaegers WHERE kaijukill = (SELECT max(kaijukill));
SELECT * FROM Jaegers WHERE kaijukill = (SELECT min(kaijukill));
SELECT avg(height) FROM Jaegers;
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Active';
DELETE FROM Jaegers WHERE status = 'Destroyed';