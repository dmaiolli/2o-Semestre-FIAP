// ex6
function IMC(peso, altura){
    calculIMC = peso / (altura * altura);

    if(calculIMC > 40) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Obeso Mórbido`)
    }
    else if(calculIMC > 35) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Obeso Moderado`)
    }
    else if(calculIMC > 30) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Obeso Leve`)
    }
    else if(calculIMC > 25) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Sobrepeso`)
    }
    else if(calculIMC > 18.5) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Peso Normal`)
    }
    else{
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Abaixo do Peso`)
    }
}

IMC(60, 1.55)


// ex7
function MBytesToBytes(Mbytes){
    resultado = Mbytes * 1048.576 
    console.log(`${Mbytes} Megabytes é equivalente a ${resultado} bytes`)
}

MBytesToBytes(200)


// ex8
function suspeito(respostasPGT){
    respPositivas = 0
    for(pergunta of respostasPGT){
        if(pergunta === 'sim'){
            respPositivas++;
        }
    }

    if(respPositivas === 5){
        console.log("Assassino")
    } else if(respPositivas >= 3){
        console.log("Cúmplice");
    } else if(respPositivas === 2){
        console.log("Suspeita");
    } else{
        console.log("Inocente");
        
    }
}

respostas = ["sim", 'sim', "sim", "sim", 'sim']
suspeito(respostas)


// ex9
function mediaAluno(notas){
    soma = 0;
    for(nota of notas){
        soma += nota;
    }

    media = soma / notas.length;
    aprovado = false;
    if(media > 9){
        aprovado = true;
        console.log(`Conceito: A, Aprovado? ${aprovado}`);
    }
    else if(media > 7.5){
        aprovado = true;
        console.log(`Conceito: A, Aprovado? ${aprovado}`);
    }
    else if(media > 6){
        aprovado = true;
        console.log(`Conceito: A, Aprovado? ${aprovado}`);
    }
    else if(media > 4){
        console.log("D");
    }
    else{
        console.log("E");
    }
    
}

notas = [10,10,10,10]
mediaAluno(notas)


// ex10
function totalHotel(diarias){
    const diaria = 360
    if(diarias > 15){
        taxaServico = diarias * 35.50
    }
    else if(diarias === 15){
        taxaServico = diarias * 46
    }
    else if(diarias < 15){
        taxaServico = diarias * 58
    }

    total = taxaServico + diarias * 360
    console.log(`Total taxa de serviço: ${taxaServico}\nTotal de dias: ${diarias}\nTotal: ${total}`);
    
}

totalHotel(15)