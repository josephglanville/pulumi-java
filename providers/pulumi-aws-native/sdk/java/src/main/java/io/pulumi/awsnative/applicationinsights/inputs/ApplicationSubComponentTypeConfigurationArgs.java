// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationSubComponentTypeConfigurationSubComponentType;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationSubComponentConfigurationDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * One type sub component configurations for the component.
 * 
 */
public final class ApplicationSubComponentTypeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationSubComponentTypeConfigurationArgs Empty = new ApplicationSubComponentTypeConfigurationArgs();

    /**
     * The configuration settings of sub components.
     * 
     */
    @Import(name="subComponentConfigurationDetails", required=true)
      private final Output<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails;

    public Output<ApplicationSubComponentConfigurationDetailsArgs> getSubComponentConfigurationDetails() {
        return this.subComponentConfigurationDetails;
    }

    /**
     * The sub component type.
     * 
     */
    @Import(name="subComponentType", required=true)
      private final Output<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType;

    public Output<ApplicationSubComponentTypeConfigurationSubComponentType> getSubComponentType() {
        return this.subComponentType;
    }

    public ApplicationSubComponentTypeConfigurationArgs(
        Output<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails,
        Output<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType) {
        this.subComponentConfigurationDetails = Objects.requireNonNull(subComponentConfigurationDetails, "expected parameter 'subComponentConfigurationDetails' to be non-null");
        this.subComponentType = Objects.requireNonNull(subComponentType, "expected parameter 'subComponentType' to be non-null");
    }

    private ApplicationSubComponentTypeConfigurationArgs() {
        this.subComponentConfigurationDetails = Output.empty();
        this.subComponentType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSubComponentTypeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails;
        private Output<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSubComponentTypeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subComponentConfigurationDetails = defaults.subComponentConfigurationDetails;
    	      this.subComponentType = defaults.subComponentType;
        }

        public Builder subComponentConfigurationDetails(Output<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails) {
            this.subComponentConfigurationDetails = Objects.requireNonNull(subComponentConfigurationDetails);
            return this;
        }
        public Builder subComponentConfigurationDetails(ApplicationSubComponentConfigurationDetailsArgs subComponentConfigurationDetails) {
            this.subComponentConfigurationDetails = Output.of(Objects.requireNonNull(subComponentConfigurationDetails));
            return this;
        }
        public Builder subComponentType(Output<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType) {
            this.subComponentType = Objects.requireNonNull(subComponentType);
            return this;
        }
        public Builder subComponentType(ApplicationSubComponentTypeConfigurationSubComponentType subComponentType) {
            this.subComponentType = Output.of(Objects.requireNonNull(subComponentType));
            return this;
        }        public ApplicationSubComponentTypeConfigurationArgs build() {
            return new ApplicationSubComponentTypeConfigurationArgs(subComponentConfigurationDetails, subComponentType);
        }
    }
}
