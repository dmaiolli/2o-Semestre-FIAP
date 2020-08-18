// com var conseguimos fazer nova declaração
var nome = 'João';
console.log(nome);

let banda = 'The Beatles';
console.log(banda);

let valor = 10;
if (valor > 5) {
    // let vaificar apenas nesse bloco
    let coisa = 'mesa';
    console.log(coisa);
    console.log(banda);
}
for (let i = 0; i < 10; i++) {
    console.log(i);
}

console.log(rua);
// faz a eleveção (hoisting) - da variação
let rua = 'Av. Lins de Vasconcelos';