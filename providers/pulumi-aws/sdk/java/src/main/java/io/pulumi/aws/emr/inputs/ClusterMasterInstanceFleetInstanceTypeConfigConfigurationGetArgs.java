// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs Empty = new ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs();

    /**
     * Classification within a configuration.
     * 
     */
    @InputImport(name="classification")
      private final @Nullable Output<String> classification;

    public Output<String> getClassification() {
        return this.classification == null ? Output.empty() : this.classification;
    }

    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Output<Map<String,Object>> properties;

    public Output<Map<String,Object>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    public ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs(
        @Nullable Output<String> classification,
        @Nullable Output<Map<String,Object>> properties) {
        this.classification = classification;
        this.properties = properties;
    }

    private ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs() {
        this.classification = Output.empty();
        this.properties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> classification;
        private @Nullable Output<Map<String,Object>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.properties = defaults.properties;
        }

        public Builder classification(@Nullable Output<String> classification) {
            this.classification = classification;
            return this;
        }

        public Builder classification(@Nullable String classification) {
            this.classification = Output.ofNullable(classification);
            return this;
        }

        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Map<String,Object> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs build() {
            return new ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs(classification, properties);
        }
    }
}
