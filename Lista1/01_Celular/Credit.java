
/**
 * Escreva a descrição da classe Credit aqui.
 * Classe para armazenar detalhes de valores de crédito de um cliente de telefone pré-pago.
 * @author Paulo Lopes
 * @version 20160729
 */
public class Credit
{
    private int saldo;

    public Credit(){
        this.saldo = 1000;
    }

    public Credit(int saldo){
        if(saldo < 0){
            System.out.println("Valor inválido: "+saldo);
            this.saldo = 0;
        }else{
            this.saldo += saldo;
        }
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        if(saldo < 0){
            System.out.println("setSaldo foi chamado com um valor negativo: "+saldo);
        }else{
            this.saldo = saldo;
        }
    }

    public void topUp(int saldo){
        if(saldo < 0){
            System.out.println("topUp foi chamado com um valor negativo: "+saldo);
        }else{
            this.saldo += saldo;
        }
    }

    public void topDown(int saldo){
        if(saldo < 0){
            System.out.println("topDown foi chamado com um valor negativo: "+saldo);
        }else{
            if(this.saldo < saldo){
                System.out.println("Você não tem créditos suficientes.");
            }else{
                this.saldo -= saldo;
            }
        }
    };

    

}
