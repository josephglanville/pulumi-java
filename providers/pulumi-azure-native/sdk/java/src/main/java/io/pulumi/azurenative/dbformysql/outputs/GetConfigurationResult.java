// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConfigurationResult {
    /**
     * Allowed values of the configuration.
     * 
     */
    private final String allowedValues;
    /**
     * Data type of the configuration.
     * 
     */
    private final String dataType;
    /**
     * Default value of the configuration.
     * 
     */
    private final String defaultValue;
    /**
     * Description of the configuration.
     * 
     */
    private final String description;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Source of the configuration.
     * 
     */
    private final @Nullable String source;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Value of the configuration.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GetConfigurationResult(
        @CustomType.Parameter("allowedValues") String allowedValues,
        @CustomType.Parameter("dataType") String dataType,
        @CustomType.Parameter("defaultValue") String defaultValue,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.allowedValues = allowedValues;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.id = id;
        this.name = name;
        this.source = source;
        this.type = type;
        this.value = value;
    }

    /**
     * Allowed values of the configuration.
     * 
    */
    public String getAllowedValues() {
        return this.allowedValues;
    }
    /**
     * Data type of the configuration.
     * 
    */
    public String getDataType() {
        return this.dataType;
    }
    /**
     * Default value of the configuration.
     * 
    */
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Description of the configuration.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Source of the configuration.
     * 
    */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Value of the configuration.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allowedValues;
        private String dataType;
        private String defaultValue;
        private String description;
        private String id;
        private String name;
        private @Nullable String source;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder allowedValues(String allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }
        public Builder dataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GetConfigurationResult build() {
            return new GetConfigurationResult(allowedValues, dataType, defaultValue, description, id, name, source, type, value);
        }
    }
}
