// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DocumentationPartArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentationPartArgs Empty = new DocumentationPartArgs();

    /**
     * The location of the targeted API entity of the to-be-created documentation part. See below.
     * 
     */
    @Import(name="location", required=true)
      private final Output<DocumentationPartLocationArgs> location;

    public Output<DocumentationPartLocationArgs> getLocation() {
        return this.location;
    }

    /**
     * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<String> properties;

    public Output<String> getProperties() {
        return this.properties;
    }

    /**
     * The ID of the associated Rest API
     * 
     */
    @Import(name="restApiId", required=true)
      private final Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId;
    }

    public DocumentationPartArgs(
        Output<DocumentationPartLocationArgs> location,
        Output<String> properties,
        Output<String> restApiId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private DocumentationPartArgs() {
        this.location = Output.empty();
        this.properties = Output.empty();
        this.restApiId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationPartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DocumentationPartLocationArgs> location;
        private Output<String> properties;
        private Output<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationPartArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder location(Output<DocumentationPartLocationArgs> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(DocumentationPartLocationArgs location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder properties(Output<String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(String properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder restApiId(Output<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Output.of(Objects.requireNonNull(restApiId));
            return this;
        }        public DocumentationPartArgs build() {
            return new DocumentationPartArgs(location, properties, restApiId);
        }
    }
}
