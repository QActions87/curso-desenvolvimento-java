package exercicios;

public class Carro {
    // 1. Atributos ESCONDIDOS (Detalhes internos trancados)
    private double velocidadeAtual;
    private boolean airbagsAtivados;

    public Carro() {
        this.velocidadeAtual = 0.0;
        this.airbagsAtivados = false;
    }

    // 2. INTERFACE FACILITADA: O motorista só interage com o pedal de acelerar
    public void acelerar(double intensidade) {
        if (intensidade > 0) {
            // Detalhe interno protegido por uma regra de validação
            this.velocidadeAtual += intensidade * 1.5; 
            System.out.println("Injetando combustível... Velocidade: " + velocidadeAtual + " km/h");
        }
    }

    // 3. GETTER: O motorista consegue olhar o painel (velocímetro)
    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    // Nota de QA: Não criamos um "setAirbagsAtivados(true)" público! 
    // O airbag só deve inflar por um mecanismo interno em caso de colisão, 
    // e nunca ser ativado diretamente por outra classe por acidente.
}