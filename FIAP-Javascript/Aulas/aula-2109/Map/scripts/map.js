// Map == filter - diferença está no retorno final

// Filter não altera valores do array != do Map que altera conforme vc permitir
// Map retorna um Array exatamente do mesmo tamanho do original
// Map tb recebe uma função de callback - retorna um valor - indice - array

// Triplicar os valores de um array
const numeros1 = [3,4,5,6,7,8,9,1,2,0]
console.log(numeros1);

const triplo = numeros1.map( valor => {
  return valor * 3;  
});

console.log(triplo);

const ind_valor = numeros1.map( (indice, valor) => {
  console.log(valor, indice);
})

const ind_valor_array = numeros1.map( (indice, valor, array) => {
  console.log(valor, indice, array);
})

// Outro exemplo
const series = [
  {titulo: 'The Boys', streaming: 'Amazon Prime'},
  {titulo: 'Mindhunter', streaming: 'Amazon, Netflix'},
  {titulo: 'Homeland', streaming: 'Amazon Prime'},
  {titulo: 'Breaking Bad', streaming: 'Netflix'},
  {titulo: 'Dark', streaming: 'Netflix'}
];
console.log(series)

// Retornar apenas o titulo das series
const titulos = series.map( obj => {
  return obj.titulo;
})
console.log(titulos);

// Remover a chave de titulos retornando apenas um obj com a chave de streaming
const plataformas = series.map( obj => {

  // Forma 1 - ele aponta para o mesmo objeto -- atribuição por referência
  // delete obj.titulo;
  // return obj

  // Forma 2 - Retornando um objeto novo só com as plataformas
  return {plataforma : obj.streaming};
})

console.log(plataformas);


// Adicionar um id como indice
const insereId = series.map( (obj, indice) => {
  // Dessa forma irá alterar o array original, pois ele tem a declaração por referência, isso acontece com arrays, objetos e funções

  // obj.id = indice;
  // return obj


  // Para resolver esse problema - criar um novo objeto - fazer spread(...)
  const novoObjeto = { ...obj };
  novoObjeto.id = indice;
  return novoObjeto;
})

console.log(insereId)


