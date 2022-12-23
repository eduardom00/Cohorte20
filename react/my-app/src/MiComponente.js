import React from "react"
const MiComponente = () =>{
    let usuario={
        nombre: "JuanHer",
        apellido: "Robles"
    }
    return(
        <header>
        <h1>Componente creado</h1>
        <p>Este es mi primer componente</p>
        <ul>
          <li>
            nombre:
            <strong>
              {usuario.nombre}
            </strong>
          </li>
          <li>
            Apellido:
            <strong>
              {usuario.apellido}
            </strong>
          </li>
        </ul>
    </header>
);
}
export default MiComponente