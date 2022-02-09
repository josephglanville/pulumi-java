// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerArgs Empty = new SqlServerArgs();

    @InputImport(name="cores")
    private final @Nullable Input<Integer> cores;

    public Input<Integer> getCores() {
        return this.cores == null ? Input.empty() : this.cores;
    }

    @InputImport(name="edition")
    private final @Nullable Input<String> edition;

    public Input<String> getEdition() {
        return this.edition == null ? Input.empty() : this.edition;
    }

    @InputImport(name="propertyBag")
    private final @Nullable Input<String> propertyBag;

    public Input<String> getPropertyBag() {
        return this.propertyBag == null ? Input.empty() : this.propertyBag;
    }

    @InputImport(name="registrationID")
    private final @Nullable Input<String> registrationID;

    public Input<String> getRegistrationID() {
        return this.registrationID == null ? Input.empty() : this.registrationID;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sqlServerName")
    private final @Nullable Input<String> sqlServerName;

    public Input<String> getSqlServerName() {
        return this.sqlServerName == null ? Input.empty() : this.sqlServerName;
    }

    @InputImport(name="sqlServerRegistrationName", required=true)
    private final Input<String> sqlServerRegistrationName;

    public Input<String> getSqlServerRegistrationName() {
        return this.sqlServerRegistrationName;
    }

    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public SqlServerArgs(
        @Nullable Input<Integer> cores,
        @Nullable Input<String> edition,
        @Nullable Input<String> propertyBag,
        @Nullable Input<String> registrationID,
        Input<String> resourceGroupName,
        @Nullable Input<String> sqlServerName,
        Input<String> sqlServerRegistrationName,
        @Nullable Input<String> version) {
        this.cores = cores;
        this.edition = edition;
        this.propertyBag = propertyBag;
        this.registrationID = registrationID;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlServerName = sqlServerName;
        this.sqlServerRegistrationName = Objects.requireNonNull(sqlServerRegistrationName, "expected parameter 'sqlServerRegistrationName' to be non-null");
        this.version = version;
    }

    private SqlServerArgs() {
        this.cores = Input.empty();
        this.edition = Input.empty();
        this.propertyBag = Input.empty();
        this.registrationID = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sqlServerName = Input.empty();
        this.sqlServerRegistrationName = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cores;
        private @Nullable Input<String> edition;
        private @Nullable Input<String> propertyBag;
        private @Nullable Input<String> registrationID;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sqlServerName;
        private Input<String> sqlServerRegistrationName;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cores = defaults.cores;
    	      this.edition = defaults.edition;
    	      this.propertyBag = defaults.propertyBag;
    	      this.registrationID = defaults.registrationID;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlServerName = defaults.sqlServerName;
    	      this.sqlServerRegistrationName = defaults.sqlServerRegistrationName;
    	      this.version = defaults.version;
        }

        public Builder setCores(@Nullable Input<Integer> cores) {
            this.cores = cores;
            return this;
        }

        public Builder setCores(@Nullable Integer cores) {
            this.cores = Input.ofNullable(cores);
            return this;
        }

        public Builder setEdition(@Nullable Input<String> edition) {
            this.edition = edition;
            return this;
        }

        public Builder setEdition(@Nullable String edition) {
            this.edition = Input.ofNullable(edition);
            return this;
        }

        public Builder setPropertyBag(@Nullable Input<String> propertyBag) {
            this.propertyBag = propertyBag;
            return this;
        }

        public Builder setPropertyBag(@Nullable String propertyBag) {
            this.propertyBag = Input.ofNullable(propertyBag);
            return this;
        }

        public Builder setRegistrationID(@Nullable Input<String> registrationID) {
            this.registrationID = registrationID;
            return this;
        }

        public Builder setRegistrationID(@Nullable String registrationID) {
            this.registrationID = Input.ofNullable(registrationID);
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

        public Builder setSqlServerName(@Nullable Input<String> sqlServerName) {
            this.sqlServerName = sqlServerName;
            return this;
        }

        public Builder setSqlServerName(@Nullable String sqlServerName) {
            this.sqlServerName = Input.ofNullable(sqlServerName);
            return this;
        }

        public Builder setSqlServerRegistrationName(Input<String> sqlServerRegistrationName) {
            this.sqlServerRegistrationName = Objects.requireNonNull(sqlServerRegistrationName);
            return this;
        }

        public Builder setSqlServerRegistrationName(String sqlServerRegistrationName) {
            this.sqlServerRegistrationName = Input.of(Objects.requireNonNull(sqlServerRegistrationName));
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public SqlServerArgs build() {
            return new SqlServerArgs(cores, edition, propertyBag, registrationID, resourceGroupName, sqlServerName, sqlServerRegistrationName, version);
        }
    }
}
