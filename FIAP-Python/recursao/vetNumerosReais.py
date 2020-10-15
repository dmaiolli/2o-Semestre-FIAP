def percorreVet(vetor):
  i = 0
  if percorreVet(vetor[i]) > percorreVet(vetor[i]):
    return vetor

vet = [0,1,2,3,4,5]
print(percorreVet(vet))