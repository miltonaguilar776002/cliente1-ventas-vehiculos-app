package pe.com.arland.ventas1.consultas.argumentsource;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class CustomArgumentsProvider1 implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(
            ExtensionContext context) {
        System.out.println("Arguments provider to test "
            + context.getTestMethod().get().getName());
        return Stream.of(Arguments.of("hello", 1), 
            Arguments.of("world", 2));
    }

}