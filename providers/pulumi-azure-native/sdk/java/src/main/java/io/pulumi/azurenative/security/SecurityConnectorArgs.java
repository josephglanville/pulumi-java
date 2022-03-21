// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.enums.CloudName;
import io.pulumi.azurenative.security.inputs.CspmMonitorAwsOfferingArgs;
import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingArgs;
import io.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingArgs;
import io.pulumi.azurenative.security.inputs.SecurityConnectorPropertiesOrganizationalDataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConnectorArgs Empty = new SecurityConnectorArgs();

    /**
     * The multi cloud resource's cloud name.
     * 
     */
    @Import(name="cloudName")
      private final @Nullable Output<Either<String,CloudName>> cloudName;

    public Output<Either<String,CloudName>> getCloudName() {
        return this.cloudName == null ? Output.empty() : this.cloudName;
    }

    /**
     * The multi cloud resource identifier (account id in case of AWS connector).
     * 
     */
    @Import(name="hierarchyIdentifier")
      private final @Nullable Output<String> hierarchyIdentifier;

    public Output<String> getHierarchyIdentifier() {
        return this.hierarchyIdentifier == null ? Output.empty() : this.hierarchyIdentifier;
    }

    /**
     * Kind of the resource
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Location where the resource is stored
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * A collection of offerings for the security connector.
     * 
     */
    @Import(name="offerings")
      private final @Nullable Output<List<Object>> offerings;

    public Output<List<Object>> getOfferings() {
        return this.offerings == null ? Output.empty() : this.offerings;
    }

    /**
     * The multi cloud account's organizational data
     * 
     */
    @Import(name="organizationalData")
      private final @Nullable Output<SecurityConnectorPropertiesOrganizationalDataArgs> organizationalData;

    public Output<SecurityConnectorPropertiesOrganizationalDataArgs> getOrganizationalData() {
        return this.organizationalData == null ? Output.empty() : this.organizationalData;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The security connector name.
     * 
     */
    @Import(name="securityConnectorName")
      private final @Nullable Output<String> securityConnectorName;

    public Output<String> getSecurityConnectorName() {
        return this.securityConnectorName == null ? Output.empty() : this.securityConnectorName;
    }

    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SecurityConnectorArgs(
        @Nullable Output<Either<String,CloudName>> cloudName,
        @Nullable Output<String> hierarchyIdentifier,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<List<Object>> offerings,
        @Nullable Output<SecurityConnectorPropertiesOrganizationalDataArgs> organizationalData,
        Output<String> resourceGroupName,
        @Nullable Output<String> securityConnectorName,
        @Nullable Output<Map<String,String>> tags) {
        this.cloudName = cloudName;
        this.hierarchyIdentifier = hierarchyIdentifier;
        this.kind = kind;
        this.location = location;
        this.offerings = offerings;
        this.organizationalData = organizationalData;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityConnectorName = securityConnectorName;
        this.tags = tags;
    }

    private SecurityConnectorArgs() {
        this.cloudName = Output.empty();
        this.hierarchyIdentifier = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.offerings = Output.empty();
        this.organizationalData = Output.empty();
        this.resourceGroupName = Output.empty();
        this.securityConnectorName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,CloudName>> cloudName;
        private @Nullable Output<String> hierarchyIdentifier;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<List<Object>> offerings;
        private @Nullable Output<SecurityConnectorPropertiesOrganizationalDataArgs> organizationalData;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> securityConnectorName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudName = defaults.cloudName;
    	      this.hierarchyIdentifier = defaults.hierarchyIdentifier;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.offerings = defaults.offerings;
    	      this.organizationalData = defaults.organizationalData;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityConnectorName = defaults.securityConnectorName;
    	      this.tags = defaults.tags;
        }

        public Builder cloudName(@Nullable Output<Either<String,CloudName>> cloudName) {
            this.cloudName = cloudName;
            return this;
        }
        public Builder cloudName(@Nullable Either<String,CloudName> cloudName) {
            this.cloudName = Output.ofNullable(cloudName);
            return this;
        }
        public Builder hierarchyIdentifier(@Nullable Output<String> hierarchyIdentifier) {
            this.hierarchyIdentifier = hierarchyIdentifier;
            return this;
        }
        public Builder hierarchyIdentifier(@Nullable String hierarchyIdentifier) {
            this.hierarchyIdentifier = Output.ofNullable(hierarchyIdentifier);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
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
        public Builder offerings(@Nullable Output<List<Object>> offerings) {
            this.offerings = offerings;
            return this;
        }
        public Builder offerings(@Nullable List<Object> offerings) {
            this.offerings = Output.ofNullable(offerings);
            return this;
        }
        public Builder offerings(Object... offerings) {
            return offerings(List.of(offerings));
        }
        public Builder organizationalData(@Nullable Output<SecurityConnectorPropertiesOrganizationalDataArgs> organizationalData) {
            this.organizationalData = organizationalData;
            return this;
        }
        public Builder organizationalData(@Nullable SecurityConnectorPropertiesOrganizationalDataArgs organizationalData) {
            this.organizationalData = Output.ofNullable(organizationalData);
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
        public Builder securityConnectorName(@Nullable Output<String> securityConnectorName) {
            this.securityConnectorName = securityConnectorName;
            return this;
        }
        public Builder securityConnectorName(@Nullable String securityConnectorName) {
            this.securityConnectorName = Output.ofNullable(securityConnectorName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public SecurityConnectorArgs build() {
            return new SecurityConnectorArgs(cloudName, hierarchyIdentifier, kind, location, offerings, organizationalData, resourceGroupName, securityConnectorName, tags);
        }
    }
}
