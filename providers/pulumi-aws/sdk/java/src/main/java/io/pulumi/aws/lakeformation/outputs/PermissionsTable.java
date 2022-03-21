// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PermissionsTable {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final @Nullable String catalogId;
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    private final String databaseName;
    /**
     * Name of the table resource.
     * 
     */
    private final @Nullable String name;
    private final @Nullable Boolean wildcard;

    @CustomType.Constructor
    private PermissionsTable(
        @CustomType.Parameter("catalogId") @Nullable String catalogId,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("wildcard") @Nullable Boolean wildcard) {
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.name = name;
        this.wildcard = wildcard;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
    */
    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Name of the table resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Boolean> getWildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private String databaseName;
        private @Nullable String name;
        private @Nullable Boolean wildcard;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder wildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }        public PermissionsTable build() {
            return new PermissionsTable(catalogId, databaseName, name, wildcard);
        }
    }
}
