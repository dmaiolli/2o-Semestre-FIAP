const texto = 'Javascript é uma linguagem de programação fantástica'
console.log(texto)

// Tamanho da string
console.log(`Tamanho da string é de: ${texto.length} caracteres`);

// Letras maiusculas
console.log(`Todas maiusculas: ${texto.toUpperCase()}`);

// Letras minusculas
console.log(`Todas maiusculas: ${texto.toLowerCase()}`);

// Exibir conteudo de um indice da String
console.log(`Caracter da String na posição 4: ${texto.charAt(4)}`);
console.log(`Caracter da String na posição 4: ${texto[4]}`);

// Buscar uma substring
console.log(`Procurando uma posição de uma substring substring: ${texto.indexOf('programação')}`);

// Como não temos "@" na string ele retorna -1
console.log(`Procurando pelo @: ${texto.indexOf('@')}`);

//Pegando um conteudo da string
console.log(`Pegando conteúdo entre 0, 11: ${texto.slice(0, 11)}`);

// Copiando uma string em uma variavel
const stringCopiada = texto.slice(5, 23);
console.log(stringCopiada);

// Separar uma string por caracter - no exemplo vou usar os espaços
// Sera gerado um novo array
const stringSeparada = texto.split(' ')
console.log(stringSeparada);

// Sera gerado um novo array, definir quantos indices eu desejo
const stringSeparada2 = texto.split(' ', 3)
console.log(stringSeparada2);

// Substituir um elemento na string
console.log(`Substituir a primeira letra A que ele encontrar: ${texto.replace('a', '#')}`);

// Substituir todas com Expressão Regular
// na expressão "i" ele ignora se a letra é maiuscula ou minuscula
// "g" é para todas ocorrencias na string
console.log(`Substituir todas as letras A que encontrar: ${texto.replace(/a/ig, '#')}`);

// Substituir inclusive com letras acentuadas
console.log(`Substituir com acentos: ${texto.replace(/[a, \xE0-\xE6]/ig, '#')}`);

// Converter um numero em uma string
let numero = 10.56785
numero = numero.toString();
console.log(typeof(numero));
