// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Instructions for a labeling job.
 * 
 */
public final class LabelingJobInstructionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabelingJobInstructionsResponse Empty = new LabelingJobInstructionsResponse();

    /**
     * The link to a page with detailed labeling instructions for labelers.
     * 
     */
    @InputImport(name="uri")
      private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public LabelingJobInstructionsResponse(@Nullable String uri) {
        this.uri = uri;
    }

    private LabelingJobInstructionsResponse() {
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobInstructionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobInstructionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public LabelingJobInstructionsResponse build() {
            return new LabelingJobInstructionsResponse(uri);
        }
    }
}
