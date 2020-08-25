//criando objeto de forma literal
const pessoa = {
    nome: 'Israel',
    idade: 49,
    email: 'icajair@gmail.com'
};

// exibir  no console
console.log(pessoa);
console.log(`Nome da  pessoa: ${pessoa.nome}`);
console.log(`Idade da  pessoa: ${pessoa.idade}`);
console.log(`E-mail da  pessoa: ${pessoa.email}`);

// função para a criação do objeto - factory
function criarPet(nome, tipo, idade){
    return {
        // nome: nome,  tipo: tipo, idade: idade
        nome,
        tipo,
        idade,
        exibir(){
            console.log(`Nome do pet: ${this.nome} | Tipo do pet: ${this.tipo} | Idade do pet: ${this.idade}`);
        },
        adicionarIdade(){
            this.idade++;
        }
    }
}
//criar os pets
const pet1 = criarPet('Taleban', 'Cachorro', 10);
const pet2 = criarPet('Billy','gato',14);

pet1.exibir();
pet2.exibir();
pet1.adicionarIdade();
pet1.exibir();


// atribuição por desestruturação
const coisas = {
    tipo: 'Mesa',
    material: 'Madeira',
    dimensao: {
        largura: 3.5,
        altura: 1.5,
        produndidade: 1.7
    }
};

console.log(coisas);
const { tipo, material } = coisas;
console.log(tipo);
console.log(material);

const{ dimensao: {largura, altura} } = coisas;
console.log(largura);
console.log(altura);


