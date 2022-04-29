// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstanceGroupManagedInstance {
    /**
     * @return (Updatable) Managed Instance Group identifier
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return unique identifier that is immutable on creation
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private ManagedInstanceGroupManagedInstance(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") @Nullable String id) {
        this.displayName = displayName;
        this.id = id;
    }

    /**
     * @return (Updatable) Managed Instance Group identifier
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return unique identifier that is immutable on creation
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceGroupManagedInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceGroupManagedInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public ManagedInstanceGroupManagedInstance build() {
            return new ManagedInstanceGroupManagedInstance(displayName, id);
        }
    }
}
