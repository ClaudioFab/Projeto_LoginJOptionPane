
/*
Exercício – Login com JOptionPane 

Crie um programa em Java utilizando a classe JOptionPane que faça o seguinte: 

1. Solicite ao usuário que informe: //
* Login //
* Senha //

2. O sistema deve verificar: //
* Login correto: admin //
* Senha correta: 1313 //

3. Se o login e a senha estiverem corretos: //
* Mostrar a mensagem: "Login realizado com sucesso!" //

4. Caso contrário: 
* Mostrar a mensagem: "Login ou senha inválidos." //
* Utilize apenas caixas de diálogo (JOptionPane), não utilize System.out.println. //

Extra:
Limitar tentativas 
Usar showConfirmDialog após erro 
Criar menu inicial (Entrar / Sair) 
Validar campo vazio 

*/



package projeto_loginjoptionpane;

import javax.swing.JOptionPane;

public class Main_LoginJOptionPane {

    public static void main(String[] args) {
        Iniciando();
    }
    
    
    public static void Iniciando() {
        JOptionPane.showMessageDialog(null,"Exercício\nLogin com JOptionPane ","Iniciando",JOptionPane.INFORMATION_MESSAGE);
        
        String[] varia = {"Entrar","Sair"};
        int escolha = JOptionPane.showOptionDialog(null,"Deseja logar sua conta ? ","Escolhendo",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,varia,varia[0]);

        if(escolha == 0){
            String login01="";
            int senha01=0;

            
            while (true) {

                login01 = JOptionPane.showInputDialog(null,"Informe seu Login e Senha\n\nLogin","Login: ",JOptionPane.QUESTION_MESSAGE);

                if (login01 == null) {
                    JOptionPane.showMessageDialog(null, "Programa finalizado.", "Obrigado", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                
                senha01 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe seu Login e Senha\n\nSenha: ","Senha",JOptionPane.QUESTION_MESSAGE));

                //RESOLVER A QUESTÃO DE CONVERSÃO
//                if (senha01 == null) {
//                    JOptionPane.showMessageDialog(null, "Programa finalizado.", "Obrigado", JOptionPane.INFORMATION_MESSAGE);
//                    System.exit(0);
//                }

                
                
                if(login01.equals("admin") && senha01 == 1313){
                    break;  
                }else if(login01.equals("admin") && senha01 != 1313){
                    JOptionPane.showMessageDialog(null,"Senha Inválida!\nTente Novamente!","Erro Senha",JOptionPane.ERROR_MESSAGE);  
                }else if(login01 !="admin" && senha01 == 1313){
                    JOptionPane.showMessageDialog(null,"Login Inválido!\nTente Novamente!","Erro Login",JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Login e Senha Inválidos!\nTente Novamente!","Erro",JOptionPane.ERROR_MESSAGE);
                }
                
                
                
            }
            
            
            //Resposta após Login e Senha corretos.
            JOptionPane.showMessageDialog(null,"Login realizado com sucesso!","Logando conta",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        //Caso escolha sair no menu inicial.
        }else if(escolha == 1){
            JOptionPane.showMessageDialog(null, "Programa finalizado.","Encerrando", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }  
    }  
}
