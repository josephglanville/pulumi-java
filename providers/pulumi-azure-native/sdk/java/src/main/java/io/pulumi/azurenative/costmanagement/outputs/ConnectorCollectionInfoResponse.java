// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ConnectorCollectionErrorInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorCollectionInfoResponse {
    private final @Nullable ConnectorCollectionErrorInfoResponse error;
    private final String lastChecked;
    private final String lastUpdated;
    private final String sourceLastUpdated;

    @OutputCustomType.Constructor({"error","lastChecked","lastUpdated","sourceLastUpdated"})
    private ConnectorCollectionInfoResponse(
        @Nullable ConnectorCollectionErrorInfoResponse error,
        String lastChecked,
        String lastUpdated,
        String sourceLastUpdated) {
        this.error = error;
        this.lastChecked = Objects.requireNonNull(lastChecked);
        this.lastUpdated = Objects.requireNonNull(lastUpdated);
        this.sourceLastUpdated = Objects.requireNonNull(sourceLastUpdated);
    }

    public Optional<ConnectorCollectionErrorInfoResponse> getError() {
        return Optional.ofNullable(this.error);
    }
    public String getLastChecked() {
        return this.lastChecked;
    }
    public String getLastUpdated() {
        return this.lastUpdated;
    }
    public String getSourceLastUpdated() {
        return this.sourceLastUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCollectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorCollectionErrorInfoResponse error;
        private String lastChecked;
        private String lastUpdated;
        private String sourceLastUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCollectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.lastChecked = defaults.lastChecked;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.sourceLastUpdated = defaults.sourceLastUpdated;
        }

        public Builder setError(@Nullable ConnectorCollectionErrorInfoResponse error) {
            this.error = error;
            return this;
        }

        public Builder setLastChecked(String lastChecked) {
            this.lastChecked = Objects.requireNonNull(lastChecked);
            return this;
        }

        public Builder setLastUpdated(String lastUpdated) {
            this.lastUpdated = Objects.requireNonNull(lastUpdated);
            return this;
        }

        public Builder setSourceLastUpdated(String sourceLastUpdated) {
            this.sourceLastUpdated = Objects.requireNonNull(sourceLastUpdated);
            return this;
        }

        public ConnectorCollectionInfoResponse build() {
            return new ConnectorCollectionInfoResponse(error, lastChecked, lastUpdated, sourceLastUpdated);
        }
    }
}
