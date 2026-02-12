package _10_facade;

/**
 * FACADE - Padrão Estrutural
 * Fornece uma interface simplificada para um subsistema complexo.
 * 
 * Exemplo: Ligar um computador envolve várias etapas complexas.
 */
public class CPU {
    public void freeze() {
        System.out.println("💻 CPU: Congelando...");
    }
    
    public void jump(long position) {
        System.out.println("💻 CPU: Pulando para posição " + position);
    }
    
    public void execute() {
        System.out.println("💻 CPU: Executando...");
    }
}
