// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of instructions for launching server processes on each instance in a fleet. Each instruction set identifies the location of the server executable, optional launch parameters, and the number of server processes with this configuration to maintain concurrently on the instance. Server process configurations make up a fleet's RuntimeConfiguration.
 * 
 */
public final class FleetServerProcessArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetServerProcessArgs Empty = new FleetServerProcessArgs();

    /**
     * The number of server processes that use this configuration to run concurrently on an instance.
     * 
     */
    @InputImport(name="concurrentExecutions", required=true)
      private final Output<Integer> concurrentExecutions;

    public Output<Integer> getConcurrentExecutions() {
        return this.concurrentExecutions;
    }

    /**
     * The location of the server executable in a custom game build or the name of the Realtime script file that contains the Init() function. Game builds and Realtime scripts are installed on instances at the root:
     * 
     * Windows (for custom game builds only): C:\game. Example: "C:\game\MyGame\server.exe"
     * 
     * Linux: /local/game. Examples: "/local/game/MyGame/server.exe" or "/local/game/MyRealtimeScript.js"
     * 
     */
    @InputImport(name="launchPath", required=true)
      private final Output<String> launchPath;

    public Output<String> getLaunchPath() {
        return this.launchPath;
    }

    /**
     * An optional list of parameters to pass to the server executable or Realtime script on launch.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Output<String> parameters;

    public Output<String> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    public FleetServerProcessArgs(
        Output<Integer> concurrentExecutions,
        Output<String> launchPath,
        @Nullable Output<String> parameters) {
        this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions, "expected parameter 'concurrentExecutions' to be non-null");
        this.launchPath = Objects.requireNonNull(launchPath, "expected parameter 'launchPath' to be non-null");
        this.parameters = parameters;
    }

    private FleetServerProcessArgs() {
        this.concurrentExecutions = Output.empty();
        this.launchPath = Output.empty();
        this.parameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetServerProcessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> concurrentExecutions;
        private Output<String> launchPath;
        private @Nullable Output<String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetServerProcessArgs defaults) {
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
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public FleetServerProcessArgs build() {
            return new FleetServerProcessArgs(concurrentExecutions, launchPath, parameters);
        }
    }
}
