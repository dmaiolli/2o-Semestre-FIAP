const valor1 = 10;
const valor2 = 2;
let resultado = 0;

// Operadores aritméticos
resultado = (valor1 + valor2) // Soma
console.log(`${valor1} + ${valor2} = ${resultado}`)

resultado = (valor1 - valor2) // Subtração
console.log(`${valor1} - ${valor2} = ${resultado}`)

resultado = (valor1 / valor2) // Divisão
console.log(`${valor1} / ${valor2} = ${resultado}`)

resultado = (valor1 * valor2) // Multiplicação
console.log(`${valor1} * ${valor2} = ${resultado}`)

resultado = (valor1 ** valor2) // Potencia
console.log(`${valor1} ** ${valor2} = ${resultado}`)

resultado = (valor1 % valor2) // Módulo
console.log(`${valor1} % ${valor2} = ${resultado}`)


let contador = 0;
console.log(`O valor do contador é de ${contador}`);
// Operador de incremento
contador++;
contador++;
console.log(`O valor do contador é de ${contador}`);

// Operador de decremento
contador--;
console.log(`O valor do contador é de ${contador}`);

// Operador de atribuição
contador+=20;
console.log(`O valor do contador é de ${contador}`);

contador*=20;
console.log(`O valor do contador é de ${contador}`);

contador-=20;
console.log(`O valor do contador é de ${contador}`);

contador/=20;
console.log(`O valor do contador é de ${contador}`);

// Operadores relacionais
resultado = (valor1 > valor2);
console.log(`${valor1} > ${valor2} ? ${resultado}`)

resultado = (valor1 < valor2);
console.log(`${valor1} < ${valor2} ? ${resultado}`)

resultado = (valor1 >= valor2);
console.log(`${valor1} >= ${valor2} ? ${resultado}`)

resultado = (valor1 <= valor2);
console.log(`${valor1} <= ${valor2} ? ${resultado}`)

resultado = (valor1 == valor2);
console.log(`${valor1} == ${valor2} ? ${resultado}`)

resultado = (valor1 != valor2);
console.log(`${valor1} != ${valor2} ? ${resultado}`)

resultado = (valor1 === valor2);
console.log(`${valor1} === ${valor2} ? ${resultado}`)

// Operadores lógicos
resultado = ((valor1 === valor2) || (valor1 > valor2))
console.log(resultado);

resultado = ((valor1 === valor2) && (valor1 > valor2))
console.log(resultado);
