

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void mostrarQtdProcessadores(){
    int quantidade = Runtime.getRuntime().availableProcessors();
    System.out.println(quantidade);
}

void preenchendoVetor(int tamanho){
    List<Byte> A;
    for(int i = 0; i < tamanho; i++){

    }
}

byte[] escolhaPreenchimento(int tamanhoVetor) throws Exception {
    boolean escolha = false;
    Random random = new Random();

    byte[] vetor = new byte[tamanhoVetor];


    if(escolha = true){
for(int i = 0; i < tamanhoVetor; i++){
    vetor[i] = Teclado.getUmByte();
}
    }else{
              random.nextBytes(vetor);
    }

    return vetor;
}


void visualizacaoLista(){

}

void main() throws Exception {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    byte[] vetor= escolhaPreenchimento(5);

    IO.println(String.format("Hello and welcome!"));

    long inicio = System.currentTimeMillis();


    MergeSort.sort(vetor);

    long fim = System.currentTimeMillis();



    long tempo = fim-inicio;

    System.out.println(tempo);

    int tamanhoVetor = 0;
    int numPreencher = 0;



}
