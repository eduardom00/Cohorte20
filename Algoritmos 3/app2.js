//porpiedades de arreglos
//length

const frutas = ["Pera","Manzana",
"Guayaba"];
console.log(frutas);
console.log(frutas.length);

//push 
//añade un ultimo elemento al array y devuelve el nuevo length

frutas.push("Cereza")
console.log(frutas);

//unshift
//Agrega elementos al inicio del arreglo

frutas.unshift("Platano", "Ciruela")
console.log(frutas);

//Métodos para quitar
//pop()elimina el último elemento

let elemento = frutas.pop()
console.log(frutas);
console.log(elemento);

//shift
//elimina el primer elemento del inicio
frutas.shift()
console.log(frutas);

//indexof() nos permite encontrar el índice del arreglo
console.log(frutas.indexOf("Ciruela"));

//reverse() Invierte el orden de los elementos de un array asdfasdfadf
console.log(frutas.reverse());

//sort() Ordena los valores
console.log(frutas.sort());
const numeros = [4,567,2,4566,45,78,1]
//Solamente ordena tomando en cuenta el primer valor
numeros.sort();
console.log(numeros.sort());
console.log(numeros.sort((a,b) => a -b));


