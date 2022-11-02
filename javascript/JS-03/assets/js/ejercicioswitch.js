let descuento = 0
let precio1 = 0
let precio=Number(prompt("Precio del producto"))
let cupon=prompt("Ingresa el cupon")
switch(cupon){
        case "Bronce":
            descuento=.05
            precio1=precio*(1-descuento)
          alert("Precio Original "+precio);
          alert("Precio con Descuento "+precio1);
        break;
        case "Plata":
            descuento=.1
            precio=precio*(1-descuento)
          alert("Precio Original "+precio);
          alert("Precio con Descuento "+precio1);
        break;
        case "Oro":
                descuento=.2
                precio=precio*(1-descuento)
          alert("Precio Original "+precio);
          alert("Precio con Descuento "+precio1);
        break;
        case "Platino":
                    descuento=.25
                    precio=precio*(1-descuento)
          alert("Precio Original "+precio);
          alert("Precio con Descuento "+precio1);
        break;
    default:
        alert("No es un cupón valído")
 }

//  Operador ternario
//  If cimplicifado
//  condicion ? en caso de ser verdad
//: en case de ser mentira

let edad1=18;
let mensaje = edad1>=18
  ? "es mayor de edad"
  : "tas chiquito";
console.log(mensaje); 

console.log(`Yo soy raul y ${edad1 >= 18 ? "Soy mayor de edad" : "Soy menor de edad"}`);