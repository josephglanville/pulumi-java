// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DbSystemDbSystemOptions {
    /**
     * @return The storage option used in DB system. ASM - Automatic storage management LVM - Logical Volume management
     * 
     */
    private final @Nullable String storageManagement;

    @CustomType.Constructor
    private DbSystemDbSystemOptions(@CustomType.Parameter("storageManagement") @Nullable String storageManagement) {
        this.storageManagement = storageManagement;
    }

    /**
     * @return The storage option used in DB system. ASM - Automatic storage management LVM - Logical Volume management
     * 
     */
    public Optional<String> storageManagement() {
        return Optional.ofNullable(this.storageManagement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DbSystemDbSystemOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String storageManagement;

        public Builder() {
    	      // Empty
        }

        public Builder(DbSystemDbSystemOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageManagement = defaults.storageManagement;
        }

        public Builder storageManagement(@Nullable String storageManagement) {
            this.storageManagement = storageManagement;
            return this;
        }        public DbSystemDbSystemOptions build() {
            return new DbSystemDbSystemOptions(storageManagement);
        }
    }
}
