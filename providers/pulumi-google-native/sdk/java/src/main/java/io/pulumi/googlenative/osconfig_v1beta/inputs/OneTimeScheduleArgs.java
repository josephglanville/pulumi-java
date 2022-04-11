// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Sets the time for a one time patch deployment. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
 * 
 */
public final class OneTimeScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final OneTimeScheduleArgs Empty = new OneTimeScheduleArgs();

    /**
     * The desired patch job execution time.
     * 
     */
    @Import(name="executeTime", required=true)
      private final Output<String> executeTime;

    public Output<String> getExecuteTime() {
        return this.executeTime;
    }

    public OneTimeScheduleArgs(Output<String> executeTime) {
        this.executeTime = Objects.requireNonNull(executeTime, "expected parameter 'executeTime' to be non-null");
    }

    private OneTimeScheduleArgs() {
        this.executeTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneTimeScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> executeTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OneTimeScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
        }

        public Builder executeTime(Output<String> executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }
        public Builder executeTime(String executeTime) {
            this.executeTime = Output.of(Objects.requireNonNull(executeTime));
            return this;
        }        public OneTimeScheduleArgs build() {
            return new OneTimeScheduleArgs(executeTime);
        }
    }
}
