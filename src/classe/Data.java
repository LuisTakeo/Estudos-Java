package classe;

public class Data {
	int dia;
	int mes;
	int ano;
        
        Data(){
            this(1, 1, 2023);
        }
        
        Data(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        
        String dataFormatada(){
            String textoData;
            if(this.dia >= 10 && this.mes >= 10){
                textoData = String
                        .format("%d/%d/%d",
                        this.dia, this.mes, 
                        this.ano);
            }else if(this.dia < 10 && this.mes >= 10){
                textoData = String
                        .format("0%d/%d/%d", 
                        this.dia, this.mes, 
                        this.ano);
            }else if(this.dia >= 10 && this.mes < 10){
                textoData = String
                        .format("%d/0%d/%d", 
                        this.dia, this.mes, 
                        this.ano);
            }else{
                textoData = String
                        .format("0%d/0%d/%d", 
                        this.dia, this.mes, 
                        this.ano);;
            }
            
            return textoData;
        }
}
