// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ManagedIntegrationRuntimeResponse;
import io.pulumi.azurenative.datafactory.outputs.SelfHostedIntegrationRuntimeResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetIntegrationRuntimeResult {
    private final String etag;
    private final String id;
    private final String name;
    private final Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","properties","type"})
    private GetIntegrationRuntimeResult(
        String etag,
        String id,
        String name,
        Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> getProperties() {
        return this.properties;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIntegrationRuntimeResult build() {
            return new GetIntegrationRuntimeResult(etag, id, name, properties, type);
        }
    }
}
