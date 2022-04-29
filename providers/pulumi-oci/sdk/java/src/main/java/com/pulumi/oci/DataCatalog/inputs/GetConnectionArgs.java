// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionArgs Empty = new GetConnectionArgs();

    /**
     * Unique catalog identifier.
     * 
     */
    @Import(name="catalogId", required=true)
    private String catalogId;

    /**
     * @return Unique catalog identifier.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }

    /**
     * Unique connection key.
     * 
     */
    @Import(name="connectionKey", required=true)
    private String connectionKey;

    /**
     * @return Unique connection key.
     * 
     */
    public String connectionKey() {
        return this.connectionKey;
    }

    /**
     * Unique data asset key.
     * 
     */
    @Import(name="dataAssetKey", required=true)
    private String dataAssetKey;

    /**
     * @return Unique data asset key.
     * 
     */
    public String dataAssetKey() {
        return this.dataAssetKey;
    }

    /**
     * Specifies the fields to return in a connection response.
     * 
     */
    @Import(name="fields")
    private @Nullable List<String> fields;

    /**
     * @return Specifies the fields to return in a connection response.
     * 
     */
    public Optional<List<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    private GetConnectionArgs() {}

    private GetConnectionArgs(GetConnectionArgs $) {
        this.catalogId = $.catalogId;
        this.connectionKey = $.connectionKey;
        this.dataAssetKey = $.dataAssetKey;
        this.fields = $.fields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionArgs $;

        public Builder() {
            $ = new GetConnectionArgs();
        }

        public Builder(GetConnectionArgs defaults) {
            $ = new GetConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Unique catalog identifier.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param connectionKey Unique connection key.
         * 
         * @return builder
         * 
         */
        public Builder connectionKey(String connectionKey) {
            $.connectionKey = connectionKey;
            return this;
        }

        /**
         * @param dataAssetKey Unique data asset key.
         * 
         * @return builder
         * 
         */
        public Builder dataAssetKey(String dataAssetKey) {
            $.dataAssetKey = dataAssetKey;
            return this;
        }

        /**
         * @param fields Specifies the fields to return in a connection response.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable List<String> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Specifies the fields to return in a connection response.
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        public GetConnectionArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.connectionKey = Objects.requireNonNull($.connectionKey, "expected parameter 'connectionKey' to be non-null");
            $.dataAssetKey = Objects.requireNonNull($.dataAssetKey, "expected parameter 'dataAssetKey' to be non-null");
            return $;
        }
    }

}
