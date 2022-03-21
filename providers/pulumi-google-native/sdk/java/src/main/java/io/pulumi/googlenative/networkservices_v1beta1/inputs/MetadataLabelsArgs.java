// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines a name-pair value for a single label.
 * 
 */
public final class MetadataLabelsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataLabelsArgs Empty = new MetadataLabelsArgs();

    /**
     * Label name presented as key in xDS Node Metadata.
     * 
     */
    @Import(name="labelName", required=true)
      private final Output<String> labelName;

    public Output<String> getLabelName() {
        return this.labelName;
    }

    /**
     * Label value presented as value corresponding to the above key, in xDS Node Metadata.
     * 
     */
    @Import(name="labelValue", required=true)
      private final Output<String> labelValue;

    public Output<String> getLabelValue() {
        return this.labelValue;
    }

    public MetadataLabelsArgs(
        Output<String> labelName,
        Output<String> labelValue) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
        this.labelValue = Objects.requireNonNull(labelValue, "expected parameter 'labelValue' to be non-null");
    }

    private MetadataLabelsArgs() {
        this.labelName = Output.empty();
        this.labelValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataLabelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> labelName;
        private Output<String> labelValue;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataLabelsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
    	      this.labelValue = defaults.labelValue;
        }

        public Builder labelName(Output<String> labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }
        public Builder labelName(String labelName) {
            this.labelName = Output.of(Objects.requireNonNull(labelName));
            return this;
        }
        public Builder labelValue(Output<String> labelValue) {
            this.labelValue = Objects.requireNonNull(labelValue);
            return this;
        }
        public Builder labelValue(String labelValue) {
            this.labelValue = Output.of(Objects.requireNonNull(labelValue));
            return this;
        }        public MetadataLabelsArgs build() {
            return new MetadataLabelsArgs(labelName, labelValue);
        }
    }
}
