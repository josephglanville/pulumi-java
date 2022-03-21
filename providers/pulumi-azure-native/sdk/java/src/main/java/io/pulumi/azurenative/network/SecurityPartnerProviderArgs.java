// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.SecurityProviderName;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPartnerProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPartnerProviderArgs Empty = new SecurityPartnerProviderArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Security Partner Provider.
     * 
     */
    @Import(name="securityPartnerProviderName")
      private final @Nullable Output<String> securityPartnerProviderName;

    public Output<String> getSecurityPartnerProviderName() {
        return this.securityPartnerProviderName == null ? Output.empty() : this.securityPartnerProviderName;
    }

    /**
     * The security provider name.
     * 
     */
    @Import(name="securityProviderName")
      private final @Nullable Output<Either<String,SecurityProviderName>> securityProviderName;

    public Output<Either<String,SecurityProviderName>> getSecurityProviderName() {
        return this.securityProviderName == null ? Output.empty() : this.securityProviderName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The virtualHub to which the Security Partner Provider belongs.
     * 
     */
    @Import(name="virtualHub")
      private final @Nullable Output<SubResourceArgs> virtualHub;

    public Output<SubResourceArgs> getVirtualHub() {
        return this.virtualHub == null ? Output.empty() : this.virtualHub;
    }

    public SecurityPartnerProviderArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> securityPartnerProviderName,
        @Nullable Output<Either<String,SecurityProviderName>> securityProviderName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<SubResourceArgs> virtualHub) {
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityPartnerProviderName = securityPartnerProviderName;
        this.securityProviderName = securityProviderName;
        this.tags = tags;
        this.virtualHub = virtualHub;
    }

    private SecurityPartnerProviderArgs() {
        this.id = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.securityPartnerProviderName = Output.empty();
        this.securityProviderName = Output.empty();
        this.tags = Output.empty();
        this.virtualHub = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPartnerProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> securityPartnerProviderName;
        private @Nullable Output<Either<String,SecurityProviderName>> securityProviderName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<SubResourceArgs> virtualHub;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPartnerProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityPartnerProviderName = defaults.securityPartnerProviderName;
    	      this.securityProviderName = defaults.securityProviderName;
    	      this.tags = defaults.tags;
    	      this.virtualHub = defaults.virtualHub;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder securityPartnerProviderName(@Nullable Output<String> securityPartnerProviderName) {
            this.securityPartnerProviderName = securityPartnerProviderName;
            return this;
        }
        public Builder securityPartnerProviderName(@Nullable String securityPartnerProviderName) {
            this.securityPartnerProviderName = Output.ofNullable(securityPartnerProviderName);
            return this;
        }
        public Builder securityProviderName(@Nullable Output<Either<String,SecurityProviderName>> securityProviderName) {
            this.securityProviderName = securityProviderName;
            return this;
        }
        public Builder securityProviderName(@Nullable Either<String,SecurityProviderName> securityProviderName) {
            this.securityProviderName = Output.ofNullable(securityProviderName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder virtualHub(@Nullable Output<SubResourceArgs> virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }
        public Builder virtualHub(@Nullable SubResourceArgs virtualHub) {
            this.virtualHub = Output.ofNullable(virtualHub);
            return this;
        }        public SecurityPartnerProviderArgs build() {
            return new SecurityPartnerProviderArgs(id, location, resourceGroupName, securityPartnerProviderName, securityProviderName, tags, virtualHub);
        }
    }
}
