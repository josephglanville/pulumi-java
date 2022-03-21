// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.run_v1.outputs.DomainMappingSpecResponse;
import io.pulumi.googlenative.run_v1.outputs.DomainMappingStatusResponse;
import io.pulumi.googlenative.run_v1.outputs.ObjectMetaResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainMappingResult {
    /**
     * The API version for this call such as "domains.cloudrun.com/v1".
     * 
     */
    private final String apiVersion;
    /**
     * The kind of resource, in this case "DomainMapping".
     * 
     */
    private final String kind;
    /**
     * Metadata associated with this BuildTemplate.
     * 
     */
    private final ObjectMetaResponse metadata;
    /**
     * The spec for this DomainMapping.
     * 
     */
    private final DomainMappingSpecResponse spec;
    /**
     * The current status of the DomainMapping.
     * 
     */
    private final DomainMappingStatusResponse status;

    @CustomType.Constructor
    private GetDomainMappingResult(
        @CustomType.Parameter("apiVersion") String apiVersion,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("metadata") ObjectMetaResponse metadata,
        @CustomType.Parameter("spec") DomainMappingSpecResponse spec,
        @CustomType.Parameter("status") DomainMappingStatusResponse status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * The API version for this call such as "domains.cloudrun.com/v1".
     * 
    */
    public String getApiVersion() {
        return this.apiVersion;
    }
    /**
     * The kind of resource, in this case "DomainMapping".
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Metadata associated with this BuildTemplate.
     * 
    */
    public ObjectMetaResponse getMetadata() {
        return this.metadata;
    }
    /**
     * The spec for this DomainMapping.
     * 
    */
    public DomainMappingSpecResponse getSpec() {
        return this.spec;
    }
    /**
     * The current status of the DomainMapping.
     * 
    */
    public DomainMappingStatusResponse getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private String kind;
        private ObjectMetaResponse metadata;
        private DomainMappingSpecResponse spec;
        private DomainMappingStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder metadata(ObjectMetaResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder spec(DomainMappingSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder status(DomainMappingStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetDomainMappingResult build() {
            return new GetDomainMappingResult(apiVersion, kind, metadata, spec, status);
        }
    }
}
