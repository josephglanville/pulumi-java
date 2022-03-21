// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTrackerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTrackerArgs Empty = new GetTrackerArgs();

    @Import(name="trackerName", required=true)
      private final String trackerName;

    public String getTrackerName() {
        return this.trackerName;
    }

    public GetTrackerArgs(String trackerName) {
        this.trackerName = Objects.requireNonNull(trackerName, "expected parameter 'trackerName' to be non-null");
    }

    private GetTrackerArgs() {
        this.trackerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrackerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String trackerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrackerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackerName = defaults.trackerName;
        }

        public Builder trackerName(String trackerName) {
            this.trackerName = Objects.requireNonNull(trackerName);
            return this;
        }        public GetTrackerArgs build() {
            return new GetTrackerArgs(trackerName);
        }
    }
}
