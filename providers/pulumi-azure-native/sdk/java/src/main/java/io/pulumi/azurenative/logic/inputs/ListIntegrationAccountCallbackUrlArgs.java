// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.KeyType;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListIntegrationAccountCallbackUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListIntegrationAccountCallbackUrlArgs Empty = new ListIntegrationAccountCallbackUrlArgs();

    /**
     * The integration account name.
     * 
     */
    @InputImport(name="integrationAccountName", required=true)
      private final String integrationAccountName;

    public String getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key type.
     * 
     */
    @InputImport(name="keyType")
      private final @Nullable Either<String,KeyType> keyType;

    public Either<String,KeyType> getKeyType() {
        return this.keyType == null ? null : this.keyType;
    }

    /**
     * The expiry time.
     * 
     */
    @InputImport(name="notAfter")
      private final @Nullable String notAfter;

    public Optional<String> getNotAfter() {
        return this.notAfter == null ? Optional.empty() : Optional.ofNullable(this.notAfter);
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListIntegrationAccountCallbackUrlArgs(
        String integrationAccountName,
        @Nullable Either<String,KeyType> keyType,
        @Nullable String notAfter,
        String resourceGroupName) {
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.keyType = keyType;
        this.notAfter = notAfter;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListIntegrationAccountCallbackUrlArgs() {
        this.integrationAccountName = null;
        this.keyType = null;
        this.notAfter = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationAccountName;
        private @Nullable Either<String,KeyType> keyType;
        private @Nullable String notAfter;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountCallbackUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.keyType = defaults.keyType;
    	      this.notAfter = defaults.notAfter;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setKeyType(@Nullable Either<String,KeyType> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setNotAfter(@Nullable String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListIntegrationAccountCallbackUrlArgs build() {
            return new ListIntegrationAccountCallbackUrlArgs(integrationAccountName, keyType, notAfter, resourceGroupName);
        }
    }
}
