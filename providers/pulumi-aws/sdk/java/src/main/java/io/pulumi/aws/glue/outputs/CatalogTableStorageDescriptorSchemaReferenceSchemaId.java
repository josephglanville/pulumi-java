// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CatalogTableStorageDescriptorSchemaReferenceSchemaId {
    /**
     * Name of the schema registry that contains the schema. Must be provided when `schema_name` is specified and conflicts with `schema_arn`.
     * 
     */
    private final @Nullable String registryName;
    /**
     * ARN of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
     */
    private final @Nullable String schemaArn;
    /**
     * Name of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
     */
    private final @Nullable String schemaName;

    @CustomType.Constructor
    private CatalogTableStorageDescriptorSchemaReferenceSchemaId(
        @CustomType.Parameter("registryName") @Nullable String registryName,
        @CustomType.Parameter("schemaArn") @Nullable String schemaArn,
        @CustomType.Parameter("schemaName") @Nullable String schemaName) {
        this.registryName = registryName;
        this.schemaArn = schemaArn;
        this.schemaName = schemaName;
    }

    /**
     * Name of the schema registry that contains the schema. Must be provided when `schema_name` is specified and conflicts with `schema_arn`.
     * 
    */
    public Optional<String> getRegistryName() {
        return Optional.ofNullable(this.registryName);
    }
    /**
     * ARN of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
    */
    public Optional<String> getSchemaArn() {
        return Optional.ofNullable(this.schemaArn);
    }
    /**
     * Name of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
    */
    public Optional<String> getSchemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSchemaReferenceSchemaId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String registryName;
        private @Nullable String schemaArn;
        private @Nullable String schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSchemaReferenceSchemaId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.schemaArn = defaults.schemaArn;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder registryName(@Nullable String registryName) {
            this.registryName = registryName;
            return this;
        }
        public Builder schemaArn(@Nullable String schemaArn) {
            this.schemaArn = schemaArn;
            return this;
        }
        public Builder schemaName(@Nullable String schemaName) {
            this.schemaName = schemaName;
            return this;
        }        public CatalogTableStorageDescriptorSchemaReferenceSchemaId build() {
            return new CatalogTableStorageDescriptorSchemaReferenceSchemaId(registryName, schemaArn, schemaName);
        }
    }
}
