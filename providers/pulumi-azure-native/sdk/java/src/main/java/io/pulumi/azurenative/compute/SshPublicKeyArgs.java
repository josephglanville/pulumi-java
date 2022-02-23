// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * SSH public key used to authenticate to a virtual machine through ssh. If this property is not initially provided when the resource is created, the publicKey property will be populated when generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to be at least 2048-bit and in ssh-rsa format.
     * 
     */
    @InputImport(name="publicKey")
      private final @Nullable Input<String> publicKey;

    public Input<String> getPublicKey() {
        return this.publicKey == null ? Input.empty() : this.publicKey;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SSH public key.
     * 
     */
    @InputImport(name="sshPublicKeyName")
      private final @Nullable Input<String> sshPublicKeyName;

    public Input<String> getSshPublicKeyName() {
        return this.sshPublicKeyName == null ? Input.empty() : this.sshPublicKeyName;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SshPublicKeyArgs(
        @Nullable Input<String> location,
        @Nullable Input<String> publicKey,
        Input<String> resourceGroupName,
        @Nullable Input<String> sshPublicKeyName,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.publicKey = publicKey;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sshPublicKeyName = sshPublicKeyName;
        this.tags = tags;
    }

    private SshPublicKeyArgs() {
        this.location = Input.empty();
        this.publicKey = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sshPublicKeyName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<String> publicKey;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sshPublicKeyName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.publicKey = defaults.publicKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sshPublicKeyName = defaults.sshPublicKeyName;
    	      this.tags = defaults.tags;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPublicKey(@Nullable Input<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setPublicKey(@Nullable String publicKey) {
            this.publicKey = Input.ofNullable(publicKey);
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

        public Builder setSshPublicKeyName(@Nullable Input<String> sshPublicKeyName) {
            this.sshPublicKeyName = sshPublicKeyName;
            return this;
        }

        public Builder setSshPublicKeyName(@Nullable String sshPublicKeyName) {
            this.sshPublicKeyName = Input.ofNullable(sshPublicKeyName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(location, publicKey, resourceGroupName, sshPublicKeyName, tags);
        }
    }
}
