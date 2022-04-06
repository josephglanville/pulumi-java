// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.aws.apigateway.outputs.GetRestApiEndpointConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRestApiResult {
    /**
     * The source of the API key for requests.
     * 
     */
    private final String apiKeySource;
    /**
     * The ARN of the REST API.
     * 
     */
    private final String arn;
    /**
     * The list of binary media types supported by the REST API.
     * 
     */
    private final List<String> binaryMediaTypes;
    /**
     * The description of the REST API.
     * 
     */
    private final String description;
    /**
     * The endpoint configuration of this RestApi showing the endpoint types of the API.
     * 
     */
    private final List<GetRestApiEndpointConfiguration> endpointConfigurations;
    /**
     * The execution ARN part to be used in `lambda_permission`'s `source_arn` when allowing API Gateway to invoke a Lambda function, e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
     * 
     */
    private final String executionArn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Minimum response size to compress for the REST API.
     * 
     */
    private final Integer minimumCompressionSize;
    private final String name;
    /**
     * JSON formatted policy document that controls access to the API Gateway.
     * 
     */
    private final String policy;
    /**
     * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
     * 
     */
    private final String rootResourceId;
    /**
     * Key-value map of resource tags.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetRestApiResult(
        @CustomType.Parameter("apiKeySource") String apiKeySource,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("binaryMediaTypes") List<String> binaryMediaTypes,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endpointConfigurations") List<GetRestApiEndpointConfiguration> endpointConfigurations,
        @CustomType.Parameter("executionArn") String executionArn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("minimumCompressionSize") Integer minimumCompressionSize,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") String policy,
        @CustomType.Parameter("rootResourceId") String rootResourceId,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.apiKeySource = apiKeySource;
        this.arn = arn;
        this.binaryMediaTypes = binaryMediaTypes;
        this.description = description;
        this.endpointConfigurations = endpointConfigurations;
        this.executionArn = executionArn;
        this.id = id;
        this.minimumCompressionSize = minimumCompressionSize;
        this.name = name;
        this.policy = policy;
        this.rootResourceId = rootResourceId;
        this.tags = tags;
    }

    /**
     * The source of the API key for requests.
     * 
    */
    public String getApiKeySource() {
        return this.apiKeySource;
    }
    /**
     * The ARN of the REST API.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The list of binary media types supported by the REST API.
     * 
    */
    public List<String> getBinaryMediaTypes() {
        return this.binaryMediaTypes;
    }
    /**
     * The description of the REST API.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The endpoint configuration of this RestApi showing the endpoint types of the API.
     * 
    */
    public List<GetRestApiEndpointConfiguration> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }
    /**
     * The execution ARN part to be used in `lambda_permission`'s `source_arn` when allowing API Gateway to invoke a Lambda function, e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
     * 
    */
    public String getExecutionArn() {
        return this.executionArn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Minimum response size to compress for the REST API.
     * 
    */
    public Integer getMinimumCompressionSize() {
        return this.minimumCompressionSize;
    }
    public String getName() {
        return this.name;
    }
    /**
     * JSON formatted policy document that controls access to the API Gateway.
     * 
    */
    public String getPolicy() {
        return this.policy;
    }
    /**
     * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
     * 
    */
    public String getRootResourceId() {
        return this.rootResourceId;
    }
    /**
     * Key-value map of resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKeySource;
        private String arn;
        private List<String> binaryMediaTypes;
        private String description;
        private List<GetRestApiEndpointConfiguration> endpointConfigurations;
        private String executionArn;
        private String id;
        private Integer minimumCompressionSize;
        private String name;
        private String policy;
        private String rootResourceId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeySource = defaults.apiKeySource;
    	      this.arn = defaults.arn;
    	      this.binaryMediaTypes = defaults.binaryMediaTypes;
    	      this.description = defaults.description;
    	      this.endpointConfigurations = defaults.endpointConfigurations;
    	      this.executionArn = defaults.executionArn;
    	      this.id = defaults.id;
    	      this.minimumCompressionSize = defaults.minimumCompressionSize;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.rootResourceId = defaults.rootResourceId;
    	      this.tags = defaults.tags;
        }

        public Builder apiKeySource(String apiKeySource) {
            this.apiKeySource = Objects.requireNonNull(apiKeySource);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder binaryMediaTypes(List<String> binaryMediaTypes) {
            this.binaryMediaTypes = Objects.requireNonNull(binaryMediaTypes);
            return this;
        }
        public Builder binaryMediaTypes(String... binaryMediaTypes) {
            return binaryMediaTypes(List.of(binaryMediaTypes));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endpointConfigurations(List<GetRestApiEndpointConfiguration> endpointConfigurations) {
            this.endpointConfigurations = Objects.requireNonNull(endpointConfigurations);
            return this;
        }
        public Builder endpointConfigurations(GetRestApiEndpointConfiguration... endpointConfigurations) {
            return endpointConfigurations(List.of(endpointConfigurations));
        }
        public Builder executionArn(String executionArn) {
            this.executionArn = Objects.requireNonNull(executionArn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder minimumCompressionSize(Integer minimumCompressionSize) {
            this.minimumCompressionSize = Objects.requireNonNull(minimumCompressionSize);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder rootResourceId(String rootResourceId) {
            this.rootResourceId = Objects.requireNonNull(rootResourceId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetRestApiResult build() {
            return new GetRestApiResult(apiKeySource, arn, binaryMediaTypes, description, endpointConfigurations, executionArn, id, minimumCompressionSize, name, policy, rootResourceId, tags);
        }
    }
}