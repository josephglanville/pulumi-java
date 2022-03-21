// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container identity information
 * 
 */
public final class ContainerIdentityInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerIdentityInfoArgs Empty = new ContainerIdentityInfoArgs();

    /**
     * Protection container identity - AAD Tenant
     * 
     */
    @Import(name="aadTenantId")
      private final @Nullable Output<String> aadTenantId;

    public Output<String> getAadTenantId() {
        return this.aadTenantId == null ? Output.empty() : this.aadTenantId;
    }

    /**
     * Protection container identity - Audience
     * 
     */
    @Import(name="audience")
      private final @Nullable Output<String> audience;

    public Output<String> getAudience() {
        return this.audience == null ? Output.empty() : this.audience;
    }

    /**
     * Protection container identity - AAD Service Principal
     * 
     */
    @Import(name="servicePrincipalClientId")
      private final @Nullable Output<String> servicePrincipalClientId;

    public Output<String> getServicePrincipalClientId() {
        return this.servicePrincipalClientId == null ? Output.empty() : this.servicePrincipalClientId;
    }

    /**
     * Unique name of the container
     * 
     */
    @Import(name="uniqueName")
      private final @Nullable Output<String> uniqueName;

    public Output<String> getUniqueName() {
        return this.uniqueName == null ? Output.empty() : this.uniqueName;
    }

    public ContainerIdentityInfoArgs(
        @Nullable Output<String> aadTenantId,
        @Nullable Output<String> audience,
        @Nullable Output<String> servicePrincipalClientId,
        @Nullable Output<String> uniqueName) {
        this.aadTenantId = aadTenantId;
        this.audience = audience;
        this.servicePrincipalClientId = servicePrincipalClientId;
        this.uniqueName = uniqueName;
    }

    private ContainerIdentityInfoArgs() {
        this.aadTenantId = Output.empty();
        this.audience = Output.empty();
        this.servicePrincipalClientId = Output.empty();
        this.uniqueName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerIdentityInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aadTenantId;
        private @Nullable Output<String> audience;
        private @Nullable Output<String> servicePrincipalClientId;
        private @Nullable Output<String> uniqueName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerIdentityInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.audience = defaults.audience;
    	      this.servicePrincipalClientId = defaults.servicePrincipalClientId;
    	      this.uniqueName = defaults.uniqueName;
        }

        public Builder aadTenantId(@Nullable Output<String> aadTenantId) {
            this.aadTenantId = aadTenantId;
            return this;
        }
        public Builder aadTenantId(@Nullable String aadTenantId) {
            this.aadTenantId = Output.ofNullable(aadTenantId);
            return this;
        }
        public Builder audience(@Nullable Output<String> audience) {
            this.audience = audience;
            return this;
        }
        public Builder audience(@Nullable String audience) {
            this.audience = Output.ofNullable(audience);
            return this;
        }
        public Builder servicePrincipalClientId(@Nullable Output<String> servicePrincipalClientId) {
            this.servicePrincipalClientId = servicePrincipalClientId;
            return this;
        }
        public Builder servicePrincipalClientId(@Nullable String servicePrincipalClientId) {
            this.servicePrincipalClientId = Output.ofNullable(servicePrincipalClientId);
            return this;
        }
        public Builder uniqueName(@Nullable Output<String> uniqueName) {
            this.uniqueName = uniqueName;
            return this;
        }
        public Builder uniqueName(@Nullable String uniqueName) {
            this.uniqueName = Output.ofNullable(uniqueName);
            return this;
        }        public ContainerIdentityInfoArgs build() {
            return new ContainerIdentityInfoArgs(aadTenantId, audience, servicePrincipalClientId, uniqueName);
        }
    }
}
