// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.vision_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetProductSetResult {
    private final String displayName;
    private final StatusResponse indexError;
    private final String indexTime;
    private final String name;

    @OutputCustomType.Constructor({"displayName","indexError","indexTime","name"})
    private GetProductSetResult(
        String displayName,
        StatusResponse indexError,
        String indexTime,
        String name) {
        this.displayName = Objects.requireNonNull(displayName);
        this.indexError = Objects.requireNonNull(indexError);
        this.indexTime = Objects.requireNonNull(indexTime);
        this.name = Objects.requireNonNull(name);
    }

    public String getDisplayName() {
        return this.displayName;
    }
    public StatusResponse getIndexError() {
        return this.indexError;
    }
    public String getIndexTime() {
        return this.indexTime;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private StatusResponse indexError;
        private String indexTime;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.indexError = defaults.indexError;
    	      this.indexTime = defaults.indexTime;
    	      this.name = defaults.name;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setIndexError(StatusResponse indexError) {
            this.indexError = Objects.requireNonNull(indexError);
            return this;
        }

        public Builder setIndexTime(String indexTime) {
            this.indexTime = Objects.requireNonNull(indexTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GetProductSetResult build() {
            return new GetProductSetResult(displayName, indexError, indexTime, name);
        }
    }
}