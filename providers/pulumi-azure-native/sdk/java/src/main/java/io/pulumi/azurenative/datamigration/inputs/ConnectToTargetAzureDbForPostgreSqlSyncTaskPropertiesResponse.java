// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse;
import io.pulumi.azurenative.datamigration.inputs.ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure Database For PostgreSQL server and target server requirements for online migration
 * 
 */
public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse Empty = new ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse();

    /**
     * Array of command properties.
     * 
     */
    @InputImport(name="commands", required=true)
      private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> getCommands() {
        return this.commands;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @InputImport(name="errors", required=true)
      private final List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
      private final @Nullable ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse input;

    public Optional<ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse> getInput() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    /**
     * Task output. This is ignored if submitted.
     * 
     */
    @InputImport(name="output", required=true)
      private final List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> output;

    public List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> getOutput() {
        return this.output;
    }

    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Task type.
     * Expected value is 'ConnectToTarget.AzureDbForPostgreSql.Sync'.
     * 
     */
    @InputImport(name="taskType", required=true)
      private final String taskType;

    public String getTaskType() {
        return this.taskType;
    }

    public ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse(
        List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        List<ODataErrorResponse> errors,
        @Nullable ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse input,
        List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> output,
        String state,
        String taskType) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.input = input;
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse() {
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

    public static Builder builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse input;
        private List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse defaults) {
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

        public Builder setInput(@Nullable ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder setOutput(List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> output) {
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
        public ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse build() {
            return new ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
