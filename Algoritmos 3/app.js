//Arreglos
let miVariable = 'Miguelon'
let arr1 = new Array("Eduardo",3,true,miVariable);
console.log(arr1);

//Modificar los valores
arr1[0]="Nuevo Eduardo"
console.log(arr1);

//Asignar otro valor en array
arr1[4]="Cuarto Valor"
console.log(arr1[4]);


//notación de corchetes

let arr2 = [];
console.log(arr2);

const arr3 =[];
console.log(arr3);
arr3[4] = "Holabb"
console.log(arr3);

//Arreglos muldidimensionales, matrices
//Arreglo dentro de un arreglo
const arr4 = [1,"Adiós",false,[1]];
console.log(arr4[3]);
console.log(arr4[3][0]);