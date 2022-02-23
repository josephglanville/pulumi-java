// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRegistrationActivationKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistrationActivationKeyArgs Empty = new GetRegistrationActivationKeyArgs();

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @InputImport(name="registrationName", required=true)
      private final String registrationName;

    public String getRegistrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @InputImport(name="resourceGroup", required=true)
      private final String resourceGroup;

    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public GetRegistrationActivationKeyArgs(
        String registrationName,
        String resourceGroup) {
        this.registrationName = Objects.requireNonNull(registrationName, "expected parameter 'registrationName' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private GetRegistrationActivationKeyArgs() {
        this.registrationName = null;
        this.resourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationActivationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registrationName;
        private String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationActivationKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registrationName = defaults.registrationName;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder setRegistrationName(String registrationName) {
            this.registrationName = Objects.requireNonNull(registrationName);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public GetRegistrationActivationKeyArgs build() {
            return new GetRegistrationActivationKeyArgs(registrationName, resourceGroup);
        }
    }
}
