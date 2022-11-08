public class Nadador extends Thread{

    private String nome;

    public Nadador(String nome){
        this.nome = nome;
    }

    @Override
    public void run() {

        nadar();

    }

    private synchronized void nadar() {
            try {
                System.out.println(nome+" pulou na piscina!");
                System.out.println(nome+"... nadando");
                Thread.sleep(4000);
                System.out.println(nome + " chegou!");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);

        }
    }
}
