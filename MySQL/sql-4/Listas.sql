/* Listas*/
SELECT * FROM productos;
SELECT * FROM productos 
WHERE precio IN (8,9,4,18.5);
SELECT * FROM productos 
WHERE precio NOT IN (8,9,4,18.5);

SELECT * FROM productos 
WHERE DATE (fecha_alta)
BETWEEN '2015-01-01' AND '2016-07-24';

SELECT * FROM productos