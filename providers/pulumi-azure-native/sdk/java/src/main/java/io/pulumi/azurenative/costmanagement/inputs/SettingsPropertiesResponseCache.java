// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingsPropertiesResponseCache extends io.pulumi.resources.InvokeArgs {

    public static final SettingsPropertiesResponseCache Empty = new SettingsPropertiesResponseCache();

    @InputImport(name="channel", required=true)
    private final String channel;

    public String getChannel() {
        return this.channel;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="parent")
    private final @Nullable String parent;

    public Optional<String> getParent() {
        return this.parent == null ? Optional.empty() : Optional.ofNullable(this.parent);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    @InputImport(name="subchannel", required=true)
    private final String subchannel;

    public String getSubchannel() {
        return this.subchannel;
    }

    public SettingsPropertiesResponseCache(
        String channel,
        String id,
        String name,
        @Nullable String parent,
        @Nullable String status,
        String subchannel) {
        this.channel = Objects.requireNonNull(channel, "expected parameter 'channel' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parent = parent;
        this.status = status;
        this.subchannel = Objects.requireNonNull(subchannel, "expected parameter 'subchannel' to be non-null");
    }

    private SettingsPropertiesResponseCache() {
        this.channel = null;
        this.id = null;
        this.name = null;
        this.parent = null;
        this.status = null;
        this.subchannel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsPropertiesResponseCache defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channel;
        private String id;
        private String name;
        private @Nullable String parent;
        private @Nullable String status;
        private String subchannel;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsPropertiesResponseCache defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.status = defaults.status;
    	      this.subchannel = defaults.subchannel;
        }

        public Builder setChannel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = parent;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSubchannel(String subchannel) {
            this.subchannel = Objects.requireNonNull(subchannel);
            return this;
        }

        public SettingsPropertiesResponseCache build() {
            return new SettingsPropertiesResponseCache(channel, id, name, parent, status, subchannel);
        }
    }
}
