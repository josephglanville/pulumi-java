// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.core.Output;
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
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * SSH public key used to authenticate to a virtual machine through ssh. If this property is not initially provided when the resource is created, the publicKey property will be populated when generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to be at least 2048-bit and in ssh-rsa format.
     * 
     */
    @InputImport(name="publicKey")
      private final @Nullable Output<String> publicKey;

    public Output<String> getPublicKey() {
        return this.publicKey == null ? Output.empty() : this.publicKey;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SSH public key.
     * 
     */
    @InputImport(name="sshPublicKeyName")
      private final @Nullable Output<String> sshPublicKeyName;

    public Output<String> getSshPublicKeyName() {
        return this.sshPublicKeyName == null ? Output.empty() : this.sshPublicKeyName;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SshPublicKeyArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> publicKey,
        Output<String> resourceGroupName,
        @Nullable Output<String> sshPublicKeyName,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.publicKey = publicKey;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sshPublicKeyName = sshPublicKeyName;
        this.tags = tags;
    }

    private SshPublicKeyArgs() {
        this.location = Output.empty();
        this.publicKey = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sshPublicKeyName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> publicKey;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sshPublicKeyName;
        private @Nullable Output<Map<String,String>> tags;

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

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder publicKey(@Nullable Output<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = Output.ofNullable(publicKey);
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

        public Builder sshPublicKeyName(@Nullable Output<String> sshPublicKeyName) {
            this.sshPublicKeyName = sshPublicKeyName;
            return this;
        }

        public Builder sshPublicKeyName(@Nullable String sshPublicKeyName) {
            this.sshPublicKeyName = Output.ofNullable(sshPublicKeyName);
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
        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(location, publicKey, resourceGroupName, sshPublicKeyName, tags);
        }
    }
}
