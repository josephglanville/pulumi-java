// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GuestPoliciesAssignmentGroupLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentGroupLabelArgs Empty = new GuestPoliciesAssignmentGroupLabelArgs();

    /**
     * Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
     * 
     */
    @Import(name="labels", required=true)
      private final Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }

    public GuestPoliciesAssignmentGroupLabelArgs(Output<Map<String,String>> labels) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private GuestPoliciesAssignmentGroupLabelArgs() {
        this.labels = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignmentGroupLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignmentGroupLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(Output<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Output.of(Objects.requireNonNull(labels));
            return this;
        }        public GuestPoliciesAssignmentGroupLabelArgs build() {
            return new GuestPoliciesAssignmentGroupLabelArgs(labels);
        }
    }
}
