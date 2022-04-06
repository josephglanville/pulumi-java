// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersRdsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersRdsArgs Empty = new DataSourceParametersRdsArgs();

    /**
     * The database to which to connect.
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> getDatabase() {
        return this.database;
    }

    /**
     * The instance ID to which to connect.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    public DataSourceParametersRdsArgs(
        Output<String> database,
        Output<String> instanceId) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
    }

    private DataSourceParametersRdsArgs() {
        this.database = Output.empty();
        this.instanceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersRdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> database;
        private Output<String> instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersRdsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }        public DataSourceParametersRdsArgs build() {
            return new DataSourceParametersRdsArgs(database, instanceId);
        }
    }
}