//Estructura dond me dice que estoy testeando, hago una función flecha para decirle todo el código que quiero testear
//Opción con Jest
const indexTest = require("../calculadora")
test ("Test suma", () => {
    const r = indexTest.suma(1,5)
    expect (r).toBe(12)
}) 

//Opción con Babel
/*
import{ indexTest } from "../calculadora";
test ("Test suma", () => {
    const r = indexTest.suma(1,5)
    expect (r).toBe(6);
});
test.todo("test de resta");
test.todo("test de multiplicación");
test.todo("test de división");*/
