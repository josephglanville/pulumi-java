// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1CredentialResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppResult {
    /**
     * List of API products associated with the developer app.
     * 
     */
    private final List<String> apiProducts;
    /**
     * Developer app family.
     * 
     */
    private final String appFamily;
    /**
     * ID of the developer app.
     * 
     */
    private final String appId;
    /**
     * List of attributes for the developer app.
     * 
     */
    private final List<GoogleCloudApigeeV1AttributeResponse> attributes;
    /**
     * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to developer apps.
     * 
     */
    private final String callbackUrl;
    /**
     * Time the developer app was created in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * Set of credentials for the developer app consisting of the consumer key/secret pairs associated with the API products.
     * 
     */
    private final List<GoogleCloudApigeeV1CredentialResponse> credentials;
    /**
     * ID of the developer.
     * 
     */
    private final String developerId;
    /**
     * Expiration time, in milliseconds, for the consumer key that is generated for the developer app. If not set or left to the default value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
     * 
     */
    private final String keyExpiresIn;
    /**
     * Time the developer app was modified in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Name of the developer app.
     * 
     */
    private final String name;
    /**
     * Scopes to apply to the developer app. The specified scopes must already exist for the API product that you associate with the developer app.
     * 
     */
    private final List<String> scopes;
    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetAppResult(
        @CustomType.Parameter("apiProducts") List<String> apiProducts,
        @CustomType.Parameter("appFamily") String appFamily,
        @CustomType.Parameter("appId") String appId,
        @CustomType.Parameter("attributes") List<GoogleCloudApigeeV1AttributeResponse> attributes,
        @CustomType.Parameter("callbackUrl") String callbackUrl,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("credentials") List<GoogleCloudApigeeV1CredentialResponse> credentials,
        @CustomType.Parameter("developerId") String developerId,
        @CustomType.Parameter("keyExpiresIn") String keyExpiresIn,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scopes") List<String> scopes,
        @CustomType.Parameter("status") String status) {
        this.apiProducts = apiProducts;
        this.appFamily = appFamily;
        this.appId = appId;
        this.attributes = attributes;
        this.callbackUrl = callbackUrl;
        this.createdAt = createdAt;
        this.credentials = credentials;
        this.developerId = developerId;
        this.keyExpiresIn = keyExpiresIn;
        this.lastModifiedAt = lastModifiedAt;
        this.name = name;
        this.scopes = scopes;
        this.status = status;
    }

    /**
     * List of API products associated with the developer app.
     * 
    */
    public List<String> getApiProducts() {
        return this.apiProducts;
    }
    /**
     * Developer app family.
     * 
    */
    public String getAppFamily() {
        return this.appFamily;
    }
    /**
     * ID of the developer app.
     * 
    */
    public String getAppId() {
        return this.appId;
    }
    /**
     * List of attributes for the developer app.
     * 
    */
    public List<GoogleCloudApigeeV1AttributeResponse> getAttributes() {
        return this.attributes;
    }
    /**
     * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to developer apps.
     * 
    */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    /**
     * Time the developer app was created in milliseconds since epoch.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Set of credentials for the developer app consisting of the consumer key/secret pairs associated with the API products.
     * 
    */
    public List<GoogleCloudApigeeV1CredentialResponse> getCredentials() {
        return this.credentials;
    }
    /**
     * ID of the developer.
     * 
    */
    public String getDeveloperId() {
        return this.developerId;
    }
    /**
     * Expiration time, in milliseconds, for the consumer key that is generated for the developer app. If not set or left to the default value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
     * 
    */
    public String getKeyExpiresIn() {
        return this.keyExpiresIn;
    }
    /**
     * Time the developer app was modified in milliseconds since epoch.
     * 
    */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the developer app.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Scopes to apply to the developer app. The specified scopes must already exist for the API product that you associate with the developer app.
     * 
    */
    public List<String> getScopes() {
        return this.scopes;
    }
    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> apiProducts;
        private String appFamily;
        private String appId;
        private List<GoogleCloudApigeeV1AttributeResponse> attributes;
        private String callbackUrl;
        private String createdAt;
        private List<GoogleCloudApigeeV1CredentialResponse> credentials;
        private String developerId;
        private String keyExpiresIn;
        private String lastModifiedAt;
        private String name;
        private List<String> scopes;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProducts = defaults.apiProducts;
    	      this.appFamily = defaults.appFamily;
    	      this.appId = defaults.appId;
    	      this.attributes = defaults.attributes;
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.createdAt = defaults.createdAt;
    	      this.credentials = defaults.credentials;
    	      this.developerId = defaults.developerId;
    	      this.keyExpiresIn = defaults.keyExpiresIn;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.scopes = defaults.scopes;
    	      this.status = defaults.status;
        }

        public Builder apiProducts(List<String> apiProducts) {
            this.apiProducts = Objects.requireNonNull(apiProducts);
            return this;
        }
        public Builder apiProducts(String... apiProducts) {
            return apiProducts(List.of(apiProducts));
        }
        public Builder appFamily(String appFamily) {
            this.appFamily = Objects.requireNonNull(appFamily);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder attributes(List<GoogleCloudApigeeV1AttributeResponse> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(GoogleCloudApigeeV1AttributeResponse... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder credentials(List<GoogleCloudApigeeV1CredentialResponse> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        public Builder credentials(GoogleCloudApigeeV1CredentialResponse... credentials) {
            return credentials(List.of(credentials));
        }
        public Builder developerId(String developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }
        public Builder keyExpiresIn(String keyExpiresIn) {
            this.keyExpiresIn = Objects.requireNonNull(keyExpiresIn);
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetAppResult build() {
            return new GetAppResult(apiProducts, appFamily, appId, attributes, callbackUrl, createdAt, credentials, developerId, keyExpiresIn, lastModifiedAt, name, scopes, status);
        }
    }
}
