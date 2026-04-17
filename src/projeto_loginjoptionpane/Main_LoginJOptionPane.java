
/*
Exercício – Login com JOptionPane 

Crie um programa em Java utilizando a classe JOptionPane que faça o seguinte: 

Encaminhe somente o link do GitHub!

1. Solicite ao usuário que informe: 
* Login 
* Senha 

2. O sistema deve verificar: 
* Login correto: admin 
* Senha correta: 1313

3. Se o login e a senha estiverem corretos: 
* Mostrar a mensagem: "Login realizado com sucesso!" 

4. Caso contrário: 
* Mostrar a mensagem: "Login ou senha inválidos." 
* Utilize apenas caixas de diálogo (JOptionPane), não utilize System.out.println. 

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
           JOptionPane.showMessageDialog(null,"Informe seu Login e Senha","Conectando",JOptionPane.WARNING_MESSAGE);

           
           
           
           
           
           
           
           
           
           
           
        }else if(escolha == 1){
            JOptionPane.showMessageDialog(null, "Programa finalizado.","Encerrando", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }  
    }  
}
