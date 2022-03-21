// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.quantum.inputs;

import io.pulumi.azurenative.quantum.enums.Status;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about a Provider. A Provider is an entity that offers Targets to run Azure Quantum Jobs.
 * 
 */
public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The provider's marketplace application display name.
     * 
     */
    @Import(name="applicationName")
      private final @Nullable Output<String> applicationName;

    public Output<String> getApplicationName() {
        return this.applicationName == null ? Output.empty() : this.applicationName;
    }

    /**
     * A Uri identifying the specific instance of this provider.
     * 
     */
    @Import(name="instanceUri")
      private final @Nullable Output<String> instanceUri;

    public Output<String> getInstanceUri() {
        return this.instanceUri == null ? Output.empty() : this.instanceUri;
    }

    /**
     * Unique id of this provider.
     * 
     */
    @Import(name="providerId")
      private final @Nullable Output<String> providerId;

    public Output<String> getProviderId() {
        return this.providerId == null ? Output.empty() : this.providerId;
    }

    /**
     * The sku associated with pricing information for this provider.
     * 
     */
    @Import(name="providerSku")
      private final @Nullable Output<String> providerSku;

    public Output<String> getProviderSku() {
        return this.providerSku == null ? Output.empty() : this.providerSku;
    }

    /**
     * Provisioning status field
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,Status>> provisioningState;

    public Output<Either<String,Status>> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * Id to track resource usage for the provider.
     * 
     */
    @Import(name="resourceUsageId")
      private final @Nullable Output<String> resourceUsageId;

    public Output<String> getResourceUsageId() {
        return this.resourceUsageId == null ? Output.empty() : this.resourceUsageId;
    }

    public ProviderArgs(
        @Nullable Output<String> applicationName,
        @Nullable Output<String> instanceUri,
        @Nullable Output<String> providerId,
        @Nullable Output<String> providerSku,
        @Nullable Output<Either<String,Status>> provisioningState,
        @Nullable Output<String> resourceUsageId) {
        this.applicationName = applicationName;
        this.instanceUri = instanceUri;
        this.providerId = providerId;
        this.providerSku = providerSku;
        this.provisioningState = provisioningState;
        this.resourceUsageId = resourceUsageId;
    }

    private ProviderArgs() {
        this.applicationName = Output.empty();
        this.instanceUri = Output.empty();
        this.providerId = Output.empty();
        this.providerSku = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceUsageId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationName;
        private @Nullable Output<String> instanceUri;
        private @Nullable Output<String> providerId;
        private @Nullable Output<String> providerSku;
        private @Nullable Output<Either<String,Status>> provisioningState;
        private @Nullable Output<String> resourceUsageId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.instanceUri = defaults.instanceUri;
    	      this.providerId = defaults.providerId;
    	      this.providerSku = defaults.providerSku;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceUsageId = defaults.resourceUsageId;
        }

        public Builder applicationName(@Nullable Output<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public Builder applicationName(@Nullable String applicationName) {
            this.applicationName = Output.ofNullable(applicationName);
            return this;
        }
        public Builder instanceUri(@Nullable Output<String> instanceUri) {
            this.instanceUri = instanceUri;
            return this;
        }
        public Builder instanceUri(@Nullable String instanceUri) {
            this.instanceUri = Output.ofNullable(instanceUri);
            return this;
        }
        public Builder providerId(@Nullable Output<String> providerId) {
            this.providerId = providerId;
            return this;
        }
        public Builder providerId(@Nullable String providerId) {
            this.providerId = Output.ofNullable(providerId);
            return this;
        }
        public Builder providerSku(@Nullable Output<String> providerSku) {
            this.providerSku = providerSku;
            return this;
        }
        public Builder providerSku(@Nullable String providerSku) {
            this.providerSku = Output.ofNullable(providerSku);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,Status>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,Status> provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
            return this;
        }
        public Builder resourceUsageId(@Nullable Output<String> resourceUsageId) {
            this.resourceUsageId = resourceUsageId;
            return this;
        }
        public Builder resourceUsageId(@Nullable String resourceUsageId) {
            this.resourceUsageId = Output.ofNullable(resourceUsageId);
            return this;
        }        public ProviderArgs build() {
            return new ProviderArgs(applicationName, instanceUri, providerId, providerSku, provisioningState, resourceUsageId);
        }
    }
}
