// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.WebActivityAuthenticationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebActivityResponse {
    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    private final @Nullable WebActivityAuthenticationResponse authentication;
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object body;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * List of datasets passed to web endpoint.
     * 
     */
    private final @Nullable List<DatasetReferenceResponse> datasets;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object headers;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * List of linked services passed to web endpoint.
     * 
     */
    private final @Nullable List<LinkedServiceReferenceResponse> linkedServices;
    /**
     * Rest API method for target endpoint.
     * 
     */
    private final String method;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Type of activity.
     * Expected value is 'WebActivity'.
     * 
     */
    private final String type;
    /**
     * Web activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object url;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private WebActivityResponse(
        @CustomType.Parameter("authentication") @Nullable WebActivityAuthenticationResponse authentication,
        @CustomType.Parameter("body") @Nullable Object body,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("datasets") @Nullable List<DatasetReferenceResponse> datasets,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("headers") @Nullable Object headers,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("linkedServices") @Nullable List<LinkedServiceReferenceResponse> linkedServices,
        @CustomType.Parameter("method") String method,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") Object url,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.connectVia = connectVia;
        this.datasets = datasets;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.linkedServiceName = linkedServiceName;
        this.linkedServices = linkedServices;
        this.method = method;
        this.name = name;
        this.policy = policy;
        this.type = type;
        this.url = url;
        this.userProperties = userProperties;
    }

    /**
     * Authentication method used for calling the endpoint.
     * 
    */
    public Optional<WebActivityAuthenticationResponse> getAuthentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * List of datasets passed to web endpoint.
     * 
    */
    public List<DatasetReferenceResponse> getDatasets() {
        return this.datasets == null ? List.of() : this.datasets;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getHeaders() {
        return Optional.ofNullable(this.headers);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * List of linked services passed to web endpoint.
     * 
    */
    public List<LinkedServiceReferenceResponse> getLinkedServices() {
        return this.linkedServices == null ? List.of() : this.linkedServices;
    }
    /**
     * Rest API method for target endpoint.
     * 
    */
    public String getMethod() {
        return this.method;
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Type of activity.
     * Expected value is 'WebActivity'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Web activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
    */
    public Object getUrl() {
        return this.url;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebActivityAuthenticationResponse authentication;
        private @Nullable Object body;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable List<DatasetReferenceResponse> datasets;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object headers;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable List<LinkedServiceReferenceResponse> linkedServices;
        private String method;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private Object url;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.connectVia = defaults.connectVia;
    	      this.datasets = defaults.datasets;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.linkedServices = defaults.linkedServices;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder authentication(@Nullable WebActivityAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder body(@Nullable Object body) {
            this.body = body;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder datasets(@Nullable List<DatasetReferenceResponse> datasets) {
            this.datasets = datasets;
            return this;
        }
        public Builder datasets(DatasetReferenceResponse... datasets) {
            return datasets(List.of(datasets));
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder headers(@Nullable Object headers) {
            this.headers = headers;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder linkedServices(@Nullable List<LinkedServiceReferenceResponse> linkedServices) {
            this.linkedServices = linkedServices;
            return this;
        }
        public Builder linkedServices(LinkedServiceReferenceResponse... linkedServices) {
            return linkedServices(List.of(linkedServices));
        }
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public WebActivityResponse build() {
            return new WebActivityResponse(authentication, body, connectVia, datasets, dependsOn, description, headers, linkedServiceName, linkedServices, method, name, policy, type, url, userProperties);
        }
    }
}
