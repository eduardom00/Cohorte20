let arr1=[]
let palabra = prompt("Ingresa una palabra");
palabra.forEach

for(let i=0; i<palabra.length; i++){
    (arr1.unshift(palabra[i]))
}
console.log(String(arr1).replaceAll(","," "));