// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrphanedUserInfoResponse {
    /**
     * Parent database of the user
     * 
     */
    private final @Nullable String databaseName;
    /**
     * Name of the orphaned user
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private OrphanedUserInfoResponse(
        @CustomType.Parameter("databaseName") @Nullable String databaseName,
        @CustomType.Parameter("name") @Nullable String name) {
        this.databaseName = databaseName;
        this.name = name;
    }

    /**
     * Parent database of the user
     * 
    */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * Name of the orphaned user
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrphanedUserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OrphanedUserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public OrphanedUserInfoResponse build() {
            return new OrphanedUserInfoResponse(databaseName, name);
        }
    }
}
