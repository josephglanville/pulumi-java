// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datastream_v1.outputs.OracleRdbmsResponse;
import java.util.Objects;

@CustomType
public final class OracleSourceConfigResponse {
    /**
     * Oracle objects to exclude from the stream.
     * 
     */
    private final OracleRdbmsResponse excludeObjects;
    /**
     * Oracle objects to include in the stream.
     * 
     */
    private final OracleRdbmsResponse includeObjects;

    @CustomType.Constructor
    private OracleSourceConfigResponse(
        @CustomType.Parameter("excludeObjects") OracleRdbmsResponse excludeObjects,
        @CustomType.Parameter("includeObjects") OracleRdbmsResponse includeObjects) {
        this.excludeObjects = excludeObjects;
        this.includeObjects = includeObjects;
    }

    /**
     * Oracle objects to exclude from the stream.
     * 
    */
    public OracleRdbmsResponse getExcludeObjects() {
        return this.excludeObjects;
    }
    /**
     * Oracle objects to include in the stream.
     * 
    */
    public OracleRdbmsResponse getIncludeObjects() {
        return this.includeObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleRdbmsResponse excludeObjects;
        private OracleRdbmsResponse includeObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeObjects = defaults.excludeObjects;
    	      this.includeObjects = defaults.includeObjects;
        }

        public Builder excludeObjects(OracleRdbmsResponse excludeObjects) {
            this.excludeObjects = Objects.requireNonNull(excludeObjects);
            return this;
        }
        public Builder includeObjects(OracleRdbmsResponse includeObjects) {
            this.includeObjects = Objects.requireNonNull(includeObjects);
            return this;
        }        public OracleSourceConfigResponse build() {
            return new OracleSourceConfigResponse(excludeObjects, includeObjects);
        }
    }
}
