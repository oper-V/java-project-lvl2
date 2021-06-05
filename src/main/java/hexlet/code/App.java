package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;
import java.io.File;

/*Для работы приложения в командной строке необходимо реализовать интерфейс Callable,
 *поэтому синтаксический анализ, обработка ошибок и обработка пользовательских запросов на
 *справку по использованию или справке по версии могут быть выполнены с помощью одной строки кода.
 */
@Command(name = "gendiff ", mixinStandardHelpOptions = true, version = "gendiff  1.0",
         description = "Compares two configuration files and shows a difference.")

public class App implements Callable<Integer> {

    @Parameters(index = "0", description = "path to first file")
    private File filepath1;

    @Parameters(index = "1", description = "path to second  file")
    private File filepath2;      

    @Option(names = {"-f", "--format"}, description = "output format [default: stylish]")
    private String format = "stylish"; 


    @Override
    public Integer call() throws Exception { // your business logic goes here...
 	System.out.println("Hello World!");
        return 0;
    }





  public static void main(String[] args) {
    
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}

