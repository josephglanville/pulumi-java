// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QuobyteVolumeSource {
    /**
     * @return group to map volume access to Default is no group
     * 
     */
    private final @Nullable String group;
    /**
     * @return readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * @return registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * 
     */
    private final String registry;
    /**
     * @return tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    private final @Nullable String tenant;
    /**
     * @return user to map volume access to Defaults to serivceaccount user
     * 
     */
    private final @Nullable String user;
    /**
     * @return volume is a string that references an already created Quobyte volume by name.
     * 
     */
    private final String volume;

    @CustomType.Constructor
    private QuobyteVolumeSource(
        @CustomType.Parameter("group") @Nullable String group,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("registry") String registry,
        @CustomType.Parameter("tenant") @Nullable String tenant,
        @CustomType.Parameter("user") @Nullable String user,
        @CustomType.Parameter("volume") String volume) {
        this.group = group;
        this.readOnly = readOnly;
        this.registry = registry;
        this.tenant = tenant;
        this.user = user;
        this.volume = volume;
    }

    /**
     * @return group to map volume access to Default is no group
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * 
     */
    public String registry() {
        return this.registry;
    }
    /**
     * @return tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    public Optional<String> tenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * @return user to map volume access to Defaults to serivceaccount user
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }
    /**
     * @return volume is a string that references an already created Quobyte volume by name.
     * 
     */
    public String volume() {
        return this.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuobyteVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String group;
        private @Nullable Boolean readOnly;
        private String registry;
        private @Nullable String tenant;
        private @Nullable String user;
        private String volume;

        public Builder() {
    	      // Empty
        }

        public Builder(QuobyteVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.readOnly = defaults.readOnly;
    	      this.registry = defaults.registry;
    	      this.tenant = defaults.tenant;
    	      this.user = defaults.user;
    	      this.volume = defaults.volume;
        }

        public Builder group(@Nullable String group) {
            this.group = group;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder registry(String registry) {
            this.registry = Objects.requireNonNull(registry);
            return this;
        }
        public Builder tenant(@Nullable String tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }
        public Builder volume(String volume) {
            this.volume = Objects.requireNonNull(volume);
            return this;
        }        public QuobyteVolumeSource build() {
            return new QuobyteVolumeSource(group, readOnly, registry, tenant, user, volume);
        }
    }
}
