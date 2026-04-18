
package projeto_loginjoptionpane;
import javax.swing.JOptionPane;
public class Main_LoginJOptionPane {
    public static void main(String[] args) {
        PainelLogin();
    }
    public static void PainelLogin() {
        JOptionPane.showMessageDialog(null,"Exercício\nLogin com JOptionPane ","Iniciando",JOptionPane.INFORMATION_MESSAGE);
        
        //Criando menu inicial (Entrar / Sair).
        String[] varia = {"Entrar","Sair"};
        int escolha = JOptionPane.showOptionDialog(null,"Deseja logar sua conta ? ","Escolhendo",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,varia,varia[0]);

        //Iniciando caso escolha entrar no menu inicial.
        if(escolha == 0){
            //variaveis principais do loop.
            String login01,senha;
            int senha01=0,cont=0;

            while (true) {
                //Solicitando ao usuário que informe login.
                login01 = JOptionPane.showInputDialog(null,"Digite seu Login: ","Login",JOptionPane.QUESTION_MESSAGE);

                //Encerrando ao escolher cancelar no login.
                if (login01 == null) {
                    JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);

                //Validando campo vazio no login como um erro. 
                //Usando showConfirmDialog após situações de erro.
                }else if(login01.isEmpty()){
                    int erro01 = JOptionPane.showConfirmDialog(null,"Nada foi digitado!\nDeseja tentar novamente?","Erro!",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                    if(erro01 == 0){
                        continue;
                    }else if(erro01 == 1){            
                        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);     
                    }
                }
                
                //Solicitando ao usuário que informe senha.
                senha = JOptionPane.showInputDialog(null,"Digite sua Senha: ","Senha",JOptionPane.QUESTION_MESSAGE);
                
                //Encerrando ao escolher cancelar na senha.
                if (senha == null) {
                    JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }

                //Impedimento de usar letras/simbolos/espaço vazio na senha.
                try {                    
                    senha01 = Integer.parseInt(senha);
                } catch (NumberFormatException e) {

                    int erro01 = JOptionPane.showConfirmDialog(null,"A senha deve conter apenas números!\nDeseja tentar novamente?","Erro!",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                    if(erro01 == 0){
                        continue;
                    }else if(erro01 == 1){            
                        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);     
                    }
    
                }

                //Conferindo login e senha.
                if(login01.equals("admin") && senha01 == 1313){
                    break;
                    
                //Mostrando mensagem de Login ou senha inválidos.
                }else{
                        //Limitador de tentativas.
                        cont++;
                        if(cont > 2){
                            JOptionPane.showMessageDialog(null,"Login ou Senha Inválidos!\nTentativas: "+cont+"\nNúmero máximo de tentativas atingido!\nTente novamente mais tarde.","Aviso",JOptionPane.WARNING_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0); 
                        }
                        
                    int erro01 = JOptionPane.showConfirmDialog(null,"Login ou Senha Inválidos!\nTentativas: "+cont+"\nDeseja tentar novamente?","Erro!",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                    if(erro01 == 0){
                        continue;                        
                        
                    }else if(erro01 == 1){            
                        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);     
                    }
                }
            }

            //Resposta após Login e Senha corretos.
            JOptionPane.showMessageDialog(null,"Login realizado com sucesso!","Logando conta",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        //Encerrando caso escolha sair no menu inicial.    
        }else if(escolha == 1){
            JOptionPane.showMessageDialog(null, "Programa finalizado.","Encerrando", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }  
    }  
}