// retornar os números menores que 30
const numeros = [12,5,8,7,78,99,44,26,78,124,67,89,99,1457,89,18,15,6,8];
console.log(numeros);

// filter apenas em arrays - não altera o array inicial
// const numFiltrados = numeros.filter(numerosFiltados);
// console.log(numFiltrados);

// funçao de callback
// function numerosFiltados(valor){
//     return valor < 30;
// }

// com função anonima = mais comun
// const numerosFiltrados = numeros.filter(function(valor){
//         return valor < 80;
// });
// console.log(numerosFiltrados);


// filter com arrow function tb é comum
// const numerosFiltrados = numeros.filter((valor) =>{
//     return valor <60;
// }) 
// console.log(numerosFiltrados);

// Simplicando a arrow function - nesse caso temos apenas 1 linha, então....
// const numerosFiltrados = numeros.filter(valor => valor > 100);
// console.log(numerosFiltrados);


// Filter completo com Arrow function
// retorna = valor - índice - array
const numerosFiltrados = numeros.filter((valor, indice, array) => {
    console.log(valor, indice, array);
    return valor < 50;
});
console.log(numerosFiltrados);

const pessoas = [
        {nome: 'Eu', idade: 49, email:'teste@teste'},
        {nome: 'Tu', idade: 29, email:'teste@aaaa'},
        {nome: 'Ele', idade: 19, email:'teste@bbbb'},
        {nome: 'Nós', idade: 29, email:'teste@cccc'},
        {nome: 'Vós', idade: 99, email:'teste@dddd'},
        {nome: 'Eles', idade: 89, email:'teste@eeee'}
];

const idadePessoas = pessoas.filter(obj => obj.idade >30);
console.log(idadePessoas);