// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Nosql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Nosql.inputs.IndexKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndexArgs Empty = new IndexArgs();

    /**
     * The OCID of the table&#39;s compartment.  Required if the tableNameOrId path parameter is a table name. Optional if tableNameOrId is an OCID.  If tableNameOrId is an OCID, and compartmentId is supplied, the latter must match the identified table&#39;s compartmentId.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The OCID of the table&#39;s compartment.  Required if the tableNameOrId path parameter is a table name. Optional if tableNameOrId is an OCID.  If tableNameOrId is an OCID, and compartmentId is supplied, the latter must match the identified table&#39;s compartmentId.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * If true, the operation completes successfully even when the index exists.  Otherwise, an attempt to create an index that already exists will return an error.
     * 
     */
    @Import(name="isIfNotExists")
    private @Nullable Output<Boolean> isIfNotExists;

    /**
     * @return If true, the operation completes successfully even when the index exists.  Otherwise, an attempt to create an index that already exists will return an error.
     * 
     */
    public Optional<Output<Boolean>> isIfNotExists() {
        return Optional.ofNullable(this.isIfNotExists);
    }

    /**
     * A set of keys for a secondary index.
     * 
     */
    @Import(name="keys", required=true)
    private Output<List<IndexKeyArgs>> keys;

    /**
     * @return A set of keys for a secondary index.
     * 
     */
    public Output<List<IndexKeyArgs>> keys() {
        return this.keys;
    }

    /**
     * Index name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Index name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A table name within the compartment, or a table OCID.
     * 
     */
    @Import(name="tableNameOrId", required=true)
    private Output<String> tableNameOrId;

    /**
     * @return A table name within the compartment, or a table OCID.
     * 
     */
    public Output<String> tableNameOrId() {
        return this.tableNameOrId;
    }

    private IndexArgs() {}

    private IndexArgs(IndexArgs $) {
        this.compartmentId = $.compartmentId;
        this.isIfNotExists = $.isIfNotExists;
        this.keys = $.keys;
        this.name = $.name;
        this.tableNameOrId = $.tableNameOrId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexArgs $;

        public Builder() {
            $ = new IndexArgs();
        }

        public Builder(IndexArgs defaults) {
            $ = new IndexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the table&#39;s compartment.  Required if the tableNameOrId path parameter is a table name. Optional if tableNameOrId is an OCID.  If tableNameOrId is an OCID, and compartmentId is supplied, the latter must match the identified table&#39;s compartmentId.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the table&#39;s compartment.  Required if the tableNameOrId path parameter is a table name. Optional if tableNameOrId is an OCID.  If tableNameOrId is an OCID, and compartmentId is supplied, the latter must match the identified table&#39;s compartmentId.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param isIfNotExists If true, the operation completes successfully even when the index exists.  Otherwise, an attempt to create an index that already exists will return an error.
         * 
         * @return builder
         * 
         */
        public Builder isIfNotExists(@Nullable Output<Boolean> isIfNotExists) {
            $.isIfNotExists = isIfNotExists;
            return this;
        }

        /**
         * @param isIfNotExists If true, the operation completes successfully even when the index exists.  Otherwise, an attempt to create an index that already exists will return an error.
         * 
         * @return builder
         * 
         */
        public Builder isIfNotExists(Boolean isIfNotExists) {
            return isIfNotExists(Output.of(isIfNotExists));
        }

        /**
         * @param keys A set of keys for a secondary index.
         * 
         * @return builder
         * 
         */
        public Builder keys(Output<List<IndexKeyArgs>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys A set of keys for a secondary index.
         * 
         * @return builder
         * 
         */
        public Builder keys(List<IndexKeyArgs> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys A set of keys for a secondary index.
         * 
         * @return builder
         * 
         */
        public Builder keys(IndexKeyArgs... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param name Index name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Index name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tableNameOrId A table name within the compartment, or a table OCID.
         * 
         * @return builder
         * 
         */
        public Builder tableNameOrId(Output<String> tableNameOrId) {
            $.tableNameOrId = tableNameOrId;
            return this;
        }

        /**
         * @param tableNameOrId A table name within the compartment, or a table OCID.
         * 
         * @return builder
         * 
         */
        public Builder tableNameOrId(String tableNameOrId) {
            return tableNameOrId(Output.of(tableNameOrId));
        }

        public IndexArgs build() {
            $.keys = Objects.requireNonNull($.keys, "expected parameter 'keys' to be non-null");
            $.tableNameOrId = Objects.requireNonNull($.tableNameOrId, "expected parameter 'tableNameOrId' to be non-null");
            return $;
        }
    }

}
