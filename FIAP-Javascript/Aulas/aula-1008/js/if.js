// parseInt - pega a parte inteira do número
const numero = parseInt(Math.random()*100);
console.log(`Número sorteado= ${numero}`);

//testar if
if (numero % 2 === 0) {
    console.log(`O número ${numero} é par`);
} else {
    console.log(`O número ${numero} é ímpar`);
}

//Switch
const numero2 = 3000;
switch (numero2) {
    case 1:
        console.log(`O Número do usuário é o UM`);
        break;

    case 2:
        console.log(`O Número do usuário é o DOIS`);
        break;

        case 3:
            console.log(`O Número do usuário é o TRÊS`);
        break;

        default:
        console.log(`Outro número`);
}



