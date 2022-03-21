// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ApplicationFeatureSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationFeatureSettingsArgs Empty = new ApplicationFeatureSettingsArgs();

    /**
     * Set to false to use the legacy health check instead of the readiness
     * and liveness checks.
     * 
     */
    @Import(name="splitHealthChecks", required=true)
      private final Output<Boolean> splitHealthChecks;

    public Output<Boolean> getSplitHealthChecks() {
        return this.splitHealthChecks;
    }

    public ApplicationFeatureSettingsArgs(Output<Boolean> splitHealthChecks) {
        this.splitHealthChecks = Objects.requireNonNull(splitHealthChecks, "expected parameter 'splitHealthChecks' to be non-null");
    }

    private ApplicationFeatureSettingsArgs() {
        this.splitHealthChecks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationFeatureSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> splitHealthChecks;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationFeatureSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitHealthChecks = defaults.splitHealthChecks;
        }

        public Builder splitHealthChecks(Output<Boolean> splitHealthChecks) {
            this.splitHealthChecks = Objects.requireNonNull(splitHealthChecks);
            return this;
        }
        public Builder splitHealthChecks(Boolean splitHealthChecks) {
            this.splitHealthChecks = Output.of(Objects.requireNonNull(splitHealthChecks));
            return this;
        }        public ApplicationFeatureSettingsArgs build() {
            return new ApplicationFeatureSettingsArgs(splitHealthChecks);
        }
    }
}
