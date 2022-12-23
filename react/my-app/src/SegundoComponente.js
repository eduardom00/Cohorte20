import React from "react"
export const SegundoComponente = () =>{
    //const libros =["Harry Potter","El hobbit","1984","El principito"];
    const libros =[]
    return(
        <div>
            <h1> SegundoComponente</h1>
            <h2>Lista de Libros</h2>
            {libros.length>=1? (
            <ul>{
                libros.map((libro,indice) => {
                return <li key = {indice}>{libro}</li>
                })
                }
            </ul>)
            : <p>Se acabaron pai</p>}
        </div>
    )
}