// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class JobSparksqlConfigLoggingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSparksqlConfigLoggingConfigGetArgs Empty = new JobSparksqlConfigLoggingConfigGetArgs();

    @Import(name="driverLogLevels", required=true)
      private final Output<Map<String,String>> driverLogLevels;

    public Output<Map<String,String>> getDriverLogLevels() {
        return this.driverLogLevels;
    }

    public JobSparksqlConfigLoggingConfigGetArgs(Output<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = Objects.requireNonNull(driverLogLevels, "expected parameter 'driverLogLevels' to be non-null");
    }

    private JobSparksqlConfigLoggingConfigGetArgs() {
        this.driverLogLevels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparksqlConfigLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparksqlConfigLoggingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(Output<Map<String,String>> driverLogLevels) {
            this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
            return this;
        }
        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            this.driverLogLevels = Output.of(Objects.requireNonNull(driverLogLevels));
            return this;
        }        public JobSparksqlConfigLoggingConfigGetArgs build() {
            return new JobSparksqlConfigLoggingConfigGetArgs(driverLogLevels);
        }
    }
}
