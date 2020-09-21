// A idéia é reduzir a um unico valor
// Com reduce da pra fazer filter, map - mas cuidado

const numeros = [1,2,3,4,5,6,7,8,9,10]
console.log(numeros);

// Somar todos valores
const total = numeros.reduce( (acumulador, valor, indice, array) => {
  return acumulador += valor;
}, 10 /*Acumulador*/);

console.log(total);

// Array como acumulador
const arrrayPar = numeros.reduce( (acumulador, valor) => {
  if (valor % 2 == 0){
    acumulador.push(valor);
  }   

  return acumulador;
}, [])

console.log(arrrayPar);

// Retornar um array com valores multiplicados por 10
const arrayMultiplicado = numeros.reduce( (acumulador, valor) => {
  acumulador.push(valor * 10);
  return acumulador;
}, [])

console.log(arrayMultiplicado);

// Retornar o produto mais caro
const produtos = [
  {tipo: 'AAA', preco: 123},
  {tipo: 'BBB', preco: 536},
  {tipo: 'CCC', preco: 788},
  {tipo: 'DDD', preco: 455},
  {tipo: 'EEE', preco: 15},
]

const maisCaro = produtos.reduce ( (acumulador, valor) =>{
  // Nesse caso como não declarei nenhum acumulador, o objeto do indice 0 vira o acumulador e o indice 1 vira o valor
  if(acumulador.preco > valor.preco){
    return acumulador;
  } else {
    return valor;
  }
}) 

console.log(maisCaro);

// juntando filter + map + reduce
const novosNum = [2,4,8,8,51,2,1,4,7,854,12,35,201,14]
// filtrando para exibir os impares
// dobrar os valores que ele filtrou
// somar todos valores

const juntandoTudo = novosNum.filter( valor => {
  // filtrando para exibir os impares
  return valor % 2 === 1;
}).map( valor => {
  // dobrar os valores que ele filtrou
  return valor *= 2;
}).reduce( (acumulador, valor) => {
  // somar todos valores
  return acumulador + valor;
})

console.log(juntandoTudo)