// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.KeyVaultReference;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListIntegrationAccountKeyVaultKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListIntegrationAccountKeyVaultKeysArgs Empty = new ListIntegrationAccountKeyVaultKeysArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
      private final String integrationAccountName;

    public String getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key vault reference.
     * 
     */
    @Import(name="keyVault", required=true)
      private final KeyVaultReference keyVault;

    public KeyVaultReference getKeyVault() {
        return this.keyVault;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The skip token.
     * 
     */
    @Import(name="skipToken")
      private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListIntegrationAccountKeyVaultKeysArgs(
        String integrationAccountName,
        KeyVaultReference keyVault,
        String resourceGroupName,
        @Nullable String skipToken) {
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.keyVault = Objects.requireNonNull(keyVault, "expected parameter 'keyVault' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipToken = skipToken;
    }

    private ListIntegrationAccountKeyVaultKeysArgs() {
        this.integrationAccountName = null;
        this.keyVault = null;
        this.resourceGroupName = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountKeyVaultKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationAccountName;
        private KeyVaultReference keyVault;
        private String resourceGroupName;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountKeyVaultKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.keyVault = defaults.keyVault;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }
        public Builder keyVault(KeyVaultReference keyVault) {
            this.keyVault = Objects.requireNonNull(keyVault);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }        public ListIntegrationAccountKeyVaultKeysArgs build() {
            return new ListIntegrationAccountKeyVaultKeysArgs(integrationAccountName, keyVault, resourceGroupName, skipToken);
        }
    }
}
