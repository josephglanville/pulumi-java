// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetRuntimeConfigurationServerProcessGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetRuntimeConfigurationServerProcessGetArgs Empty = new FleetRuntimeConfigurationServerProcessGetArgs();

    /**
     * Number of server processes using this configuration to run concurrently on an instance.
     * 
     */
    @Import(name="concurrentExecutions", required=true)
      private final Output<Integer> concurrentExecutions;

    public Output<Integer> getConcurrentExecutions() {
        return this.concurrentExecutions;
    }

    /**
     * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances `C:\game`, and for Linux instances `/local/game`.
     * 
     */
    @Import(name="launchPath", required=true)
      private final Output<String> launchPath;

    public Output<String> getLaunchPath() {
        return this.launchPath;
    }

    /**
     * Optional list of parameters to pass to the server executable on launch.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<String> parameters;

    public Output<String> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    public FleetRuntimeConfigurationServerProcessGetArgs(
        Output<Integer> concurrentExecutions,
        Output<String> launchPath,
        @Nullable Output<String> parameters) {
        this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions, "expected parameter 'concurrentExecutions' to be non-null");
        this.launchPath = Objects.requireNonNull(launchPath, "expected parameter 'launchPath' to be non-null");
        this.parameters = parameters;
    }

    private FleetRuntimeConfigurationServerProcessGetArgs() {
        this.concurrentExecutions = Codegen.empty();
        this.launchPath = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetRuntimeConfigurationServerProcessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> concurrentExecutions;
        private Output<String> launchPath;
        private @Nullable Output<String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetRuntimeConfigurationServerProcessGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrentExecutions = defaults.concurrentExecutions;
    	      this.launchPath = defaults.launchPath;
    	      this.parameters = defaults.parameters;
        }

        public Builder concurrentExecutions(Output<Integer> concurrentExecutions) {
            this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions);
            return this;
        }
        public Builder concurrentExecutions(Integer concurrentExecutions) {
            this.concurrentExecutions = Output.of(Objects.requireNonNull(concurrentExecutions));
            return this;
        }
        public Builder launchPath(Output<String> launchPath) {
            this.launchPath = Objects.requireNonNull(launchPath);
            return this;
        }
        public Builder launchPath(String launchPath) {
            this.launchPath = Output.of(Objects.requireNonNull(launchPath));
            return this;
        }
        public Builder parameters(@Nullable Output<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }        public FleetRuntimeConfigurationServerProcessGetArgs build() {
            return new FleetRuntimeConfigurationServerProcessGetArgs(concurrentExecutions, launchPath, parameters);
        }
    }
}
