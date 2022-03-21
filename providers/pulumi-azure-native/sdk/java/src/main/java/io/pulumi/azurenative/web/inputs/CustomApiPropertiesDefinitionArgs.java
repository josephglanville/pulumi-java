// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.ApiType;
import io.pulumi.azurenative.web.inputs.ApiResourceBackendServiceArgs;
import io.pulumi.azurenative.web.inputs.ApiResourceDefinitionsArgs;
import io.pulumi.azurenative.web.inputs.ConnectionParameterArgs;
import io.pulumi.azurenative.web.inputs.WsdlDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom API properties
 * 
 */
public final class CustomApiPropertiesDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomApiPropertiesDefinitionArgs Empty = new CustomApiPropertiesDefinitionArgs();

    /**
     * API Definitions
     * 
     */
    @Import(name="apiDefinitions")
      private final @Nullable Output<ApiResourceDefinitionsArgs> apiDefinitions;

    public Output<ApiResourceDefinitionsArgs> getApiDefinitions() {
        return this.apiDefinitions == null ? Output.empty() : this.apiDefinitions;
    }

    /**
     * The API type
     * 
     */
    @Import(name="apiType")
      private final @Nullable Output<Either<String,ApiType>> apiType;

    public Output<Either<String,ApiType>> getApiType() {
        return this.apiType == null ? Output.empty() : this.apiType;
    }

    /**
     * The API backend service
     * 
     */
    @Import(name="backendService")
      private final @Nullable Output<ApiResourceBackendServiceArgs> backendService;

    public Output<ApiResourceBackendServiceArgs> getBackendService() {
        return this.backendService == null ? Output.empty() : this.backendService;
    }

    /**
     * Brand color
     * 
     */
    @Import(name="brandColor")
      private final @Nullable Output<String> brandColor;

    public Output<String> getBrandColor() {
        return this.brandColor == null ? Output.empty() : this.brandColor;
    }

    /**
     * The custom API capabilities
     * 
     */
    @Import(name="capabilities")
      private final @Nullable Output<List<String>> capabilities;

    public Output<List<String>> getCapabilities() {
        return this.capabilities == null ? Output.empty() : this.capabilities;
    }

    /**
     * Connection parameters
     * 
     */
    @Import(name="connectionParameters")
      private final @Nullable Output<Map<String,ConnectionParameterArgs>> connectionParameters;

    public Output<Map<String,ConnectionParameterArgs>> getConnectionParameters() {
        return this.connectionParameters == null ? Output.empty() : this.connectionParameters;
    }

    /**
     * The custom API description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The display name
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The icon URI
     * 
     */
    @Import(name="iconUri")
      private final @Nullable Output<String> iconUri;

    public Output<String> getIconUri() {
        return this.iconUri == null ? Output.empty() : this.iconUri;
    }

    /**
     * Runtime URLs
     * 
     */
    @Import(name="runtimeUrls")
      private final @Nullable Output<List<String>> runtimeUrls;

    public Output<List<String>> getRuntimeUrls() {
        return this.runtimeUrls == null ? Output.empty() : this.runtimeUrls;
    }

    /**
     * The JSON representation of the swagger
     * 
     */
    @Import(name="swagger")
      private final @Nullable Output<Object> swagger;

    public Output<Object> getSwagger() {
        return this.swagger == null ? Output.empty() : this.swagger;
    }

    /**
     * The WSDL definition
     * 
     */
    @Import(name="wsdlDefinition")
      private final @Nullable Output<WsdlDefinitionArgs> wsdlDefinition;

    public Output<WsdlDefinitionArgs> getWsdlDefinition() {
        return this.wsdlDefinition == null ? Output.empty() : this.wsdlDefinition;
    }

    public CustomApiPropertiesDefinitionArgs(
        @Nullable Output<ApiResourceDefinitionsArgs> apiDefinitions,
        @Nullable Output<Either<String,ApiType>> apiType,
        @Nullable Output<ApiResourceBackendServiceArgs> backendService,
        @Nullable Output<String> brandColor,
        @Nullable Output<List<String>> capabilities,
        @Nullable Output<Map<String,ConnectionParameterArgs>> connectionParameters,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> iconUri,
        @Nullable Output<List<String>> runtimeUrls,
        @Nullable Output<Object> swagger,
        @Nullable Output<WsdlDefinitionArgs> wsdlDefinition) {
        this.apiDefinitions = apiDefinitions;
        this.apiType = apiType;
        this.backendService = backendService;
        this.brandColor = brandColor;
        this.capabilities = capabilities;
        this.connectionParameters = connectionParameters;
        this.description = description;
        this.displayName = displayName;
        this.iconUri = iconUri;
        this.runtimeUrls = runtimeUrls;
        this.swagger = swagger;
        this.wsdlDefinition = wsdlDefinition;
    }

    private CustomApiPropertiesDefinitionArgs() {
        this.apiDefinitions = Output.empty();
        this.apiType = Output.empty();
        this.backendService = Output.empty();
        this.brandColor = Output.empty();
        this.capabilities = Output.empty();
        this.connectionParameters = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.iconUri = Output.empty();
        this.runtimeUrls = Output.empty();
        this.swagger = Output.empty();
        this.wsdlDefinition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomApiPropertiesDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApiResourceDefinitionsArgs> apiDefinitions;
        private @Nullable Output<Either<String,ApiType>> apiType;
        private @Nullable Output<ApiResourceBackendServiceArgs> backendService;
        private @Nullable Output<String> brandColor;
        private @Nullable Output<List<String>> capabilities;
        private @Nullable Output<Map<String,ConnectionParameterArgs>> connectionParameters;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> iconUri;
        private @Nullable Output<List<String>> runtimeUrls;
        private @Nullable Output<Object> swagger;
        private @Nullable Output<WsdlDefinitionArgs> wsdlDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomApiPropertiesDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiDefinitions = defaults.apiDefinitions;
    	      this.apiType = defaults.apiType;
    	      this.backendService = defaults.backendService;
    	      this.brandColor = defaults.brandColor;
    	      this.capabilities = defaults.capabilities;
    	      this.connectionParameters = defaults.connectionParameters;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconUri = defaults.iconUri;
    	      this.runtimeUrls = defaults.runtimeUrls;
    	      this.swagger = defaults.swagger;
    	      this.wsdlDefinition = defaults.wsdlDefinition;
        }

        public Builder apiDefinitions(@Nullable Output<ApiResourceDefinitionsArgs> apiDefinitions) {
            this.apiDefinitions = apiDefinitions;
            return this;
        }
        public Builder apiDefinitions(@Nullable ApiResourceDefinitionsArgs apiDefinitions) {
            this.apiDefinitions = Output.ofNullable(apiDefinitions);
            return this;
        }
        public Builder apiType(@Nullable Output<Either<String,ApiType>> apiType) {
            this.apiType = apiType;
            return this;
        }
        public Builder apiType(@Nullable Either<String,ApiType> apiType) {
            this.apiType = Output.ofNullable(apiType);
            return this;
        }
        public Builder backendService(@Nullable Output<ApiResourceBackendServiceArgs> backendService) {
            this.backendService = backendService;
            return this;
        }
        public Builder backendService(@Nullable ApiResourceBackendServiceArgs backendService) {
            this.backendService = Output.ofNullable(backendService);
            return this;
        }
        public Builder brandColor(@Nullable Output<String> brandColor) {
            this.brandColor = brandColor;
            return this;
        }
        public Builder brandColor(@Nullable String brandColor) {
            this.brandColor = Output.ofNullable(brandColor);
            return this;
        }
        public Builder capabilities(@Nullable Output<List<String>> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(@Nullable List<String> capabilities) {
            this.capabilities = Output.ofNullable(capabilities);
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder connectionParameters(@Nullable Output<Map<String,ConnectionParameterArgs>> connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }
        public Builder connectionParameters(@Nullable Map<String,ConnectionParameterArgs> connectionParameters) {
            this.connectionParameters = Output.ofNullable(connectionParameters);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder iconUri(@Nullable Output<String> iconUri) {
            this.iconUri = iconUri;
            return this;
        }
        public Builder iconUri(@Nullable String iconUri) {
            this.iconUri = Output.ofNullable(iconUri);
            return this;
        }
        public Builder runtimeUrls(@Nullable Output<List<String>> runtimeUrls) {
            this.runtimeUrls = runtimeUrls;
            return this;
        }
        public Builder runtimeUrls(@Nullable List<String> runtimeUrls) {
            this.runtimeUrls = Output.ofNullable(runtimeUrls);
            return this;
        }
        public Builder runtimeUrls(String... runtimeUrls) {
            return runtimeUrls(List.of(runtimeUrls));
        }
        public Builder swagger(@Nullable Output<Object> swagger) {
            this.swagger = swagger;
            return this;
        }
        public Builder swagger(@Nullable Object swagger) {
            this.swagger = Output.ofNullable(swagger);
            return this;
        }
        public Builder wsdlDefinition(@Nullable Output<WsdlDefinitionArgs> wsdlDefinition) {
            this.wsdlDefinition = wsdlDefinition;
            return this;
        }
        public Builder wsdlDefinition(@Nullable WsdlDefinitionArgs wsdlDefinition) {
            this.wsdlDefinition = Output.ofNullable(wsdlDefinition);
            return this;
        }        public CustomApiPropertiesDefinitionArgs build() {
            return new CustomApiPropertiesDefinitionArgs(apiDefinitions, apiType, backendService, brandColor, capabilities, connectionParameters, description, displayName, iconUri, runtimeUrls, swagger, wsdlDefinition);
        }
    }
}
