// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Unique catalog identifier.
     * 
     */
    @Import(name="catalogId", required=true)
    private Output<String> catalogId;

    /**
     * @return Unique catalog identifier.
     * 
     */
    public Output<String> catalogId() {
        return this.catalogId;
    }

    /**
     * Unique data asset key.
     * 
     */
    @Import(name="dataAssetKey", required=true)
    private Output<String> dataAssetKey;

    /**
     * @return Unique data asset key.
     * 
     */
    public Output<String> dataAssetKey() {
        return this.dataAssetKey;
    }

    /**
     * (Updatable) A description of the connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) A description of the connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) A user-friendly display name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly display name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * (Updatable) A map of maps that contains the encrypted values for sensitive properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. To determine the set of optional and required properties for a connection type, a query can be done on &#39;/types?type=connection&#39; that returns a collection of all connection types. The appropriate connection type, which will include definitions of all of it&#39;s properties, can be identified from this collection. Example: `{&#34;encProperties&#34;: { &#34;default&#34;: { &#34;password&#34;: &#34;example-password&#34;}}}`
     * 
     */
    @Import(name="encProperties")
    private @Nullable Output<Map<String,Object>> encProperties;

    /**
     * @return (Updatable) A map of maps that contains the encrypted values for sensitive properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. To determine the set of optional and required properties for a connection type, a query can be done on &#39;/types?type=connection&#39; that returns a collection of all connection types. The appropriate connection type, which will include definitions of all of it&#39;s properties, can be identified from this collection. Example: `{&#34;encProperties&#34;: { &#34;default&#34;: { &#34;password&#34;: &#34;example-password&#34;}}}`
     * 
     */
    public Optional<Output<Map<String,Object>>> encProperties() {
        return Optional.ofNullable(this.encProperties);
    }

    /**
     * (Updatable) Indicates whether this connection is the default connection. The first connection of a data asset defaults to being the default, subsequent connections default to not being the default. If a default connection already exists, then trying to create a connection as the default will fail. In this case the default connection would need to be updated not to be the default and then the new connection can then be created as the default.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return (Updatable) Indicates whether this connection is the default connection. The first connection of a data asset defaults to being the default, subsequent connections default to not being the default. If a default connection already exists, then trying to create a connection as the default will fail. In this case the default connection would need to be updated not to be the default and then the new connection can then be created as the default.
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * A map of maps that contains the properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. Example: `{&#34;properties&#34;: { &#34;default&#34;: { &#34;username&#34;: &#34;user1&#34;}}}`
     * 
     */
    @Import(name="properties", required=true)
    private Output<Map<String,Object>> properties;

    /**
     * @return A map of maps that contains the properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. Example: `{&#34;properties&#34;: { &#34;default&#34;: { &#34;username&#34;: &#34;user1&#34;}}}`
     * 
     */
    public Output<Map<String,Object>> properties() {
        return this.properties;
    }

    /**
     * The key of the object type. Type key&#39;s can be found via the &#39;/types&#39; endpoint.
     * 
     */
    @Import(name="typeKey", required=true)
    private Output<String> typeKey;

    /**
     * @return The key of the object type. Type key&#39;s can be found via the &#39;/types&#39; endpoint.
     * 
     */
    public Output<String> typeKey() {
        return this.typeKey;
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.catalogId = $.catalogId;
        this.dataAssetKey = $.dataAssetKey;
        this.description = $.description;
        this.displayName = $.displayName;
        this.encProperties = $.encProperties;
        this.isDefault = $.isDefault;
        this.properties = $.properties;
        this.typeKey = $.typeKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Unique catalog identifier.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId Unique catalog identifier.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param dataAssetKey Unique data asset key.
         * 
         * @return builder
         * 
         */
        public Builder dataAssetKey(Output<String> dataAssetKey) {
            $.dataAssetKey = dataAssetKey;
            return this;
        }

        /**
         * @param dataAssetKey Unique data asset key.
         * 
         * @return builder
         * 
         */
        public Builder dataAssetKey(String dataAssetKey) {
            return dataAssetKey(Output.of(dataAssetKey));
        }

        /**
         * @param description (Updatable) A description of the connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) A description of the connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) A user-friendly display name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly display name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param encProperties (Updatable) A map of maps that contains the encrypted values for sensitive properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. To determine the set of optional and required properties for a connection type, a query can be done on &#39;/types?type=connection&#39; that returns a collection of all connection types. The appropriate connection type, which will include definitions of all of it&#39;s properties, can be identified from this collection. Example: `{&#34;encProperties&#34;: { &#34;default&#34;: { &#34;password&#34;: &#34;example-password&#34;}}}`
         * 
         * @return builder
         * 
         */
        public Builder encProperties(@Nullable Output<Map<String,Object>> encProperties) {
            $.encProperties = encProperties;
            return this;
        }

        /**
         * @param encProperties (Updatable) A map of maps that contains the encrypted values for sensitive properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. To determine the set of optional and required properties for a connection type, a query can be done on &#39;/types?type=connection&#39; that returns a collection of all connection types. The appropriate connection type, which will include definitions of all of it&#39;s properties, can be identified from this collection. Example: `{&#34;encProperties&#34;: { &#34;default&#34;: { &#34;password&#34;: &#34;example-password&#34;}}}`
         * 
         * @return builder
         * 
         */
        public Builder encProperties(Map<String,Object> encProperties) {
            return encProperties(Output.of(encProperties));
        }

        /**
         * @param isDefault (Updatable) Indicates whether this connection is the default connection. The first connection of a data asset defaults to being the default, subsequent connections default to not being the default. If a default connection already exists, then trying to create a connection as the default will fail. In this case the default connection would need to be updated not to be the default and then the new connection can then be created as the default.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault (Updatable) Indicates whether this connection is the default connection. The first connection of a data asset defaults to being the default, subsequent connections default to not being the default. If a default connection already exists, then trying to create a connection as the default will fail. In this case the default connection would need to be updated not to be the default and then the new connection can then be created as the default.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param properties A map of maps that contains the properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. Example: `{&#34;properties&#34;: { &#34;default&#34;: { &#34;username&#34;: &#34;user1&#34;}}}`
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A map of maps that contains the properties which are specific to the connection type. Each connection type definition defines it&#39;s set of required and optional properties. The map keys are category names and the values are maps of property name to property value. Every property is contained inside of a category. Most connections have required properties within the &#34;default&#34; category. Example: `{&#34;properties&#34;: { &#34;default&#34;: { &#34;username&#34;: &#34;user1&#34;}}}`
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param typeKey The key of the object type. Type key&#39;s can be found via the &#39;/types&#39; endpoint.
         * 
         * @return builder
         * 
         */
        public Builder typeKey(Output<String> typeKey) {
            $.typeKey = typeKey;
            return this;
        }

        /**
         * @param typeKey The key of the object type. Type key&#39;s can be found via the &#39;/types&#39; endpoint.
         * 
         * @return builder
         * 
         */
        public Builder typeKey(String typeKey) {
            return typeKey(Output.of(typeKey));
        }

        public ConnectionArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.dataAssetKey = Objects.requireNonNull($.dataAssetKey, "expected parameter 'dataAssetKey' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.typeKey = Objects.requireNonNull($.typeKey, "expected parameter 'typeKey' to be non-null");
            return $;
        }
    }

}
