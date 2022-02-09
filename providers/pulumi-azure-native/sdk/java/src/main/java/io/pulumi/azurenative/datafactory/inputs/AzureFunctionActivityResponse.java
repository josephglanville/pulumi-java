// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFunctionActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFunctionActivityResponse Empty = new AzureFunctionActivityResponse();

    @InputImport(name="body")
    private final @Nullable Object body;

    public Optional<Object> getBody() {
        return this.body == null ? Optional.empty() : Optional.ofNullable(this.body);
    }

    @InputImport(name="dependsOn")
    private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="functionName", required=true)
    private final Object functionName;

    public Object getFunctionName() {
        return this.functionName;
    }

    @InputImport(name="headers")
    private final @Nullable Object headers;

    public Optional<Object> getHeaders() {
        return this.headers == null ? Optional.empty() : Optional.ofNullable(this.headers);
    }

    @InputImport(name="linkedServiceName")
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    @InputImport(name="method", required=true)
    private final String method;

    public String getMethod() {
        return this.method;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="policy")
    private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="userProperties")
    private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public AzureFunctionActivityResponse(
        @Nullable Object body,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        Object functionName,
        @Nullable Object headers,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String method,
        String name,
        @Nullable ActivityPolicyResponse policy,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.headers = headers;
        this.linkedServiceName = linkedServiceName;
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private AzureFunctionActivityResponse() {
        this.body = null;
        this.dependsOn = List.of();
        this.description = null;
        this.functionName = null;
        this.headers = null;
        this.linkedServiceName = null;
        this.method = null;
        this.name = null;
        this.policy = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object body;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private Object functionName;
        private @Nullable Object headers;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String method;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.functionName = defaults.functionName;
    	      this.headers = defaults.headers;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = body;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFunctionName(Object functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setHeaders(@Nullable Object headers) {
            this.headers = headers;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setMethod(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public AzureFunctionActivityResponse build() {
            return new AzureFunctionActivityResponse(body, dependsOn, description, functionName, headers, linkedServiceName, method, name, policy, type, userProperties);
        }
    }
}
