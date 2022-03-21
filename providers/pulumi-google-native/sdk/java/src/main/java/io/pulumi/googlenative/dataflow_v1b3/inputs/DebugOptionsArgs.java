// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes any options that have an effect on the debugging of pipelines.
 * 
 */
public final class DebugOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DebugOptionsArgs Empty = new DebugOptionsArgs();

    /**
     * When true, enables the logging of the literal hot key to the user's Cloud Logging.
     * 
     */
    @Import(name="enableHotKeyLogging")
      private final @Nullable Output<Boolean> enableHotKeyLogging;

    public Output<Boolean> getEnableHotKeyLogging() {
        return this.enableHotKeyLogging == null ? Output.empty() : this.enableHotKeyLogging;
    }

    public DebugOptionsArgs(@Nullable Output<Boolean> enableHotKeyLogging) {
        this.enableHotKeyLogging = enableHotKeyLogging;
    }

    private DebugOptionsArgs() {
        this.enableHotKeyLogging = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DebugOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableHotKeyLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(DebugOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHotKeyLogging = defaults.enableHotKeyLogging;
        }

        public Builder enableHotKeyLogging(@Nullable Output<Boolean> enableHotKeyLogging) {
            this.enableHotKeyLogging = enableHotKeyLogging;
            return this;
        }
        public Builder enableHotKeyLogging(@Nullable Boolean enableHotKeyLogging) {
            this.enableHotKeyLogging = Output.ofNullable(enableHotKeyLogging);
            return this;
        }        public DebugOptionsArgs build() {
            return new DebugOptionsArgs(enableHotKeyLogging);
        }
    }
}
