/* const foo = () => console.log("first");
const bar = () => setTimeout(() => console.log("second"),500);
const foz = () => console.log("third");
 bar()
 foo()
 foz()   */


 const nombre = () => {
    const nombres = ["Pepe", "Pancho", "Marpia"];

return new Promise((resolve, reject) => {    
    setTimeout(() => {
if(true){
    resolve(nombres)
} else{
    reject ("No hay nombres");
    }
 
},3000)
});
}
/*
 nombre().then(nombres => console.log(nombres));
 console.log(nombre);
*/
/*
 // servidor
// console.log(nombre()[0]);

const url = 'https://pokeapi.co/api/v2/pokemon/25';
const pokedex=()=>{ 
    fetch(url)
    .then((datos) => {return datos.json()})
    .then((pokemon) => {
        console.log(pokemon);
    })
};
pokedex();
*/

// Azucar Sintactiva
//Código que se creó para facilitar el trabajo de los programadores
//async -- await


/*
const obtenerNombre= async ()=>{
    try{
        let nombres= await nombre();
        console.log(nombres);
    }catch (error){
        console.log(error);
    }
}
obtenerNombre()
*/
const url = 'https://pokeapi.co/api/v2/pokemon/22';
const pokedex1 = async () => {
    try {
        const respuesta = await fetch(url);
        const pokemon1 = await respuesta.json(); /*Ojito, aquí usamos dos veces await */
        console.log(pokemon1);
    }
    catch(error){

    }
}
pokedex1()