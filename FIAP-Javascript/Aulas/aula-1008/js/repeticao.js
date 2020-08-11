//for deve ser usado quando sabemos o número de repetições
for (let i = 0; i < 10; i++) {
    console.log(`Fazendo a contagem em ${i}`);    
}

//while - usar quando não sabemos o número de repetições
//efetuar um sorteio até o número 22 aparecer
let numeroSorteado = (parseInt(Math.random()*61));
let tentativasSorteio = 1;

while (numeroSorteado != 22) {
    numeroSorteado = (parseInt(Math.random()*61));
    tentativasSorteio++;
}
console.log(`Número sorteado = ${numeroSorteado}. Foram sorteados ${tentativasSorteio} números até o 22`);

//do while - obrigatóriamente o loop é executado 1 vez

let valor = 0;
do {
    console.log(`O valor está em: ${valor}`);
    valor++;
} while (valor <=5);

console.log(valor);