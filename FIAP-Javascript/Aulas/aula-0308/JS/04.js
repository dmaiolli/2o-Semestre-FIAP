const num1 = 321.45584

// Casas decimais
console.log(num1.toFixed(2));

// Arredondar para o próximo numero inteiro
console.log(Math.ceil(num1));

// Arredondar para o inteiro anterior
console.log(Math.floor(num1));

// Arredondar para o proximo inteiro - quando casas decimais valor maior que 50
// Arredondar para o inteiro anterior - quando casas decimais valor menor que 50
console.log(Math.round(num1));

// Maior valor em um conjunto
console.log(Math.max(321, 12, 145, 1447));

// Menor valor em um conjunto
console.log(Math.min(321, 12, 145, 1447));

// Raiz quadrada
console.log(Math.sqrt(25));

// Potencia
console.log(Math.pow(10, 2));
console.log(Math.pow(2 ** 10));

// Sortear um numero aleatorio entre 0 e 1
let numeroSorteado = Math.random()
console.log(numeroSorteado);

// Sortear um numero aleatorio entre 0 e 10
numeroSorteado = Math.random()*10
console.log(numeroSorteado);


