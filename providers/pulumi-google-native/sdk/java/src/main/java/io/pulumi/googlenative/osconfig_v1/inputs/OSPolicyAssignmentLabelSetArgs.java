// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message representing label set. * A label is a key value pair set for a VM. * A LabelSet is a set of labels. * Labels within a LabelSet are ANDed. In other words, a LabelSet is applicable for a VM only if it matches all the labels in the LabelSet. * Example: A LabelSet with 2 labels: `env=prod` and `type=webserver` will only be applicable for those VMs with both labels present.
 * 
 */
public final class OSPolicyAssignmentLabelSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyAssignmentLabelSetArgs Empty = new OSPolicyAssignmentLabelSetArgs();

    /**
     * Labels are identified by key/value pairs in this map. A VM should contain all the key/value pairs specified in this map to be selected.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    public OSPolicyAssignmentLabelSetArgs(@Nullable Output<Map<String,String>> labels) {
        this.labels = labels;
    }

    private OSPolicyAssignmentLabelSetArgs() {
        this.labels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentLabelSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentLabelSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }        public OSPolicyAssignmentLabelSetArgs build() {
            return new OSPolicyAssignmentLabelSetArgs(labels);
        }
    }
}
