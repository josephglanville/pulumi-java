// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AADProperties;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRecoveryPointAccessTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRecoveryPointAccessTokenArgs Empty = new GetRecoveryPointAccessTokenArgs();

    @InputImport(name="containerName", required=true)
    private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    @InputImport(name="eTag")
    private final @Nullable String eTag;

    public Optional<String> getETag() {
        return this.eTag == null ? Optional.empty() : Optional.ofNullable(this.eTag);
    }

    @InputImport(name="fabricName", required=true)
    private final String fabricName;

    public String getFabricName() {
        return this.fabricName;
    }

    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    @InputImport(name="properties")
    private final @Nullable AADProperties properties;

    public Optional<AADProperties> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    @InputImport(name="protectedItemName", required=true)
    private final String protectedItemName;

    public String getProtectedItemName() {
        return this.protectedItemName;
    }

    @InputImport(name="recoveryPointId", required=true)
    private final String recoveryPointId;

    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    @InputImport(name="vaultName", required=true)
    private final String vaultName;

    public String getVaultName() {
        return this.vaultName;
    }

    public GetRecoveryPointAccessTokenArgs(
        String containerName,
        @Nullable String eTag,
        String fabricName,
        @Nullable String location,
        @Nullable AADProperties properties,
        String protectedItemName,
        String recoveryPointId,
        String resourceGroupName,
        @Nullable Map<String,String> tags,
        String vaultName) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.eTag = eTag;
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.location = location;
        this.properties = properties;
        this.protectedItemName = Objects.requireNonNull(protectedItemName, "expected parameter 'protectedItemName' to be non-null");
        this.recoveryPointId = Objects.requireNonNull(recoveryPointId, "expected parameter 'recoveryPointId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetRecoveryPointAccessTokenArgs() {
        this.containerName = null;
        this.eTag = null;
        this.fabricName = null;
        this.location = null;
        this.properties = null;
        this.protectedItemName = null;
        this.recoveryPointId = null;
        this.resourceGroupName = null;
        this.tags = Map.of();
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecoveryPointAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private @Nullable String eTag;
        private String fabricName;
        private @Nullable String location;
        private @Nullable AADProperties properties;
        private String protectedItemName;
        private String recoveryPointId;
        private String resourceGroupName;
        private @Nullable Map<String,String> tags;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecoveryPointAccessTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.eTag = defaults.eTag;
    	      this.fabricName = defaults.fabricName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.protectedItemName = defaults.protectedItemName;
    	      this.recoveryPointId = defaults.recoveryPointId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(@Nullable AADProperties properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProtectedItemName(String protectedItemName) {
            this.protectedItemName = Objects.requireNonNull(protectedItemName);
            return this;
        }

        public Builder setRecoveryPointId(String recoveryPointId) {
            this.recoveryPointId = Objects.requireNonNull(recoveryPointId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }

        public GetRecoveryPointAccessTokenArgs build() {
            return new GetRecoveryPointAccessTokenArgs(containerName, eTag, fabricName, location, properties, protectedItemName, recoveryPointId, resourceGroupName, tags, vaultName);
        }
    }
}
