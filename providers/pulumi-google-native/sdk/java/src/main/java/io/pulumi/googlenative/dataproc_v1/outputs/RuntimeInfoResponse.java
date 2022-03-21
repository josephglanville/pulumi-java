// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RuntimeInfoResponse {
    /**
     * A URI pointing to the location of the diagnostics tarball.
     * 
     */
    private final String diagnosticOutputUri;
    /**
     * Map of remote access endpoints (such as web interfaces and APIs) to their URIs.
     * 
     */
    private final Map<String,String> endpoints;
    /**
     * A URI pointing to the location of the stdout and stderr of the workload.
     * 
     */
    private final String outputUri;

    @CustomType.Constructor
    private RuntimeInfoResponse(
        @CustomType.Parameter("diagnosticOutputUri") String diagnosticOutputUri,
        @CustomType.Parameter("endpoints") Map<String,String> endpoints,
        @CustomType.Parameter("outputUri") String outputUri) {
        this.diagnosticOutputUri = diagnosticOutputUri;
        this.endpoints = endpoints;
        this.outputUri = outputUri;
    }

    /**
     * A URI pointing to the location of the diagnostics tarball.
     * 
    */
    public String getDiagnosticOutputUri() {
        return this.diagnosticOutputUri;
    }
    /**
     * Map of remote access endpoints (such as web interfaces and APIs) to their URIs.
     * 
    */
    public Map<String,String> getEndpoints() {
        return this.endpoints;
    }
    /**
     * A URI pointing to the location of the stdout and stderr of the workload.
     * 
    */
    public String getOutputUri() {
        return this.outputUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diagnosticOutputUri;
        private Map<String,String> endpoints;
        private String outputUri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnosticOutputUri = defaults.diagnosticOutputUri;
    	      this.endpoints = defaults.endpoints;
    	      this.outputUri = defaults.outputUri;
        }

        public Builder diagnosticOutputUri(String diagnosticOutputUri) {
            this.diagnosticOutputUri = Objects.requireNonNull(diagnosticOutputUri);
            return this;
        }
        public Builder endpoints(Map<String,String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder outputUri(String outputUri) {
            this.outputUri = Objects.requireNonNull(outputUri);
            return this;
        }        public RuntimeInfoResponse build() {
            return new RuntimeInfoResponse(diagnosticOutputUri, endpoints, outputUri);
        }
    }
}
