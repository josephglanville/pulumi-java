// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    @InputImport(name="isActiveCMK")
    private final @Nullable Input<Boolean> isActiveCMK;

    public Input<Boolean> getIsActiveCMK() {
        return this.isActiveCMK == null ? Input.empty() : this.isActiveCMK;
    }

    @InputImport(name="keyName")
    private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    @InputImport(name="keyVaultUrl")
    private final @Nullable Input<String> keyVaultUrl;

    public Input<String> getKeyVaultUrl() {
        return this.keyVaultUrl == null ? Input.empty() : this.keyVaultUrl;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public KeyArgs(
        @Nullable Input<Boolean> isActiveCMK,
        @Nullable Input<String> keyName,
        @Nullable Input<String> keyVaultUrl,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.isActiveCMK = isActiveCMK;
        this.keyName = keyName;
        this.keyVaultUrl = keyVaultUrl;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private KeyArgs() {
        this.isActiveCMK = Input.empty();
        this.keyName = Input.empty();
        this.keyVaultUrl = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isActiveCMK;
        private @Nullable Input<String> keyName;
        private @Nullable Input<String> keyVaultUrl;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isActiveCMK = defaults.isActiveCMK;
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUrl = defaults.keyVaultUrl;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setIsActiveCMK(@Nullable Input<Boolean> isActiveCMK) {
            this.isActiveCMK = isActiveCMK;
            return this;
        }

        public Builder setIsActiveCMK(@Nullable Boolean isActiveCMK) {
            this.isActiveCMK = Input.ofNullable(isActiveCMK);
            return this;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
            return this;
        }

        public Builder setKeyVaultUrl(@Nullable Input<String> keyVaultUrl) {
            this.keyVaultUrl = keyVaultUrl;
            return this;
        }

        public Builder setKeyVaultUrl(@Nullable String keyVaultUrl) {
            this.keyVaultUrl = Input.ofNullable(keyVaultUrl);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public KeyArgs build() {
            return new KeyArgs(isActiveCMK, keyName, keyVaultUrl, resourceGroupName, workspaceName);
        }
    }
}
