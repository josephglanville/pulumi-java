// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    @InputImport(name="db")
    private final @Nullable Input<String> db;

    public Input<String> getDb() {
        return this.db == null ? Input.empty() : this.db;
    }

    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public RoleArgs(
        @Nullable Input<String> db,
        @Nullable Input<String> role) {
        this.db = db;
        this.role = role;
    }

    private RoleArgs() {
        this.db = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> db;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.db = defaults.db;
    	      this.role = defaults.role;
        }

        public Builder setDb(@Nullable Input<String> db) {
            this.db = db;
            return this;
        }

        public Builder setDb(@Nullable String db) {
            this.db = Input.ofNullable(db);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public RoleArgs build() {
            return new RoleArgs(db, role);
        }
    }
}
