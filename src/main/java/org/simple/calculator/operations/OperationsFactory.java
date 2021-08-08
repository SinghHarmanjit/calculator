package org.simple.calculator.operations;

import org.simple.calculator.operations.Operation;
import org.simple.calculator.operations.implementations.AdditionOperation;
import org.simple.calculator.operations.implementations.DivisionOperation;
import org.simple.calculator.operations.implementations.MultiplicationOperation;
import org.simple.calculator.operations.implementations.SubtractionOperation;

import java.util.List;
import java.util.Optional;

public class OperationsFactory {
    private final List<Operation> operations = List.of(
            new AdditionOperation(),
            new SubtractionOperation(),
            new DivisionOperation(),
            new MultiplicationOperation()
    );

    public Operation getOperationsFor(String operation) {
        Optional<Operation> optional = operations.stream()
                .filter(o -> operation.equals(o.getOperator()))
                .findFirst();
        return optional.orElseThrow();
    }
}
