let arr=[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];
// console.log(arr [1][1]);

// let suba = [1, 2, 3];
// let subb = [4, 5, 6];
// let subc = [7, 8, 9];
// let arreglos=[suba,subb,subc]

// for (let fila=0; fila<=2;fila++){
//     for (let columna = 0; columna<=2; columna++){

//         console.log(arr [fila][columna]);
//     }
//     console.log("Cambio de Columna");
// }
let contador = 0;
// while(contador < 10){
//     console.log(contador);
// contador = contador +1;
// }
// console.log(contador);


// do{
// contador ++;
// console.log(contador);
// }
// while( contador<= 10);

// let cadena="hola"
// console.log(cadena.length);
//While primero comprueba y luego ejecuta. No hace nada si no es verdadera
//Primero inicializa, dice en donde va a empezar, incrementa y ejecuta
let fila = 0;
//while (fila<3){
do{
    for(let columna = 0; columna<=2;columna++){
        console.log(arr [fila][columna]);
    }
    fila++
    console.log("-------");
} while (fila<=2)


let arr2 = [
    [1,1,1],
    [2,2,2],
    [3,3,3]
]
let arr3 = [
    [2,2,2],
    [3,3,3],
    [4,4,4]
]
let matrizR=[
[],[],[],
];
for(let i=0;i<3;i++) {
    for(let j=0;j<3;j++){
        matrizR[i][j]=arr2[i][j]*arr3[j][i];   
    }
}
console.table(matrizR);
