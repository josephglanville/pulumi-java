// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataCatalogEncryptionSettingsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataCatalogEncryptionSettingsArgs Empty = new GetDataCatalogEncryptionSettingsArgs();

    /**
     * The ID of the Data Catalog. This is typically the AWS account ID.
     * 
     */
    @Import(name="catalogId", required=true)
      private final String catalogId;

    public String getCatalogId() {
        return this.catalogId;
    }

    public GetDataCatalogEncryptionSettingsArgs(String catalogId) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
    }

    private GetDataCatalogEncryptionSettingsArgs() {
        this.catalogId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogEncryptionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
        }

        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }        public GetDataCatalogEncryptionSettingsArgs build() {
            return new GetDataCatalogEncryptionSettingsArgs(catalogId);
        }
    }
}
