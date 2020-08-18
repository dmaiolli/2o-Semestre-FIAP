const pessoas = ['eu', 'tu', 'ele', 'nós', 'vós', 'eles'];
console.log(pessoas);

// colocar itens desejados dentro de uma variável
// const pessoa0 = pessoas[0];
// const pessoa1 = pessoas[1];
// const pessoa2 = pessoas[2];
// console.log(pessoa0, pessoa1, pessoa2);

//fazendo atribuição com desestruturação - pegar quem eu quiser
// const [elemento0, elemento1] = pessoas;
// console.log(elemento0, elemento1);

// //pegar dois indices e o restante do Array'
// const [elemento0, elemento1, ...restante] = pessoas;
// console.log(elemento0, elemento1);
// console.log(restante);

// pular a ordem
const [elemento0, , elemento2, , elemento4] = pessoas;
console.log(elemento0, elemento2, elemento4);


const estados = [
    sudeste = ['SP', 'RJ', 'MG'],
    norte = ['AC', 'AM', 'AP'],
    nordeste = ['BA', 'MA', 'PE']
];

console.log(estados);
console.log(estados[2][0]); // retornar BA
// por desestruturação pode ficar um pouco mais trabalhoso, pois dependendo de quem
// eu quero terei de pular vários
const [, , [bahia]] = estados;
console.log(`Pegamos o estado = ${bahia}`);

//mais fácil assim....quem sabe
const [regiao1, regiao2, regiao3] = estados;
console.log(`Pegando o estado = ${regiao3[0]}`);