// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * List of API products associated with the developer app.
     * 
     */
    @Import(name="apiProducts")
      private final @Nullable Output<List<String>> apiProducts;

    public Output<List<String>> getApiProducts() {
        return this.apiProducts == null ? Output.empty() : this.apiProducts;
    }

    /**
     * Developer app family.
     * 
     */
    @Import(name="appFamily")
      private final @Nullable Output<String> appFamily;

    public Output<String> getAppFamily() {
        return this.appFamily == null ? Output.empty() : this.appFamily;
    }

    /**
     * ID of the developer app.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Output.empty() : this.appId;
    }

    /**
     * List of attributes for the developer app.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes;

    public Output<List<GoogleCloudApigeeV1AttributeArgs>> getAttributes() {
        return this.attributes == null ? Output.empty() : this.attributes;
    }

    /**
     * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to developer apps.
     * 
     */
    @Import(name="callbackUrl")
      private final @Nullable Output<String> callbackUrl;

    public Output<String> getCallbackUrl() {
        return this.callbackUrl == null ? Output.empty() : this.callbackUrl;
    }

    /**
     * ID of the developer.
     * 
     */
    @Import(name="developerId", required=true)
      private final Output<String> developerId;

    public Output<String> getDeveloperId() {
        return this.developerId;
    }

    /**
     * Expiration time, in milliseconds, for the consumer key that is generated for the developer app. If not set or left to the default value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
     * 
     */
    @Import(name="keyExpiresIn")
      private final @Nullable Output<String> keyExpiresIn;

    public Output<String> getKeyExpiresIn() {
        return this.keyExpiresIn == null ? Output.empty() : this.keyExpiresIn;
    }

    /**
     * Name of the developer app.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Scopes to apply to the developer app. The specified scopes must already exist for the API product that you associate with the developer app.
     * 
     */
    @Import(name="scopes")
      private final @Nullable Output<List<String>> scopes;

    public Output<List<String>> getScopes() {
        return this.scopes == null ? Output.empty() : this.scopes;
    }

    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public AppArgs(
        @Nullable Output<List<String>> apiProducts,
        @Nullable Output<String> appFamily,
        @Nullable Output<String> appId,
        @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes,
        @Nullable Output<String> callbackUrl,
        Output<String> developerId,
        @Nullable Output<String> keyExpiresIn,
        @Nullable Output<String> name,
        Output<String> organizationId,
        @Nullable Output<List<String>> scopes,
        @Nullable Output<String> status) {
        this.apiProducts = apiProducts;
        this.appFamily = appFamily;
        this.appId = appId;
        this.attributes = attributes;
        this.callbackUrl = callbackUrl;
        this.developerId = Objects.requireNonNull(developerId, "expected parameter 'developerId' to be non-null");
        this.keyExpiresIn = keyExpiresIn;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.scopes = scopes;
        this.status = status;
    }

    private AppArgs() {
        this.apiProducts = Output.empty();
        this.appFamily = Output.empty();
        this.appId = Output.empty();
        this.attributes = Output.empty();
        this.callbackUrl = Output.empty();
        this.developerId = Output.empty();
        this.keyExpiresIn = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
        this.scopes = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> apiProducts;
        private @Nullable Output<String> appFamily;
        private @Nullable Output<String> appId;
        private @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes;
        private @Nullable Output<String> callbackUrl;
        private Output<String> developerId;
        private @Nullable Output<String> keyExpiresIn;
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private @Nullable Output<List<String>> scopes;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProducts = defaults.apiProducts;
    	      this.appFamily = defaults.appFamily;
    	      this.appId = defaults.appId;
    	      this.attributes = defaults.attributes;
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.developerId = defaults.developerId;
    	      this.keyExpiresIn = defaults.keyExpiresIn;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.scopes = defaults.scopes;
    	      this.status = defaults.status;
        }

        public Builder apiProducts(@Nullable Output<List<String>> apiProducts) {
            this.apiProducts = apiProducts;
            return this;
        }
        public Builder apiProducts(@Nullable List<String> apiProducts) {
            this.apiProducts = Output.ofNullable(apiProducts);
            return this;
        }
        public Builder apiProducts(String... apiProducts) {
            return apiProducts(List.of(apiProducts));
        }
        public Builder appFamily(@Nullable Output<String> appFamily) {
            this.appFamily = appFamily;
            return this;
        }
        public Builder appFamily(@Nullable String appFamily) {
            this.appFamily = Output.ofNullable(appFamily);
            return this;
        }
        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }
        public Builder appId(@Nullable String appId) {
            this.appId = Output.ofNullable(appId);
            return this;
        }
        public Builder attributes(@Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable List<GoogleCloudApigeeV1AttributeArgs> attributes) {
            this.attributes = Output.ofNullable(attributes);
            return this;
        }
        public Builder attributes(GoogleCloudApigeeV1AttributeArgs... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder callbackUrl(@Nullable Output<String> callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public Builder callbackUrl(@Nullable String callbackUrl) {
            this.callbackUrl = Output.ofNullable(callbackUrl);
            return this;
        }
        public Builder developerId(Output<String> developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }
        public Builder developerId(String developerId) {
            this.developerId = Output.of(Objects.requireNonNull(developerId));
            return this;
        }
        public Builder keyExpiresIn(@Nullable Output<String> keyExpiresIn) {
            this.keyExpiresIn = keyExpiresIn;
            return this;
        }
        public Builder keyExpiresIn(@Nullable String keyExpiresIn) {
            this.keyExpiresIn = Output.ofNullable(keyExpiresIn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(@Nullable List<String> scopes) {
            this.scopes = Output.ofNullable(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public AppArgs build() {
            return new AppArgs(apiProducts, appFamily, appId, attributes, callbackUrl, developerId, keyExpiresIn, name, organizationId, scopes, status);
        }
    }
}
