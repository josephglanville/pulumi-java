// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.licensemanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssociationArgs Empty = new AssociationArgs();

    /**
     * ARN of the license configuration.
     * 
     */
    @InputImport(name="licenseConfigurationArn", required=true)
      private final Output<String> licenseConfigurationArn;

    public Output<String> getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * ARN of the resource associated with the license configuration.
     * 
     */
    @InputImport(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    public AssociationArgs(
        Output<String> licenseConfigurationArn,
        Output<String> resourceArn) {
        this.licenseConfigurationArn = Objects.requireNonNull(licenseConfigurationArn, "expected parameter 'licenseConfigurationArn' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private AssociationArgs() {
        this.licenseConfigurationArn = Output.empty();
        this.resourceArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> licenseConfigurationArn;
        private Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenseConfigurationArn = defaults.licenseConfigurationArn;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder licenseConfigurationArn(Output<String> licenseConfigurationArn) {
            this.licenseConfigurationArn = Objects.requireNonNull(licenseConfigurationArn);
            return this;
        }

        public Builder licenseConfigurationArn(String licenseConfigurationArn) {
            this.licenseConfigurationArn = Output.of(Objects.requireNonNull(licenseConfigurationArn));
            return this;
        }

        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public AssociationArgs build() {
            return new AssociationArgs(licenseConfigurationArn, resourceArn);
        }
    }
}
