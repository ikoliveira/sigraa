import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import Testes.SGRAATest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executando testes do SGRAA...\n");

        Result result = JUnitCore.runClasses(SGRAATest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("Falha: " + failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("\nTodos os testes passaram com sucesso!");
        } else {
            System.out.println("\nAlguns testes falharam. Verifique as mensagens acima.");
        }
    }
}
