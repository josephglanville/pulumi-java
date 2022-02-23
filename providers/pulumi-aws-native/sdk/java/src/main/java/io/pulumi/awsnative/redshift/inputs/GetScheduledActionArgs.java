// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledActionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduledActionArgs Empty = new GetScheduledActionArgs();

    /**
     * The name of the scheduled action. The name must be unique within an account.
     * 
     */
    @InputImport(name="scheduledActionName", required=true)
      private final String scheduledActionName;

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    public GetScheduledActionArgs(String scheduledActionName) {
        this.scheduledActionName = Objects.requireNonNull(scheduledActionName, "expected parameter 'scheduledActionName' to be non-null");
    }

    private GetScheduledActionArgs() {
        this.scheduledActionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduledActionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduledActionName = defaults.scheduledActionName;
        }

        public Builder setScheduledActionName(String scheduledActionName) {
            this.scheduledActionName = Objects.requireNonNull(scheduledActionName);
            return this;
        }
        public GetScheduledActionArgs build() {
            return new GetScheduledActionArgs(scheduledActionName);
        }
    }
}
