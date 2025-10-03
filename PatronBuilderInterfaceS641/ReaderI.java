public class ReaderI {
//Atributos
    private String element;
    private ConverterI converter;
//construtor de la clase, sirve para inicializar la clase
    public ReaderI(String element, ConverterI converter){
        this.element = element;
        this.converter = converter;
    }

    //Metodos 
    public void parseInput(){
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;
            case "PRAGRAPH":
                converter.makeParagraph();
                break;
            case "TABLE":
                converter.makeTable();
                break;
        
            default:
            System.out.println("Opcion no valida");
                break;
        }
    }
    
}
