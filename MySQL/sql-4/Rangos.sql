/* OPERADORES*/
SELECT * FROM productos;
/* Diferente: != or <>*/

SELECT * FROM productos WHERE idCategoria!=3;
/* los null y not null*/
SELECT * FROM productos WHERE precio IS NOT NULL;
/* BETWEEN . AND */
SELECT * FROM productos
WHERE precio BETWEEN 5 AND 10