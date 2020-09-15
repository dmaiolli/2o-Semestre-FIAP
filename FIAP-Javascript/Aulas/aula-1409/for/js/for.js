const cidades = ['São Paulo','Rio de Janeiro','Holambra','Gramado','Bento Gonçalves'];
console.log(cidades);

// for in - faz leitura indice - percorre pelo índice
for (const i in cidades) {
    console.log(cidades[i]);
}

const carro = {
    modelo: "Fusca",
    fabricante: 'VW',
    cor: 'Azul',
    preco: 54000
}

//exbindo apenas  dados
for(const c in carro){
    console.log(carro[c]);
}

//exbindo chaves e  dados
for (const c in carro) {
    console.log(c, carro[c]);
}

const produtos = [
    {tipo: 'Vaso', material:'Ferro',preco:250.00},
    {tipo: 'Quadro', material:'MDF',preco:150.00},
    {tipo: 'Cortina', material:'Tecido',preco:1250.00},
    {tipo: 'Almofada', material:'Tecido',preco:50.00},
    {tipo: 'Estátua', material:'Madeira',preco:950.00}
];

for(const p in produtos){
    console.log(produtos[p]);
}

// for of sem usar indices - retorna apenas os valores 
// apenas para estrutura iteraveis - string - array
const nomes= ['Eu', 'Tu', 'Ele', 'Nós', 'Vós', 'Eles'];
for(const n of nomes){
    console.log(n);
}

