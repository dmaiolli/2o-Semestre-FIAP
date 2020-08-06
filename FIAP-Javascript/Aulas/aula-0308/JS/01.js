console.log('Olá');

// document.write, NÃO USAR
// document.write('Olá do JS');

// alert
// alert('Olá aqui do JS');

// variaveis
// JS não é tipavel
// não permite que uma variável seja declarada novamente
let nome = 'Denys Lonkovski Maiolli';
let idade = 18;
let salario = 1000.00;
let noite = true;

// não pode ter seu conteudo alterado
const CPF = '123.456.789-01'

// evitar fazer isso
console.log('Eu sou o '+ nome + ' minha idade é '+ idade)

// Template string
console.log(`Tenho ${idade} anos e meu nome é ${nome}, recebo um total de ${salario}R$ e trabalho de noite? ${noite}`);

// typeof - retorna o tipo da variável
console.log(typeof(nome));
