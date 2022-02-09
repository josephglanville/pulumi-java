// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ClusterJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterJobResponse Empty = new ClusterJobResponse();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="jobState", required=true)
    private final String jobState;

    public String getJobState() {
        return this.jobState;
    }

    @InputImport(name="streamingUnits", required=true)
    private final Integer streamingUnits;

    public Integer getStreamingUnits() {
        return this.streamingUnits;
    }

    public ClusterJobResponse(
        String id,
        String jobState,
        Integer streamingUnits) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.jobState = Objects.requireNonNull(jobState, "expected parameter 'jobState' to be non-null");
        this.streamingUnits = Objects.requireNonNull(streamingUnits, "expected parameter 'streamingUnits' to be non-null");
    }

    private ClusterJobResponse() {
        this.id = null;
        this.jobState = null;
        this.streamingUnits = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String jobState;
        private Integer streamingUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.jobState = defaults.jobState;
    	      this.streamingUnits = defaults.streamingUnits;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setJobState(String jobState) {
            this.jobState = Objects.requireNonNull(jobState);
            return this;
        }

        public Builder setStreamingUnits(Integer streamingUnits) {
            this.streamingUnits = Objects.requireNonNull(streamingUnits);
            return this;
        }

        public ClusterJobResponse build() {
            return new ClusterJobResponse(id, jobState, streamingUnits);
        }
    }
}
