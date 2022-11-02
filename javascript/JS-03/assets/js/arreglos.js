
const numeros=[2,4,6,57,200];
let suma=0;

let suma2= numeros.forEach(function sumar(elemento){
    suma=elemento+suma;
    return suma;
});
console.log(suma);

//map
//Genera una copia del arreglo orifinal
let nuevoArr= numeros.map((el,idx,arr) =>{
    return el*el;
});
console.log(nuevoArr);

//filter
//crea una copia dle arreglo original y nos permite filtrar
const frutas=["papaya","manzana", "manzana", "uva"];
let frutafiltrada= frutas.filter((fruta) => fruta.length <= 3);
console.log(frutaFiltrada);
