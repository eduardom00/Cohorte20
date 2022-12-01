let ul=document.getElementById('ul')

let palabra = "oso"
let arregloP= ["pez","perro","hormiga"]
let arr=[];


function Recibir(palabra,arregloP) {
for(let i=0; i<arregloP.length; i++){
    if (arregloP[i].length>palabra.length){
        arr.push(arregloP[i]);
    }
}    
    printList(Recibir)
}
function printList(arregloP){
    for (let i = 0; i<arregloP.length; i++){
        ul.innerHTML+=`<li>${arregloP[i]}</li>`
    }
}