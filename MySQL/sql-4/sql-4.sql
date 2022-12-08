show columns from productos;
INSERT INTO productos (nombre,precio,fecha_alta,
idCategoria,existencia) VALUES ('Concha',3.5,curdate(),12,20);
UPDATE productos SET existencia = 10
WHERE idProducto=25;
select * from categoria;
INSERT INTO categoria VALUES(NULL, 'Dulces');
INSERT INTO categoria (nombre) VALUES ('Refrescos');

INSERT INTO productos (nombre,precio,idCategoria,existencia,marca1) 
VALUES ('Ariel blanco',1,10,3,'Ariel');
UPDATE productos SET existencia=10
WHERE idProducto=35;
ALTER TABLE productos ADD COLUMN marca1 VARCHAR(20) NOT NULL;
SELECT * FROM productos;
SET FOREIGN_KEY_checks=0;
truncate table categoria;
SET FOREIGN_KEY_checks=1;
SELECT * FROM categoria;
INSERT INTO productos VALUES
(NULL,'Refresco de Cola',10.00,'2016-01-01',1,10,'a'),
(NULL,'Refesco de limon',9.00,'2015-02-06',1,15,'a'),
(NULL,'Limonada',12.00,'2014-05-09',1,12,'a'),
(NULL,'Refresco de toronja',9.00,'2016-05-07',1,20,'a'),
(NULL,'Agua Mineral',15.00,'2016-02-15',1,8,'a'),
(NULL,'Aceite Natural 1 Litro',20.00,'2015-09-20',2,25,'a'),
(NULL,'Aceite de Coco 500 ml',15.00,'2016-03-24',2,20,'a'),
(NULL,'Jabon lavanda 1 kg',12.00,'2014-02-21',3,6,'a'),
(NULL,'Detergente en polvo 1 kg',18.50,'2014-11-17',3,9,'a'),
(NULL,'Jabon para manos 500 ml',26.50,'2016-01-10',3,7,'a'),
(NULL,'Detergente en polvo 2 kg',30.00,'2014-11-17',3,5,'a'),
(NULL,'Detergente en polvo para trastes 500 g',18.50,'2016-02-20',3,8,'a'),
(NULL,'Paleta de caramelo',5.00,'2013-01-01',4,50,'a'),
(NULL,'Paleta de chocolate',6.50,'2014-05-20',4,34,'a'),
(NULL,'Gomitas',12.50,'2016-03-30',4,16,'a'),
(NULL,'Bolsa de dulces variados',14.50,'2015-12-12',4,23,'a'),
(NULL,'Papas fritas',9.50,'2013-04-09',5,14,'a'),
(NULL,'Frituras de queso',8.00,'2014-10-09',5,12,'a'),
(NULL,'Papas fristas con limon',10.00,'2015-09-08',5,8,'a'),
(NULL,'Bolsa de chicharrones',15.00,'2016-05-20',5,19,'a'),
(NULL,'Palomitas de mantequilla',18.00,'2015-11-28',5,12,'a');
SELECT * FROM productos;
SELECT COUNT(idProducto), idCategoria FROM productos GROUP BY idCategoria;
SELECT * FROM productos WHERE idCategoria=5;