import React from "react"
import PropTypes from "prop-types"
export const TercerComponente  = (nombre, apellido, ficha) =>{
    return(
    <div>

        <h1> Tercer Componente</h1>
        <h2> comunicación entre componentes</h2>
    <ul>
        <li>{nombre} </li>
        <li>{apellido}</li>
        <li>{ficha.altura}</li>
        <li>{ficha.alergias}</li>
        <li>{ficha.estado}</li>
    </ul>
    </div>
    )
}
TercerComponente.PropTypes ={
    nombre: propTypes.string,
    apellido: propTypes.string,
    ficha: propTypes.object
}