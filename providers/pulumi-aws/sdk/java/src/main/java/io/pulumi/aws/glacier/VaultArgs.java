// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier;

import io.pulumi.aws.glacier.inputs.VaultNotificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultArgs Empty = new VaultArgs();

    /**
     * The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    @Import(name="accessPolicy")
      private final @Nullable Output<String> accessPolicy;

    public Output<String> getAccessPolicy() {
        return this.accessPolicy == null ? Output.empty() : this.accessPolicy;
    }

    /**
     * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The notifications for the Vault. Fields documented below.
     * 
     */
    @Import(name="notification")
      private final @Nullable Output<VaultNotificationArgs> notification;

    public Output<VaultNotificationArgs> getNotification() {
        return this.notification == null ? Output.empty() : this.notification;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public VaultArgs(
        @Nullable Output<String> accessPolicy,
        @Nullable Output<String> name,
        @Nullable Output<VaultNotificationArgs> notification,
        @Nullable Output<Map<String,String>> tags) {
        this.accessPolicy = accessPolicy;
        this.name = name;
        this.notification = notification;
        this.tags = tags;
    }

    private VaultArgs() {
        this.accessPolicy = Output.empty();
        this.name = Output.empty();
        this.notification = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessPolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<VaultNotificationArgs> notification;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.name = defaults.name;
    	      this.notification = defaults.notification;
    	      this.tags = defaults.tags;
        }

        public Builder accessPolicy(@Nullable Output<String> accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }
        public Builder accessPolicy(@Nullable String accessPolicy) {
            this.accessPolicy = Output.ofNullable(accessPolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder notification(@Nullable Output<VaultNotificationArgs> notification) {
            this.notification = notification;
            return this;
        }
        public Builder notification(@Nullable VaultNotificationArgs notification) {
            this.notification = Output.ofNullable(notification);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public VaultArgs build() {
            return new VaultArgs(accessPolicy, name, notification, tags);
        }
    }
}
