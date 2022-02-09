// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import io.pulumi.azurenative.datamigration.inputs.ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse;
import io.pulumi.azurenative.datamigration.inputs.ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse Empty = new ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse();

    @InputImport(name="commands", required=true)
    private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> getCommands() {
        return this.commands;
    }

    @InputImport(name="errors", required=true)
    private final List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }

    @InputImport(name="input")
    private final @Nullable ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse input;

    public Optional<ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse> getInput() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    @InputImport(name="output", required=true)
    private final List<ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse> output;

    public List<ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse> getOutput() {
        return this.output;
    }

    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    @InputImport(name="taskType", required=true)
    private final String taskType;

    public String getTaskType() {
        return this.taskType;
    }

    public ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse(
        List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        List<ODataErrorResponse> errors,
        @Nullable ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse input,
        List<ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse> output,
        String state,
        String taskType) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.input = input;
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse() {
        this.commands = List.of();
        this.errors = List.of();
        this.input = null;
        this.output = List.of();
        this.state = null;
        this.taskType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse input;
        private List<ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
    	      this.taskType = defaults.taskType;
        }

        public Builder setCommands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder setErrors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setInput(@Nullable ValidateMigrationInputSqlServerSqlMISyncTaskInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder setOutput(List<ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTaskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse build() {
            return new ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
