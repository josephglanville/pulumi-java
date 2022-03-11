// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMITaskInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for task that migrates SQL Server databases to Azure SQL Database Managed Instance
 * 
 */
public final class MigrateSqlServerSqlMITaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlMITaskPropertiesArgs Empty = new MigrateSqlServerSqlMITaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
      private final @Nullable Output<MigrateSqlServerSqlMITaskInputArgs> input;

    public Output<MigrateSqlServerSqlMITaskInputArgs> getInput() {
        return this.input == null ? Output.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.AzureSqlDbMI'.
     * 
     */
    @InputImport(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> getTaskType() {
        return this.taskType;
    }

    public MigrateSqlServerSqlMITaskPropertiesArgs(
        @Nullable Output<MigrateSqlServerSqlMITaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private MigrateSqlServerSqlMITaskPropertiesArgs() {
        this.input = Output.empty();
        this.taskType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MigrateSqlServerSqlMITaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<MigrateSqlServerSqlMITaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable MigrateSqlServerSqlMITaskInputArgs input) {
            this.input = Output.ofNullable(input);
            return this;
        }

        public Builder taskType(Output<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder taskType(String taskType) {
            this.taskType = Output.of(Objects.requireNonNull(taskType));
            return this;
        }
        public MigrateSqlServerSqlMITaskPropertiesArgs build() {
            return new MigrateSqlServerSqlMITaskPropertiesArgs(input, taskType);
        }
    }
}
