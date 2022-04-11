// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The JIT scheduling policies.
 * 
 */
public final class JitSchedulingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JitSchedulingPolicyArgs Empty = new JitSchedulingPolicyArgs();

    @Import(name="duration", required=true)
      private final Output<String> duration;

    public Output<String> getDuration() {
        return this.duration;
    }

    /**
     * The start time of the request.
     * 
     */
    @Import(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    public JitSchedulingPolicyArgs(
        Output<String> duration,
        Output<String> startTime) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private JitSchedulingPolicyArgs() {
        this.duration = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> duration;
        private Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(JitSchedulingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder duration(Output<String> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Output.of(Objects.requireNonNull(duration));
            return this;
        }
        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }        public JitSchedulingPolicyArgs build() {
            return new JitSchedulingPolicyArgs(duration, startTime);
        }
    }
}
