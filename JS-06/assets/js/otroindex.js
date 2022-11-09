//forma 1
//1 llamar al contenedor
const imagen = document.getElementsByClassName('contenedor')[0];

//2- crear el elesmento

const nuevaImg = document.createElement("img");

// 3 -modiciar atributos
nuevaImg.src = "https://placeimg.com/200/200/nature";

nuevaImg.alt = "Imagen de naturaleza";

//4 - insertar el elemento
imagen.appendChild(nuevaImg);

/* Otra forma de crear elementos*/

//1 llamar al elemento padre
const imagen2= document.getElementById("img");

//2
imagen2.innerHTML= `
    <img src="https://placeimg.com/200/200/animals" alt="Imagen de animales"/>
`;


//CREAR UNA LISTA A PARTIR DE LOS ELEMENTOS GUARDADOS EN UN ARREGLO

//Insertar en el documento para que se pueda mostrar

const nombres=["Pedro", "Juan", "Sonia", "Miguel"]

//Forma 1
const arreglo= document.getElementById("arreglo") 

const ul2=document.createElement("ul")
arreglo.appendChild(ul2)
for (let i =0;i<nombres.length;i++){
    ul2.innerHTML+=`<li>${nombres[i]}</li>`
}

//Forma 2 
const frutas =["manzana","limon","peras","Uva"];
const lista2 = document.getElementById("lista2");
frutas.forEach((el)=>{
    lista2.innerHTML += `
    <li>${el}</li>
    `;

})