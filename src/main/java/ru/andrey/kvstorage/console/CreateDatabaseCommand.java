package ru.andrey.kvstorage.console;

import ru.andrey.kvstorage.exception.DatabaseException;

public class CreateDatabaseCommand implements DatabaseCommand {

    private final String name;
    private final ExecutionEnvironment environment;

    public CreateDatabaseCommand(ExecutionEnvironment environment, String name) {
        this.environment = environment;
        this.name = name;
    }

    @Override
    public DatabaseCommandResult execute() throws DatabaseException {

        environment.addDatabase(null); // это заглушка
        return DatabaseCommandResult.success("Database was successfully created");
    }
}